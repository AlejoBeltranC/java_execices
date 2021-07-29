
package oop.pacMan;

/**
 *
 * @author alejo
 */
public class Personaje {
    //Atributos
    protected String color;
    protected   int  puntuacion ,  vidasRestantes;
    
    //Metodos
    public Personaje(String color, int puntuacion, int vidasRestantes){
        this.color          = "amarillo";
        this.puntuacion     = 1;
        this.vidasRestantes = 3;
        
    }
    //suma el puntaje del usuario
    public void sumarPuntuacion(){
        this.puntuacion += 1;
    }
    //retorna la puntuacion acumulada
    public int obtenerPuntuacion(){
        return this.puntuacion;
    }
    //resta 1 al atributo vidas restantes
    public void restarVida(){
        this.vidasRestantes -= 1;
    }
    //verifica si vidasRestantes es > 0
    // y retorna un booleano
    public boolean sigueVivo(){
        if (this.vidasRestantes > 0){
            return true;
        }else{
           return false;
        }
    }
}
