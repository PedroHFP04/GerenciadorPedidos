import br.inatel.C14.Pedidos.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoRepTest {

    @Test
    public void deveSalvarEBuscarProduto() {
        ProdutoRep repo = new ProdutoRep();
        Produto p = new Produto("Arroz", 10.0, 10);
        repo.salvar(p);

        Produto encontrado = repo.buscarPorNome("Arroz");
        assertNotNull(encontrado);
        assertEquals("Arroz", encontrado.getNome());
    }
}
