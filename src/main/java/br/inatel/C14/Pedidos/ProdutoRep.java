package br.inatel.C14.Pedidos;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRep {
    private Map<String, Produto> produtos = new HashMap<>();

    public void salvar(Produto produto) {
        produtos.put(produto.getNome(), produto);
    }

    public Produto buscarPorNome(String nome) {
        return produtos.get(nome);
    }
}

