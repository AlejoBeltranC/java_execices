
package tiendaPcCode;

/**
 *
 * @author alejo
 */
public class Monitor {
    //Atributos
    private int idMonitor, contadorMonitores;
    private String marca;
    private double tamano;
    
    
    //Constructor
    private Monitor(){
        
    }
    public Monitor(String marca,double tamano){
        this.marca  = marca;
        this.tamano = tamano;
        
    }
@Override
    public String toString(){
        return marca + tamano;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setContadorMonitores(int contadorMonitores) {
        this.contadorMonitores = contadorMonitores;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
    
}
   