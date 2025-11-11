package controllers;

import java.util.ArrayList;

import controllers.PedidoController;
import models.Pedido;


public class PedidoFacade {
    
    PedidoController pCon = new PedidoController();
    
    
    public String registrarPedido(String name, String product, int q) {
        
        String response = "";
        
        // Validación de stock
        if (!pCon.stockValidation(q)) {
            response = "No hay suficiente stock para registrar el pedido.";
            return response;
        }
        
        // Cálculo de impuestos
        int cantidad = q;
        ArrayList<Double> price = pCon.calcTaxes(cantidad);
        
        // Registro del pedido
        Pedido p = new Pedido(name, product, q);
        response += pCon.register(p);
        
        // Factura
        String factura = pCon.generateTicket(p, price);
        response += factura;
        
        return response;    
    }
    
    public String obtenerPedidos() {
        return pCon.obtenerPedidos();
    }
    
}
