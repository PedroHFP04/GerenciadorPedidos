import br.inatel.C14.Pedidos.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class EstoqueServiceTest {

    @Test
    public void deveAtualizarEstoqueCorretamente() {
        Produto p = new Produto("Arroz", 10.0, 10);
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(p, 3));

        EstoqueService estoqueService = new EstoqueService();
        estoqueService.atualizarEstoque(pedido);

        assertEquals(7, p.getEstoque());
    }

    @Test
    public void deveReduzirEstoqueDeMultiplosItens() {
        Produto arroz = new Produto("Arroz", 10.0, 10);
        Produto feijao = new Produto("Feijão", 5.0, 20);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(arroz, 2));
        pedido.adicionarItem(new ItemPedido(feijao, 5));

        EstoqueService estoqueService = new EstoqueService();
        estoqueService.atualizarEstoque(pedido);

        assertEquals(8, arroz.getEstoque());
        assertEquals(15, feijao.getEstoque());
    }

    @Test
    public void deveLancarExcecaoQuandoEstoqueInsuficiente() {
        Produto arroz = new Produto("Arroz", 10.0, 1);
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(arroz, 5));

        EstoqueService estoqueService = new EstoqueService();
        assertThrows(IllegalArgumentException.class, () -> estoqueService.atualizarEstoque(pedido));
    }
}
