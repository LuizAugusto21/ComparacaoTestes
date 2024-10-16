package ecommerce.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        Class<?> wildcardClass5 = compraService4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 100L, (Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 0L, (Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) (-1L), (Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 0L, (Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 10L, (Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        ecommerce.entity.CarrinhoDeCompras carrinhoDeCompras5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = compraService4.calcularCustoTotal(carrinhoDeCompras5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.entity.CarrinhoDeCompras.getItens()\" because \"carrinho\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 1L, (Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 100L, (Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 0L, (Long) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) (-1L), (Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) (-1L), (Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 100L, (Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 1L, (Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 1L, (Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) (-1L), (Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 0L, (Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 100L, (Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 0L, (Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) (-1L), (Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 10L, (Long) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 100L, (Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 10L, (Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 1L, (Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 10L, (Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 1L, (Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        ecommerce.service.CarrinhoDeComprasService carrinhoDeComprasService0 = null;
        ecommerce.service.ClienteService clienteService1 = null;
        ecommerce.external.IEstoqueExternal iEstoqueExternal2 = null;
        ecommerce.external.IPagamentoExternal iPagamentoExternal3 = null;
        ecommerce.service.CompraService compraService4 = new ecommerce.service.CompraService(carrinhoDeComprasService0, clienteService1, iEstoqueExternal2, iPagamentoExternal3);
        // The following exception was thrown during execution in test generation
        try {
            ecommerce.dto.CompraDTO compraDTO7 = compraService4.finalizarCompra((Long) 10L, (Long) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ecommerce.service.ClienteService.buscarPorId(java.lang.Long)\" because \"this.clienteService\" is null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }
}

