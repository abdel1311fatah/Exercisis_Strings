
package cadena1;

import java.util.Scanner;


public class Cadena1 {
static Scanner scan = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        String frase = "En New York ha nevado casi un metro y por las calles solo pasan los quitanieves", x = "", e = "e";
        System.out.println("La longitud de la frase es: " + frase.length()); //Longitud del string
        System.out.println("El caracter que hi ha a l' index 7 es: " + frase.charAt(7)); //Caracter de l index 7
        System.out.println("Subcadena calles: " + frase.substring(46, 51)); // Subcadena calles
        // Trobar el caracter "x"
        System.out.println("Escriu el element que vols buscar");
        x = scan.nextLine(); 
        if(x.length() == 1){ //
             System.out.println(frase.indexOf(x, 0));
        }else{
            System.out.println("Has introduit mes d' un caracter");
        }
        //Trobar el caracter "x"
        System.out.println(frase.toUpperCase()); // String a majuscules
        //Saber si la primera lletra es "E"
        if(frase.charAt(0) == 'E'){
            System.out.println("El primer caracter si es la 'E'");
        }else{
            System.out.println("El primer caracter no es la 'E'");
        }
        //Saber si la primera lletra es "E"
    }
    
}
