package models;

import java.util.ArrayList;


public class PedidoRepository {
    
    static private ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public String registrarPedido(Pedido p) {
        pedidos.add(p);
        return "\nPedido registrado.";
    }

    public String obtenerPedidos() {
        
        String lista = "";
        
        for(Pedido p: pedidos) {
            lista += p.toString() + "\n";
        }
        return lista;
        
    }
    
}
