
package Videos;

public class Video11 {
    
    public static void main(String[] args) {
        //variable
        int TotalEpisodios = 15;
        
        //if y else comprobacion 
        if (TotalEpisodios >1 && TotalEpisodios <= 10){
            System.out.println("Es una mini Serie");
        }else if(TotalEpisodios >10){
            System.out.println("Es una Serie");            
        }else if(TotalEpisodios ==1){
            System.out.println("Es una Pelicula");            
        }else{
            System.out.println("Debe tener al menos un episodio");
        }
        
        //iniciamos ciclo while es para hacer tareas repetitivas
        int i = 0;
        int duracion = 10;
        
        while (i <= duracion) {
            if (i <3 ){
                System.out.println("Reproduciendo intro, segundo = "+i);
            }else if(i < 7 ){
                System.out.println("Reproduciendo pelicula, segundo = "+i);
            }else{
                System.out.println("Reproduciendo creditos, segundo = "+i);
            }
            i++;            
        }      
    }
}
