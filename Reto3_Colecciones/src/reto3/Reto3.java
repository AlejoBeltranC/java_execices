
package reto3;

import java.util.ArrayList;
import java.util.List;



public class Reto3 {
    /**
     * Retorna una lista sin valores repetidos
     */
    public static ArrayList<Integer> clases(List<Integer> laminas){
        ArrayList<Integer> laminaF = new ArrayList<>();
        
        
        for(int i = 0; i < laminas.size(); i++){
            if (!laminaF.contains(laminas.get(i))){
                laminaF.add(laminas.get(i));
            }
        }
        
        
        return laminaF;
        
        
     }
    
    
    /**
     * Recibe lista 1 , lista 2 y un entero 
     * return , las lista con los indices donde se encuentra en la lista
     * de elementos
     */
    public ArrayList<Integer> meFaltanDeLaClase(List<Integer> indicesLaminas,List<Integer> elementosLamina, int busquedaLamina){
        ArrayList<Integer> total = new ArrayList<>(); 
        
        for(int i = 0; i < indicesLaminas.size();i++){
            if(elementosLamina.get(indicesLaminas.get(i)) == busquedaLamina){
                total.add(indicesLaminas.get(i));
            }
        }
        
        return total;
    }
    
    /**
     * Recibe lista 1 y lista 2 como parametros .
     * return, una lista con los elementos que estan en la lista 1
     * y no estan en la lista 2.
     */
    
    public ArrayList<Integer> noTengo(List<Integer> lista1,List<Integer> lista2){
        ArrayList<Integer> lista3 = new ArrayList<>();
        
        for(int i = 0; i < lista1.size(); i++){
            if(!lista2.contains(lista1.get(i))){
                lista3.add(lista1.get(i));
            }
        }
        return lista3;
    }
    
    public  Integer puedoCambiar( List<Integer>  otraPersona, List<Integer>  ellos){
       
        Integer valor1 = noTengo(otraPersona, ellos).size();
        Integer valor2 = noTengo(ellos, otraPersona).size();
        return Math.min(valor1, valor2);
        
    }
  
}
