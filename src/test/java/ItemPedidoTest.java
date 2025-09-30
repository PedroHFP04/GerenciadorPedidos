import br.inatel.C14.Pedidos.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemPedidoTest {

    @Test
    public void deveCalcularSubtotalCorretamente() {
        Produto p = new Produto("Arroz", 10.0, 20);
        ItemPedido item = new ItemPedido(p, 3);
        assertEquals(30.0, item.getSubtotal(),0.01);
    }

    @Test
    public void deveRetornarProdutoCorreto() {
        Produto p = new Produto("Feijão", 5.0, 15);
        ItemPedido item = new ItemPedido(p, 2);
        assertEquals(p, item.getProduto());
    }

    @Test
    public void deveRetornarQuantidadeCorreta() {
        Produto p = new Produto("Leite", 6.0, 10);
        ItemPedido item = new ItemPedido(p, 4);
        assertEquals(4, item.getQuantidade());
    }
}
