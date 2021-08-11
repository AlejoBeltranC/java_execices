
package reto2;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventario {
    //Atributos
    private ArrayList<Vehiculo> vehiculos = new ArrayList<> ();
    
    //Metodos
    
    public void Inventario(){
   
    }
    /** Permite añadir un carro de tipo comercial o 
     * particular que haya ingresado al taller.
      */
    public void agregarVehiculos(String[] carro){
         
        String tipo      = carro[1];
        String pasajeros = carro[2];
        String velocidad = carro[3];
        String placa     = carro[4] ;
        String identificador   = carro[5];
        String tipoCombustible = carro[6];
        
   
        if (tipo.equalsIgnoreCase("Comercial") ){
            Vehiculo nuevoC = new Comercial(tipo,velocidad,pasajeros,placa,tipoCombustible,identificador);
            vehiculos.add(nuevoC);
            
            
        }else{
            
            Vehiculo nuevoP = new Particular(tipo,velocidad,pasajeros,placa,tipoCombustible,identificador);
            
            vehiculos.add(nuevoP);
            
        }
        
    }
    /**
     * Lista los objetos de tipo Vehiculo con un formato especifico.
     */
    public void listarVehiculos(){
        
        
        System.out.println("*** inventario de vehículos ***");
        
        
        for(int i = 0; i < vehiculos.size(); i ++){
            
            System.out.println(vehiculos.get(i).toString());
        }
   
        
        
    }
    /**
     * Evalua los datos ingresados por el usuario 
     * y llama el metodo de la clase Inventario
     * según corresponda.
     */
    public void procesarComandos(){
        
        Scanner sc = new Scanner(System.in);
        String carro ;        
        String opcion = null;
       
        do{   
            carro = sc.nextLine();
            String[] carro1  = carro.split("[&]");
            opcion =carro1[0];
            
            switch (opcion){
                
                case "1":
                    agregarVehiculos(carro1);
                    continue;
                    
                case "2":
                    listarVehiculos();
                    continue;
                    
                case "3":
                    break;       
            }  
            if( opcion.equals("3")){
                break;
            }
        }while(opcion != "3" );
        
        
    }
   
    
    
    public static void main(String[] args) {
        /**
        * El usuario ingresara un cadena de texto como 
        * el siguiente formato:1&Particular&4&180&FFE 000&Rojo&Diesel
        * la posición [0] indica la operacion que desea realizar,
        * 1, para agregar Vehiculo, seguido de los datos del vehiculo
        * 2, para listar y 3, para salir.
        */
             
        
        Inventario virtual = new Inventario();
        virtual.procesarComandos();
        
        
        
        
    
    }
    
}
