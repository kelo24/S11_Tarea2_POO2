
package controllers;

import java.util.ArrayList;


public class ExoneradoStrategy implements ImpuestoStrategy {
    
    @Override
    public double calcular(double subtotal) {
        return subtotal * 0;
    }
    
}
