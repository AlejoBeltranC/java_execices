
package tiendaPcCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Orden {
    //Atributos
    private int idOrden = 1, maxComputadoras = 2,contadorComputadoras = 1;
    private int contadorOrdenes = 0;
    
    private ArrayList<Computadora> listaComputadoras = new ArrayList<>() ;
    //Constructores
    public Orden(){
        this.idOrden += 1;
        this.contadorOrdenes = contadorOrdenes;
        this.maxComputadoras = maxComputadoras;
        this.contadorComputadoras += 1;
    }
    //Agregar una nueva computadora.
    public void agregarComputadora(Computadora computador){
        
        try{
            listaComputadoras.add(computador);
           
            System.out.println("Generado Exitosamente.");
        }catch(Exception e){
            System.out.println("Error...");
            System.out.println(e);
        }
        
        
    }
    //Muestra los datos de la compra.
    public  void mostrarOrden(){

        try{
            for(Computadora x : listaComputadoras){
                System.out.println(x.toString());
            }   
        }catch(Exception e){
            System.out.println("No se Ejecuto la Opracion.");
            System.out.println(e);
        }
        
        
        
        
    }
    
    
}
