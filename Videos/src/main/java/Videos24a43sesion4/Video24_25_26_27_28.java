
package Videos24a43sesion4;

import java.util.Random;

public class Video24_25_26_27_28 {
    
   public static void main(String[] args) {
        movieDeVideo25 StivenFuture = new movieDeVideo25();
        movieDeVideo25 toyStory = new movieDeVideo25(" Toy Story"," Familiar",90);
        movieDeVideo25 StarWars = new movieDeVideo25(" Star Wars"," Ciencia Ficcion",180);
        
        System.out.println(StivenFuture.getTitulo()+ " " + StivenFuture.getGenero()+" "+ StivenFuture.getDuracion() );
        System.out.println(toyStory.getTitulo()+ " " + toyStory.getGenero()+" "+ toyStory.getDuracion() );
        System.out.println(StarWars.getTitulo()+ " " + StarWars.getGenero()+" "+ StarWars.getDuracion());
        
        movieDeVideo25 madMax = new movieDeVideo25(" MadMax furia en el camino"," Accion",90);
        
        
    }    
    public static String play(String[] tituloArray, int index){
        if (index < tituloArray.length ) { 
            String titulo = tituloArray [index];
            
            for (int i = 0; i < 10; i++){
                System.out.println("Rodando la pelicula"+titulo);
            }
            return titulo;
        }else{
            System.out.println("indice muy grande");
            return "";
        }
    }
    //metodo sobre cargado
    public static String play(String[] tituloArray) {
     Random random = new Random();
     int index = random.nextInt(tituloArray.length - 1);
     
     String titulo = tituloArray [index];
           
        for (int i = 0; i < 10; i++){
            System.out.println("Rodando la pelicula"+titulo);    
        }
        return titulo;    
    }
    
    public static void pausa(String titulo) {
        if (titulo.isEmpty()){
            System.out.println("Pelicula no reproduce");
        }else{
            System.out.println("Pelicula pausada"+titulo);
        } 
    }
    
}
