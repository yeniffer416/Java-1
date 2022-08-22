
package Videos;


public class Video10 {
    
    public static void main(String[] args) {
        
        int TotalEpisodios = 15;
        
        if (TotalEpisodios >1 && TotalEpisodios <= 10){
            System.out.println("Es una mini Serie");
        }else if(TotalEpisodios >10){
            System.out.println("Es una Serie");            
        }else if(TotalEpisodios ==1){
            System.out.println("Es una Pelicula");            
        }else{
            System.out.println("Debe tener al menos un episodio");
        }
        
    }
    
}
