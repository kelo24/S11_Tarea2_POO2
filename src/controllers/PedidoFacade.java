package controllers;

import java.util.ArrayList;
import controllers.PedidoController;
import models.Pedido;

/**
 *
 * @author kelvincitopkmz
 */
public class PedidoFacade {
    
    
    public String registrarPedido(String name, String product, int q) {
        
        String response = "";
        
        PedidoController pCon = new PedidoController();
        
        // Validación de stock
        if (!pCon.stockValidation(q)) {
            response = "No hay suficiente stock para registrar el pedido.";
            return response;
        }
        
        // Cálculo de números
        ArrayList<Double> price = pCon.calcTaxes(q);
        
        // Registro del pedido
        Pedido p = new Pedido(name, product, q);
        response += pCon.register(p);
        
        // Factura
        
        String factura = pCon.generateTicket(p, price);
        response += factura;
        
        return response;    
    }
}
