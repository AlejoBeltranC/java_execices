
package tiendaPcCode;

/**
 *
 * @author alejo
 */
public class Raton extends DispositivoEntrada{
    //Atributos
    private int idRaton = 0000001;
    private int contadorRatones = 0;
    //Constructor
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton += 1;
        this.contadorRatones += 1;
    }
    
    @Override
    public String toString(){
        return  super.toString();
    }
    
}
