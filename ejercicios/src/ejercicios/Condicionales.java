package ejercicios;

import static java.lang.Character.*;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Condicionales {
    //Retorna true si es par, false si es impar
    public static boolean par(int numero){
        boolean respuesta = numero % 2 == 0;
     
        return respuesta;
    }
    //Recibe dos datos de tipo int.
    //Retorna el numero mayor.
    public static int mayor(int n1, int n2){
        int mayor = n1 > n2 ? n1 : n2 ;
        return mayor;
    }
    
    
    
        
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Capturar sólo números positivos, y 
        //obtener la media(promedio) de esos números.
        // MUltiplicar los primeros 10 numeros impares
        int number = 1;
        for (int i = 1; i <= 10; i ++){
            if (i % 2 == 1){
                number *= i;
            }
        }
        System.out.println(number);
        
        
    
        
    
}
}