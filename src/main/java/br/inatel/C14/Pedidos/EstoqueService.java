package br.inatel.C14.Pedidos;


public class EstoqueService {
    public void atualizarEstoque(Pedido pedido) {
        for (ItemPedido item : pedido.getItens()) {
            item.getProduto().reduzirEstoque(item.getQuantidade());
        }
    }
}
