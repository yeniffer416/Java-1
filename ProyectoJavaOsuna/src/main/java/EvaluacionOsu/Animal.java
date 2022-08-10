
package EvaluacionOsu;

/**
 *
 * @author Juan David Osuna Fecha: 10-08-2022
 */
public abstract class Animal {
    
    public abstract void detalle();
    
    private String nombre;
    private String tipo;

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    

       
}
