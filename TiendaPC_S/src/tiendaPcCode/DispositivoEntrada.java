
package tiendaPcCode;

/**
 *
 * @author alejo
 */
public abstract class  DispositivoEntrada {
    //Atributos
    protected String tipoEntrada;
    protected String marca;
    
    //Contructor
    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    
    @Override
    public String toString(){
        return tipoEntrada + marca;
    }
}
