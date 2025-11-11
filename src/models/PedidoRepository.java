package models;

import java.util.ArrayList;


public class PedidoRepository {
    
    static public ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public String registrarPedido(Pedido p) {
        pedidos.add(p);
        return "\nPedido registrado.";
    }
}
