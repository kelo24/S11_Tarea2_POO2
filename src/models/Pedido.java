package models;


public class Pedido {
    
    private String name;
    private String product;
    private int q;
    
    
    // constructor
    public Pedido(String name, String product, int q) {
        this.name = name;
        this.product = product;
        this.q = q;
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
    
}
