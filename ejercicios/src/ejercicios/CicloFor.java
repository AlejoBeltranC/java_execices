
package ejercicios;

/**
 *
 * @author alejo
 */
public class CicloFor {
    
    //Multiplicar entre si los primeros numeros impares del 1 al 10
    public static double sumaImpar(){
    double number = 1;
        for (int i = 1; i <= 10; i ++){
            if (i % 2 == 1){
                number *= i;
            }
        }
        return number ;
    }
    
    public static void main(String args[]){
    //Mostrar en pantalla los números de 2 en dos, a partir del 50, hasta 
    //llegar a 100.
    for (int i = 50 ; i<= 100; i +=2){System.out.println(i);}
    
    //Mostrar los números del 100 al 0, decrementándose de 4 en 4.
    for (int i = 100 ; i >= 0; i -=4){System.out.println(i);}

    //Mostrar cuáles números son múltiplos 4, en un rango del 1 al 100.
    for(int i = 0; i<=100; i ++ ){
           if (i % 4 == 0 && i != 0){System.out.println(i +" " + "Es multiplo de 4");}
    }

    //Mostrar en pantalla los numeros del 1 al 100 y del 100 al 1
    for(int i = 0, y = 100; i<=100; i ++ , y-- ){
           System.out.println(i+" "+ y);
    }
    
   
}
}
