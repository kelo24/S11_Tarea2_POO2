
package views;

import controllers.PedidoFacade;

import java.util.Scanner;

/**
 *
 * @author kelvincitopkmz
 */
public class Cliente {
    
    
    public void run() {
        
        PedidoFacade facade = new PedidoFacade();
        
        Scanner sc = new Scanner(System.in);
        
        int option;
        
        do {
            
            System.out.println("\n=== Menú ===");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Obtener pedidos registrados");
            System.out.println("3. Salir");
            
            
            option = sc.nextInt();
            sc.nextLine();
            
            String response = "";
            
            switch (option) {
                case 1:
                    
                    System.out.println("Nombre:");
                    String name = sc.nextLine();
                    System.out.println("Producto:");
                    String product = sc.nextLine();
                    System.out.println("Cantidad:");
                    int q = sc.nextInt();
                    
                    response = facade.registrarPedido(name, product, q);
                    
                    System.out.println(response);
                    
                    break;
                case 2:
                    
                    response = facade.obtenerPedidos();
                    System.out.println(response);
                    
                    break;
                case 3:
                    option = 0;
                    System.out.println("Sistema apagado.");
                    break;
            }
            
            
        } while (option != 0);
        
    }
}
