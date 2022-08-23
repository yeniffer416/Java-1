/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videos4a20_sesion2;

/**
 *
 * @author Juan Osuna
 */
public class Video8 {
    
    public static void main(String[] args) {
        //Rectangular
        int b = 15;
        int a = 8;
        
        //Area
        int rArea = b*a;
        
        //Perimetro
        int rPerimetro = (2*b)+(2*a);
                
        //Area
        double tArea = b * a / 2.0;
        
        //Circulo
        int r = 60;
        
        //Area
        double pi = Math.PI;
        double cArea = pi * Math.pow(r,2);
        
        System.out.println(cArea);
        
        //hipotenusa
        //Raiz cuadrada de la suma de los cuadrados de los catetos.
        
        //Triangulo
        b = 5;
        a = 3;
        
        double sumaCatetos = Math.pow(a,2) + Math.pow(b,2);
        double area = Math.sqrt(sumaCatetos);
        System.out.println(area);
    }
    
}
