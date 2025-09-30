package br.inatel.C14.Pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private boolean confirmado = false;

    public void adicionarItem(ItemPedido item) {
        if (confirmado)
            throw new IllegalStateException("Pedido já confirmado!");
        itens.add(item);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemPedido::getSubtotal).sum();
    }

    public void confirmar() {
        this.confirmado = true;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}

