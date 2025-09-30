package br.inatel.C14.Pedidos;

public class PedidoService {
    private EstoqueService estoqueService;

    public PedidoService(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    public void confirmarPedido(Pedido pedido) {
        estoqueService.atualizarEstoque(pedido);
        pedido.confirmar();
    }
}

