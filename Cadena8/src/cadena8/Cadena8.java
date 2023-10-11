
package cadena8;

import java.util.Scanner;


public class Cadena8 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase: ");
        String frase = lector.nextLine();
        System.out.println("Escriu un caracter: ");       
        char a = lector.next().charAt(0);
        char [] comproba = frase.toCharArray();
        for (int c1 = 0; c1 < frase.length(); c1++){
            char c = frase.charAt(c1);
            comproba[c1] = c;
            if (comproba[c1] == a){
                comproba[c1] = Character.toUpperCase(c);
            }
        }
        for (int c1 = 0; c1 < comproba.length; c1++){   
            System.out.print(comproba[c1]);
        }
    }
    
}
