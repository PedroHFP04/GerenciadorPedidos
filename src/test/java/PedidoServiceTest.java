import br.inatel.C14.Pedidos.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PedidoServiceTest {

    @Mock
    private EstoqueService estoqueServiceMock;

    @InjectMocks
    private PedidoService pedidoService;

    @Test
    public void deveFinalizarPedidoEAtualizarEstoque() {
        Produto produto = new Produto("Teclado Mecânico", 300.0, 5);
        ItemPedido item = new ItemPedido(produto, 2);
        Pedido pedido = new Pedido();
        pedido.adicionarItem(item);

        pedidoService.confirmarPedido(pedido);

        assertTrue(pedido.isConfirmado());
        verify(estoqueServiceMock, times(1)).atualizarEstoque(pedido);
    }


    @Test
    public void deveAdicionarItensCorretamenteNoPedido() {
        Produto produto = new Produto("Mouse Gamer", 150.0, 10);
        ItemPedido item = new ItemPedido(produto, 1);
        Pedido pedido = new Pedido();

        pedido.adicionarItem(item);

        assertEquals(1, pedido.getItens().size());
        assertEquals("Mouse Gamer", pedido.getItens().get(0).getProduto().getNome());
    }

    @Test
    public void deveVerificarMultiplaChamadaNoEstoque() {
        Produto p1 = new Produto("Headset", 200.0, 10);
        Produto p2 = new Produto("Monitor", 1200.0, 3);

        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(p1, 1));
        pedido.adicionarItem(new ItemPedido(p2, 2));

        pedidoService.confirmarPedido(pedido);
        verify(estoqueServiceMock, times(1)).atualizarEstoque(pedido);
    }
}
