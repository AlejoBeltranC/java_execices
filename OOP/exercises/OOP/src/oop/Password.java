
package oop;

import static java.lang.Math.random;

/**
 *
 * @author alejo
 */
public class Password {
    //atributtes
    public int length = 8;
    public String password;
    //Construct
    public Password( String password){
        this.password = password;
        
    }
    
    //Asigna una contrasena por defecto.
/*    public Password(int lenght){
        this.length     = lenght;
        String letters  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String uLetters = "abcdefghijklopqrstuvwxyz";
        String simbols  = "!#$%&/()=°?¡";
        String numbers  = "0123456789";
        this.password   = null;
        for(int i = 0; i < lenght ; i += 4){
            password +=  letters.charAt((int) Math.floor(Math.random()*letters.length())); 
            password += uLetters.charAt((int) Math.floor(Math.random()*uLetters.length()));
            password += simbols.charAt((int) Math.floor(Math.random()*simbols.length()));
            password += numbers.charAt((int) Math.floor(Math.random()*numbers.length()));
        }
    }*/
        
    //methods
    public boolean esFuerte(){
         //Variables de tipo contador 
            int lower   = 0;
            int upper   = 0;
            int number  = 0;
        //recorre this.password 
        for(int i = 0; i < password.length(); i ++){
            char letter = password.charAt(i);
           
            //Verifica posicion por posicion e identifica 
            //si es mayuscula, minuscula o numero.
            if (Character.isUpperCase(letter) ){
                lower += 1;   
            }else if (Character.isLowerCase(letter)){
                upper += 1;
            }else if (Character.isDigit(letter)){
                number += 1; 
            }
            //Evalua las variables contadores
            
        }
        boolean fuerte;
        if (lower >= 1 && upper >=1 && number >= 5){
                fuerte = true;
        }else{
                fuerte =  false;
            }
        
        return fuerte;
    }
    public void  cambiarContrasena(String new_password){
        this.password = new_password;
        this.length = new_password.length();
        
    }

    @Override
    public String toString(){
        String data = this.length +"\n la contraseña es: "+ this.password;
        return data;
    }
}
