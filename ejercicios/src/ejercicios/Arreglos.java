
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Arreglos {
    
    //Recibe un array int.
    //lo ordena.
    //retorna el valor mayor.
    public static int n_mayor(int[] n1){
         
        Arrays.sort(n1);
        int a = n1.length;
        return a;
    }
    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        //Ordenar un array y determinar cual es mayor
        int[] numeros = new int[4];
        numeros[0] = 5;numeros[1] = 4; numeros[2] = 3;numeros[3] =2 ;
        int j = 0;
        while (j < numeros.length){
        for(int i = 0; i < numeros.length-1; i++ ){
            if (numeros[i] > numeros[i+1] ){
            int number = numeros[i];
            int number1 = numeros[i+1];
            numeros[i] = number1;
            numeros[i+1] = number;
        }
        }
        j++;
        }
        
        //Array con 30 valores, indica cuales y cuantas son superiores a 1500        
     
        System.out.println("Ingrese el valor de las ventas");
        double[] ventas = new double[30]; 
        for (int i =0 ; i < ventas.length; i ++){
            ventas[i] = sc.nextDouble();
        }
        
       System.out.println("Ventas Superiores a 1500");
        
        int total = 0;
        int i = 0;
        while (i < ventas.length){
            if (ventas[i]  >= 1500){
                System.out.println(ventas[i] );
                
                total ++;
            }
            i ++;
        } 
        System.out.println("Ventas totales > de 1500" + total );
    }
}
