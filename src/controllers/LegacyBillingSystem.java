
package controllers;

import java.util.ArrayList;

import models.Pedido;


public class LegacyBillingSystem {
    
    public ArrayList<String> devolverFactura(Pedido p, double subtotal, double igv, double total){
        
        ArrayList<String> facturaData = new ArrayList<>();
        
        facturaData.add(p.getName());
        facturaData.add(p.getProduct());
        facturaData.add(Integer.toString(p.getQ()));
        
        facturaData.add(String.format("%.1f", subtotal));
        facturaData.add(String.format("%.1f", igv));
        facturaData.add(String.format("%.1f", total));
        
        return facturaData;
    }
}
