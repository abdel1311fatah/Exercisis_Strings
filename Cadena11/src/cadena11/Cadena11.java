
package cadena11;

import java.util.Scanner;

public class Cadena11 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase: ");
        String frase = lector.nextLine();
        String [] retallada = frase.split(" ");
        for (int c1 = 0; c1 < frase.length(); c1++){
            System.out.println(retallada[c1]); 
        }
       
    }
    
}
