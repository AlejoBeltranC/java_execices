
package tiendaPcCode;

/**
 *
 * @author alejo
 */
public class Computadora {
    //Atributos
    private int computadora = 0;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    
    private Computadora(){
        
    }
    //Constructor
    public Computadora(String nombre,Monitor monitor,Teclado teclado,Raton raton){
        this.computadora += 1;
        this.nombre  = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton   = raton;
    }

    public int getComputadora() {
        return computadora;
    }

    public void setComputadora(int computadora) {
        this.computadora = computadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    @Override
    public String toString(){
        return getNombre() + getComputadora();
    }
}
