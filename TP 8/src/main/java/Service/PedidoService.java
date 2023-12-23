package Service;

import domain.Pedido;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class PedidoService {
    private static final Map<Integer, Pedido> pedidos = new HashMap<>();

    public void incluirPedido(Pedido pedido) {
        pedidos.put(pedido.getNumero(), pedido);
    }

    public List<Pedido> obterListaPedidos() {
        return new ArrayList<>(pedidos.values());
    }
}
