
package controllers;

import java.util.ArrayList;


public interface ImpuestoStrategy {
    
    public ArrayList<Double> calcular(double subtotal);
}
