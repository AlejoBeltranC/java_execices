
package ejercicios;

/**
 *
 * @author alejo
 */
public class Persona {
    
    String nombres , apellidos , nombreCompleto;
    int edad, peso;
    double altura;
    
    public Persona(String nombres, String apellidos,int edad,double altura, int peso){
        this.nombres   = nombres;
        this.apellidos = apellidos;
        this.nombreCompleto = nombres + apellidos;
        this.edad   = edad;
        this.altura = altura;
        this.peso   = peso;
    }
    public Persona(){
        
    }
    public double calculaIMC(double altura, int peso){
       double iMC = peso / altura;
       return iMC;
    }

    public String toString(String string) {
        return nombres+apellidos;
    }
}
