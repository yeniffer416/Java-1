
package Videos4a20_sesion2;

public class Video19 {
    
    public static void main(String[] args) {
        String [] tituloPeliculaArray = new String []{"up","Titanic","Aladdin","Avengers","Matrix"};
        
        for (String titulo : tituloPeliculaArray ){
            if (!titulo.contains("i")){
                System.out.println(titulo);
            }
        }
    }
    
}
