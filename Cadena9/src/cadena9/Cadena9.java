
package cadena9;

import java.util.Scanner;


public class Cadena9 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase: ");
        String frase = lector.nextLine();
        String resultat = frase.replaceAll("\\s","");
        System.out.println(resultat);
    }
    
}
