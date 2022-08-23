
package Videos24a43sesion4;

//esto es una clase de video24y25
public class movieDeVideo25 {
    
    String titulo;
    String genero;
    int duracion;
    
    public movieDeVideo25(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = 0;
    }

    public movieDeVideo25(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    public movieDeVideo25() {
        this.titulo = "No tiene titulo";
        this.genero = "No tiene genero";
        this.duracion = 0;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
}
