
package oop.pacMan;

/**
 *
 * @author alejo
 */
public class Tablero {
    //Atributos 
    protected Personaje jugador;
    protected int nivel;
    //Constructor
    public Tablero(Personaje jugador, int nivel){
        this.jugador = jugador;
        this.nivel   =  0;
        
    }
    public int comprobarNivelActual(){
        if (jugador.puntuacion >= 25){
            this.nivel += 1;
        }
        return this.nivel;
    }
}
