
package osuherencia;


public class Estudiante extends Persona {
    
     private int codigoEstudiante;
     private float notaFinal;

    public Estudiante(int codigoEstudiante, float notaFinal, String nombres, String apellidos, int edad) {
        super(nombres, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombres: "+getNombres()+"\nApellidos: "+getApellidos()+"\nEdad: "+getEdad()+"\nCodigo de Estudiante:"+codigoEstudiante+"\nNota Final:"+notaFinal);
    }    
}
