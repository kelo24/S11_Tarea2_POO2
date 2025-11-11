package models;


public class Pedido {
    
    private String name;
    private String product;
    private int q;
    
    private String factura;
    
    // constructor
    public Pedido(String name, String product, int q) {
        this.name = name;
        this.product = product;
        this.q = q;
        
        this.factura = "";
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public int getQ() {
        return q;
    }
    public void setQ(int q) {
        this.q = q;
    }
    public String getFactura() {
        return factura;
    }
    //adjuntar factura
    public void adjuntarFactura(String factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Pedido{" + "name=" + name + ", product=" + product + ", q=" + q + ", factura=" + factura + '}';
    }
    
}
