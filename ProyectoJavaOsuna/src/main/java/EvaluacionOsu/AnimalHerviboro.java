
package EvaluacionOsu;

/**
 *
 * @author Juan David Osuna Fecha: 10-08-2022
 */
public class AnimalHerviboro extends Animal {
    
    private String Comida;
    private String Ubicacion;
    private String Agrupados;

    public AnimalHerviboro(String Comida, String Ubicacion, String Agrupados, String nombre, String tipo) {
        super(nombre, tipo);
        this.Comida = Comida;
        this.Ubicacion = Ubicacion;
        this.Agrupados = Agrupados;
    }

    public String getComida() {
        return Comida;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public String getAgrupados() {
        return Agrupados;
    }
    
    @Override
    public void detalle(){
        //detalles se imprimen
        System.out.println("\n--------------"+"Nombre del animal: ------------\n"+getNombre()+"\nTipo de animal: "+getTipo()+ "\nComida: " + Comida + "\nUbicacion: " + Ubicacion + "\nAgrupados: " + Agrupados);
    }
    
}
