
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class doWhile {
    
    //Pedir numeros por consola, al ingresar cero, deje de solicitar numeros 
    //y sume el total de los numeros ingresados anteriormente
    public static double suma(){
        double number  = 0;
        double numbers = 0;
        do{
            System.out.println("Ingrese el numero a sumar");
            number = sc.nextDouble();
            numbers += number;
            
        }while(number != 0);
        
        return numbers;    
}
    
    
    public static void main(String args[]){
    
    
        
}

}