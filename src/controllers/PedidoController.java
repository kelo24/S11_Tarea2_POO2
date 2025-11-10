
package controllers;

import java.util.ArrayList;

import models.Pedido;
import models.Pedidos;


public class PedidoController {
    
    private int basePrice = 20;
    int qInventory = 10;
    
    
    public boolean stockValidation(int q) {
        
        boolean response = false;
        
        if (q <= qInventory) response = true;
            
        return response;
    }
    
    public ArrayList<Double> calcTaxes(int q) {
        
        ArrayList<Double> numeros = new ArrayList<>();
        
        double subtotal = basePrice * q;
        double igv = subtotal * 0.18;
        double total = subtotal + igv;
        
        numeros.add(subtotal);
        numeros.add(igv);
        numeros.add(total);
        
        return numeros;
    }
    
    public String register(Pedido p) {
        
        Pedidos pedidos = new Pedidos();
        
        String response = pedidos.registrarPedido(p);
        
        return response;
    }
    
    public String generateTicket(Pedido p, ArrayList<Double> price) {
        
        FacturaService newModule = new FacturaService();
        
        String factura = newModule.registrarFactura(p, price);
        
        return factura;
    }
}
