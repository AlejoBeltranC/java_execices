
package tiendaPcCode;

/**
 *
 * @author alejo
 */
public class Teclado extends DispositivoEntrada{
    //Atributos
    private int idTeclado, contadorTeclado;
    //Constructor
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = idTeclado;
        this.contadorTeclado = contadorTeclado;
    }
    @Override
      public String toString(){
        return  super.toString() ;
    }
    
    
    
}
