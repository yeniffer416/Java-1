
package menu12_08_2022;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Juan David Osuna Fecha: 12-08-2022
 */
public class MenuOsu {

    public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);
            int opcion = 0; //Guardaremos la opcion del usuario
            do{
                
                System.out.println("       BIENVENIDOS       ");
                System.out.println("          MENU           ");
                System.out.println("Eliga alguna de estas opciones.");
                System.out.println("--------1. Class----------");
                System.out.println("--------2. Break----------");
                System.out.println("--------3. Objetos--------");
                System.out.println("--------4. Salir----------");
                try {
                    System.out.println("Escribe una de las opciones\n");
                    opcion = sn.nextInt();
                    
                    if (opcion < 1) {
                        System.out.println("definicon de Clase: la clase es como una hoja para llevar los metodos y los atrubutos");
                        break;
                    } 
                    else if (opcion < 2) {
                        System.out.println("Definicon de Break: es cuando lo usamos en para salir de un ciclo infinito");
                        break;
                    } 
                    else if (opcion < 3) {
                        System.out.println("Definicion de objetos: ");
                        break;
                    } 
                    else if (opcion <= 4) {
                        System.out.println("Has salido del menu que tenga buen dia :P ");
                        break;
                    }
                    else{
                       System.out.println("Digite un numero entre 1 y 4 ");
                       break;
                    }
                } catch (InputMismatchException e) {
                System.out.println("Debes digitar numeros");
                sn.next();
                break;
            }
            }
            while (opcion!=4) ;   
        }
    }
