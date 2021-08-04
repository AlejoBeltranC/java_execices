
package ejercicios;

/**
 *
 * @author alejo
 */
public class While {
    //Suma los numeros positivos ingresados por el usuario.
    public static void suma(){   
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese los valores positivos a sumar");
        //System.out.println("Para ver el total de la suma ingrese 0");
        double number = 0 ;
        double numbers = -1;
        int count = 0;
        
        while  (numbers != 0){
            numbers = sc.nextDouble();
            if(numbers > 0){
                number = number + numbers;
                count += 1;
            }
        }
        
        //System.out.println("El promedio de los numeros positivos es :" + number/count);
    
}
}
