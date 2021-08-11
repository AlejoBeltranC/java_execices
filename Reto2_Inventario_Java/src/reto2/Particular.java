
package reto2;

/**
 *
 * @author alejo
 */
public class Particular extends Vehiculo {
    //Atributos
    protected String color;
    public Particular(String tipo,String velocidad,String pasajeros,String placa,String tipoCombustible,String color) {
        super(tipo,velocidad,pasajeros,placa,tipoCombustible);
        this.color = color;
    }
    
    @Override
    public String toString(){
       
       return  "         Vehiculo   "+tipo+" - "+"Placa: "+placa+"\n"
               +"         velocidad: "+ velocidad+" Km/h"+"\n"
               +"         pasajeros: "+ pasajeros+"\n"
               +"         Color:     "+ this.color;
        
        
    }
        
    }
    
}
