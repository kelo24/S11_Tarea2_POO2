
package controllers;

import java.util.ArrayList;
import java.util.Scanner;

import models.Pedido;
import models.PedidoRepository;


public class PedidoController {
    
    public int basePrice = 20;
    private int qInventory = 10;
    
    
    public boolean stockValidation(int q) {
        
        boolean response = false;
        
        if (q <= qInventory) response = true;
            
        return response;
    }
    
    public ArrayList<Double> calcTaxes(int q) {
        
        // definicion de montos
        double subtotal = basePrice * q;
        double igv = 0;
        double total = 0;
        
        // elección de usuario
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("\nElige tu método de tributación:");
            System.out.println("\n1. Con IGV 18%");
            System.out.println("2. Sin IGV 0%");
            
            option = sc.nextInt();
            sc.nextLine();
            
            switch (option) {
                case 1:
                    igv = (new IGV18Strategy()).calcular(subtotal);
                    option = 0;
                    break;
                case 2:
                    igv = (new ExoneradoStrategy()).calcular(subtotal);
                    option = 0;
                    break;
                default:
                    System.out.println("Opción no existente. Vuelva a intentarlo.");
                    break;
            }
        } while (option != 0);
        
        // devolución de datos
        total = subtotal + igv;
        
        ArrayList<Double> numeros = new ArrayList<>();
        
        numeros.add(subtotal);
        numeros.add(igv);
        numeros.add(total);
        
        return numeros;
    }
    
    public String register(Pedido p) {
        
        PedidoRepository pedidos = new PedidoRepository();
        
        String response = pedidos.registrarPedido(p);
        
        return response;
    }
    
    public String generateTicket(Pedido p, ArrayList<Double> price) {
        
        FacturaService newModule = new FacturaService();
        
        String factura = newModule.registrarFactura(p, price);
        p.adjuntarFactura(factura);
        
        return factura;
    }
    
    public String obtenerPedidos() {
        
        PedidoRepository pedidos = new PedidoRepository();
        
        return pedidos.obtenerPedidos();
    }
}
