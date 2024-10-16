package ecommerce.serviceTest;

import ecommerce.dto.CompraDTO;
import ecommerce.dto.DisponibilidadeDTO;
import ecommerce.dto.EstoqueBaixaDTO;
import ecommerce.dto.PagamentoDTO;
import ecommerce.entity.*;
import ecommerce.external.IEstoqueExternal;
import ecommerce.external.IPagamentoExternal;
import ecommerce.service.CarrinhoDeComprasService;
import ecommerce.service.ClienteService;
import ecommerce.service.CompraService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class CompraServiceTestGPT {

    @Mock
    private CarrinhoDeComprasService carrinhoService;

    @Mock
    private ClienteService clienteService;

    @Mock
    private IEstoqueExternal estoqueExternal;

    @Mock
    private IPagamentoExternal pagamentoExternal;

    @InjectMocks
    private CompraService compraService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void finalizarCompra_ComSucesso() {
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setTipo(TipoCliente.BRONZE);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.setCliente(cliente);
        carrinho.setItens(Arrays.asList(createItemCompra(1L, BigDecimal.valueOf(100), 2, 3)));

        when(clienteService.buscarPorId(anyLong())).thenReturn(cliente);
        when(carrinhoService.buscarPorCarrinhoIdEClienteId(anyLong(), any(Cliente.class))).thenReturn(carrinho);

        when(estoqueExternal.verificarDisponibilidade(anyList(), anyList()))
                .thenReturn(new DisponibilidadeDTO(true, List.of()));

        when(pagamentoExternal.autorizarPagamento(anyLong(), anyDouble()))
                .thenReturn(new PagamentoDTO(true, 123L));

        when(estoqueExternal.darBaixa(anyList(), anyList())).thenReturn(new EstoqueBaixaDTO(true));

        CompraDTO resultado = compraService.finalizarCompra(1L, 1L);

        assertTrue(resultado.sucesso());
        assertEquals(123L, resultado.transacaoPagamentoId());
        verify(pagamentoExternal, never()).cancelarPagamento(anyLong(), anyLong());
    }

    @Test
    public void finalizarCompra_EstoqueIndisponivel() {
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setTipo(TipoCliente.BRONZE);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.setCliente(cliente);
        carrinho.setItens(Arrays.asList(createItemCompra(1L, BigDecimal.valueOf(100), 2, 3)));

        when(clienteService.buscarPorId(anyLong())).thenReturn(cliente);
        when(carrinhoService.buscarPorCarrinhoIdEClienteId(anyLong(), any(Cliente.class))).thenReturn(carrinho);

        when(estoqueExternal.verificarDisponibilidade(anyList(), anyList()))
                .thenReturn(new DisponibilidadeDTO(false, List.of(1L)));

        IllegalStateException thrown = assertThrows(IllegalStateException.class, () -> {
            compraService.finalizarCompra(1L, 1L);
        });

        assertEquals("Itens fora de estoque.", thrown.getMessage());
    }

    @Test
    public void calcularCustoTotal_ClienteOuroSemFrete() {
        Cliente cliente = new Cliente();
        cliente.setTipo(TipoCliente.OURO); // Cliente OURO (frete grátis)

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.setCliente(cliente);
        carrinho.setItens(Arrays.asList(createItemCompra(1L, BigDecimal.valueOf(600), 1, 6)));

        BigDecimal custoTotal = compraService.calcularCustoTotal(carrinho);

        assertEquals(BigDecimal.valueOf(540.00), custoTotal); // 10% de desconto e frete grátis
    }

    @Test
    public void calcularCustoTotal_ClientePrataComDescontoFrete() {
        Cliente cliente = new Cliente();
        cliente.setTipo(TipoCliente.PRATA); // Cliente PRATA (50% de desconto no frete)

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.setCliente(cliente);
        carrinho.setItens(Arrays.asList(createItemCompra(1L, BigDecimal.valueOf(600), 1, 6)));

        BigDecimal custoTotal = compraService.calcularCustoTotal(carrinho);

        // Frete 6.0kg * 2 = 12.00 (50% desconto -> 6.00), custo com desconto 540.00
        assertEquals(BigDecimal.valueOf(546.00), custoTotal);
    }

    @Test
    public void calcularCustoTotal_ClienteBronzeComFreteCompleto() {
        Cliente cliente = new Cliente();
        cliente.setTipo(TipoCliente.BRONZE); // Cliente BRONZE (frete completo)

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.setCliente(cliente);
        carrinho.setItens(Arrays.asList(createItemCompra(1L, BigDecimal.valueOf(600), 1, 6)));

        BigDecimal custoTotal = compraService.calcularCustoTotal(carrinho);

        // Frete 6.0kg * 2 = 12.00, custo com desconto 540.00
        assertEquals(BigDecimal.valueOf(552.00), custoTotal);
    }

    private ItemCompra createItemCompra(Long produtoId, BigDecimal preco, long quantidade, int peso) {
        Produto produto = new Produto();
        produto.setId(produtoId);
        produto.setPreco(preco);
        produto.setPeso(peso);

        ItemCompra itemCompra = new ItemCompra();
        itemCompra.setProduto(produto);
        itemCompra.setQuantidade(quantidade);

        return itemCompra;
    }
}

