import br.inatel.C14.Pedidos.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class PedidoTest {

    @Test
    public void deveAdicionarItensAoPedido() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(new Produto("Arroz", 10.0, 10), 2));
        assertEquals(1, pedido.getItens().size());
    }

    @Test
    public void deveCalcularTotalCorretamente() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(new Produto("Feijão", 5.0, 10), 2));
        pedido.adicionarItem(new ItemPedido(new Produto("Leite", 6.0, 10), 1));
        assertEquals(16.0, pedido.calcularTotal(), 0.01);
    }

    @Test
    public void deveConfirmarPedido() {
        Pedido pedido = new Pedido();
        pedido.confirmar();
        assertTrue(pedido.isConfirmado());
    }

    @Test
    public void naoDeveAdicionarItemAposConfirmacao() {
        Pedido pedido = new Pedido();
        pedido.confirmar();
        assertThrows(IllegalStateException.class, () ->
                pedido.adicionarItem(new ItemPedido(new Produto("Arroz", 10.0, 10), 1)));
    }

    @Test
    public void pedidoInicialmenteNaoConfirmado() {
        Pedido pedido = new Pedido();
        assertFalse(pedido.isConfirmado());
    }
}
