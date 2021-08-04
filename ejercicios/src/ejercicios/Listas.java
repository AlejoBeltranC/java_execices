
package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author alejo
 */
public class Listas {
    //Eliminar los numeros repetidos
    public static ArrayList reducir(ArrayList<Integer> numeros){
        ArrayList<Integer>numerosF = new ArrayList<>();
        for(int i = 0; i < numeros.size(); i ++){
            if (numerosF.contains(numeros.get(i)));
                else{
                   numerosF.add(numeros.get(i));
                }
        }
        return numerosF;
    }
    //Recibe como parametros  2 ArrayList de tipo Integer
    //Crea un ArrayList de Tipo Integer = Lista3, con los numeros que estan en lista 1 y lista 2
    //Retorna Lista3
    public static ArrayList numerosRepetidos(ArrayList<Integer> lista1,ArrayList<Integer> lista2){
        ArrayList<Integer> lista3 = new ArrayList<>();
         for (int i = 0; i < lista1.size(); i ++){
           for(int j = 0; j < lista2.size(); j ++){
               if(lista1.get(i) == lista2.get(j) && (lista3.contains(lista1.get(i)) == false))lista3.add(lista1.get(i));
               }
           }
        return lista3;
    
    }
    //Recibe como parametro dos TreeMap
    //los une en uno nuevo TreeMap
    //Retorna el nuevo TreeMap
    public static TreeMap<Integer,String> union(TreeMap<Integer,String> datos1,TreeMap<Integer,String> datos2){
        TreeMap<Integer,String> datosUnion = new TreeMap<Integer,String>();
        for(Map.Entry item1:datos1.entrySet()){
            datosUnion.put((int)item1.getKey(), (String)item1.getValue());
        }
        for(Map.Entry item2:datos2.entrySet()){
            datosUnion.put((int)item2.getKey(), (String)item2.getValue());
        }
        return datosUnion;
    }
   
    
    public static void main(String[] args){
       
        
       ArrayList<Double> notas = new ArrayList<>(Arrays.asList(3.0,3.2,3.5,3.8,4.1,4.5,5.0)); 
       //imprimir la inversa de dicha lista.
       for(int i = notas.size()-1; i >= 0;i -=1)System.out.println(notas.get(i));
       
       HashMap<Integer,String> datos1 = new HashMap<Integer,String>();
       HashMap<Integer,String> datos2 = new HashMap<Integer,String>();
       
       datos1.put(1012512,"Alejandro Beltrán");
       datos1.put(7542588,"Marianela Casali");
       datos1.put(7542588,"Marianela Casali");
       datos1.put(54624798,"Leonel Meddo");
       datos1.put(54624798,"Luisa metera");
       
       datos2.put(1012512,"Alejandro Beltrán");
       datos2.put(75425885,"Marianela Casali");
       datos2.put(75425818,"Marianela Casali");
       datos2.put(546247598,"Leonel Meddo");
       datos2.put(54624798,"Luisa metera");
       
       //Revisa si datos del datos1 estan en datos 2 e indica caules
       
       for(Map.Entry<Integer,String>elem1:datos1.entrySet()){
          for(Map.Entry<Integer,String>elem2:datos2.entrySet()){
              if(elem1.getKey().equals(elem2.getKey()) && elem1.getValue().equals(elem2.getValue())){
                  System.out.println(elem1.getKey() + " " + elem1.getValue()+" Esta en datos2");
              }
          }   
       }
       
       
       TreeMap<Integer,String> datos3 = new TreeMap<Integer,String>();
       TreeMap<Integer,String> datos4 = new TreeMap<Integer,String>();
       
       datos3.put(1012512,"Alejandro Beltrán");
       datos3.put(7542588,"Marianela Casali");
       datos3.put(7542588,"Marianela Casali");
       datos3.put(54624798,"Leonel Meddo");
       datos3.put(54624798,"Luisa metera");
       
       datos4.put(5757454,"Carlos Romero");
       datos4.put(5875756,"Manuela Cardona");
       datos4.put(9132145,"Lokillo Florez");
       datos4.put(3874982,"Diego Rueda");
       datos4.put(1924705,"Steven Arce");
       
       
       
    }
}
