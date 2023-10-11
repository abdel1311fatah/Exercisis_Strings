
package cadena12;

import java.util.Scanner;


public class Cadena12 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase: ");
        String frase = lector.nextLine();
        System.out.println("Escriu un altra frase: ");
        String frase2 = lector.nextLine();
        System.out.println(frase + " " + frase2);
    }
    
}
