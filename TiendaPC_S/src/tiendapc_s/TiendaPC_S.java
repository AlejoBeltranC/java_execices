
package tiendapc_s;

import java.util.Scanner;
import tiendaPcCode.Computadora;
import tiendaPcCode.Monitor;
import tiendaPcCode.Orden;
import tiendaPcCode.Raton;
import tiendaPcCode.Teclado;

/**
 *
 * @author alejo
 */
public class TiendaPC_S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Orden orden = new Orden();
        
        
        int opcion = 1;
        do{
            System.out.println("==========================================");
            System.out.println("1 para generar una nueva orden de compra.");
            System.out.println("2 para listar Orden de compra.");
            System.out.println("0 para Salir.");
            System.out.println("==========================================");
            opcion = sc.nextInt();
            
            
            switch (opcion){
                
                
                case 1:
                    System.out.println("Cantidad de Computadores: ");
                    int cantidad = sc.nextInt(); 
                    
                    
                    
                    System.out.println("Nombre del Computador: ");
                    String nombre = sc.next();
        
                    System.out.println("Caracteristicas del Monitor");
                    System.out.println("Marca del Monitor: ");
                    String marcaM = sc.next();
                    System.out.println("Tamaño del Monitor: ");
                    double tamanoM = sc.nextDouble();
        
                    Monitor monitor = new Monitor(marcaM,tamanoM);
                    
                    System.out.println("Caracteristicas del Teclado");
                    System.out.println("Tipo entrada del Teclado: ");
                    String tipoEntradaT = sc.next();
                    System.out.println("Marca del Teclado: ");
                    String marcaT = sc.next();
                    
                    Teclado teclado = new Teclado(tipoEntradaT,marcaT);
                   
                    System.out.println("Caracteristicas del Mouse/Raton ");
                    System.out.println("Tipo entrada del Mouse/Raton: ");
                    String tipoEntradaR = sc.next();
                    System.out.println("Marca del Mouse/Raton: ");
                    String marcaR = sc.next();
        
                    Raton raton = new Raton(tipoEntradaR,marcaR);
        
                    Computadora computador = new Computadora(nombre,monitor,teclado,raton);
        
                    orden.agregarComputadora(computador);
                    
                    continue;
                
                case 2 :
                    
                    orden.mostrarOrden();
                    continue;
                
                default:
                    break;
                    
                    
            }
        }while(opcion != 0);
    }
    
}
