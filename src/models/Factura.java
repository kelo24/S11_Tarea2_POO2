
package models;


public class Factura {
    
    private double subtotal;
    private double igv;
    private double total;
    
    private Pedido p;
    
    // constructor
    public Factura(double subtotal, double igv, double total) {
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
    }
    
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    public double getIgv() {
        return igv;
    }
    public void setIgv(double igv) {
        this.igv = igv;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
}
