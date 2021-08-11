
package reto2;

/**
 *
 * @author alejo
 */
public class Comercial extends Vehiculo{
    //Atributos
    protected String cargaMaxima;
    //Constructor
    public Comercial(String tipo,String velocidad,String pasajeros,String placa,String tipoCombustible,String cargaM) {
        super(tipo,velocidad,pasajeros,placa,tipoCombustible);
        this.cargaMaxima = cargaM;
        
    }
    
    @Override
    public String toString(){
       return  "         Vehiculo      "+tipo+" - "+"Placa: "+placa+"\n"
               +"         velocidad:    "+ velocidad+" Km/h"+"\n"
               +"         pasajeros:    "+ pasajeros+"\n"
               +"         carga maxima: "+ cargaMaxima;
        
        
    }
    
}
