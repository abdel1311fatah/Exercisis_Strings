
package cadena6;
import java.util.Scanner;

public class Cadena6 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase: ");
        String frase = lector.nextLine();
        System.out.println("Escriu un caracter: ");
        char a = lector.next().charAt(0);
        int repetides = 0;
        for (int c1 = 0; c1 < frase.length(); c1++){
            char c = frase.charAt(c1);
            if (a == c){
                repetides++;
            }
        }
        System.out.println("La lletra " + a + " es repeteix " + repetides + " vegades");
    }
    
}
