import br.inatel.C14.Pedidos.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void deveCriarProdutoCorretamente() {
        Produto p = new Produto("Arroz", 10.0, 50);
        assertEquals("Arroz", p.getNome());
        assertEquals(10.0, p.getPreco(),0.01);
        assertEquals(50, p.getEstoque());
    }

    @Test
    public void deveReduzirEstoqueCorretamente() {
        Produto p = new Produto("Feijão", 5.0, 10);
        p.reduzirEstoque(3);
        assertEquals(7, p.getEstoque());
    }

    @Test
    public void deveLancarExcecaoQuandoEstoqueInsuficiente() {
        Produto p = new Produto("Macarrão", 4.0, 2);
        assertThrows(IllegalArgumentException.class, () -> p.reduzirEstoque(5));
    }

    @Test
    public void deveAdicionarEstoqueCorretamente() {
        Produto p = new Produto("Leite", 6.0, 5);
        p.adicionarEstoque(10);
        assertEquals(15, p.getEstoque());
    }

    @Test
    public void precoNaoPodeSerZeroOuNegativo() {
        Produto p = new Produto("Água", 0.0, 10);
        assertEquals(0.0, p.getPreco(), 0.01);
    }
}
