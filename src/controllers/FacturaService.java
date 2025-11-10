package controllers;

import java.util.ArrayList;

import models.Pedido;


public class FacturaService {
    
    public String registrarFactura(Pedido p, ArrayList<Double> price) {
        
        FacturaAdapter adapter = new FacturaAdapter();
        String response = adapter.registrarFactura(p, price);
        
        return response;
    }
}
