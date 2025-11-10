
package controllers;

import java.util.ArrayList;

import models.Pedido;


public class FacturaAdapter {
    
    private LegacyBillingSystem oldModule;
    
    public String registrarFactura(Pedido p, ArrayList<Double> price) {
        
        oldModule = new LegacyBillingSystem();
        
        double subtotal = price.get(0);
        double igv = price.get(1);
        double total = price.get(2);
        ArrayList<String> facturaData = oldModule.devolverFactura(p, subtotal, igv, total);
        
        String factura =    "\n\n--------------------------------------------"
                            + "\n            FACTURA ELECTRONICA"   
                            + "\n\nNombre   : " + facturaData.get(0)
                            + "\nProducto : " + facturaData.get(1)
                            + "\nCantidad : " + facturaData.get(2)
                            + "\n\nSub-total = S/" + facturaData.get(3)
                            + "\nIGV (18%) = S/" + facturaData.get(4)
                            + "\nTotal     = S/" + facturaData.get(5)
                            + "\n--------------------------------------------";
        
        return factura;
        
    }
    
}
