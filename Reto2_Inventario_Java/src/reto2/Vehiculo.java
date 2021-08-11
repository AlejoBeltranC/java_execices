
package reto2;

/**
 *
 * @author alejo
 */

public abstract class Vehiculo {
    //Atributos
    
    protected String tipo,velocidad,pasajeros,placa,tipoCombustible;
    
    //Constructor
    public Vehiculo(String tipo,String velocidad,String pasajeros,String placa,String tipoCombustible){
        this.tipo      = tipo;
        this.velocidad = velocidad;
        this.pasajeros = pasajeros;
        this.placa     = placa;
        this.tipoCombustible = tipoCombustible;
    }
    
  
    
        
}
    
    


    
