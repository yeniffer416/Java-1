
package Videos4a20_sesion2;


public class Video9 {
    
    public static void main(String[] args) {
        
        int TotalEpisodios = 3;
        
        if (TotalEpisodios >1){
            System.out.println("Es una serie");
        }else if(TotalEpisodios ==1){
            System.out.println("Es una pelicula");            
        }else{
            System.out.println("Debe tener al menos un episodio");
        }
    }
    
}
