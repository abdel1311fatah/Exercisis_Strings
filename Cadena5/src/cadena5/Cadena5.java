
package cadena5;

import java.util.Scanner;


public class Cadena5 {

  
    public static void main(String[] args) {
        int upper = 0, lower = 0, chars = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase: ");
        String frase = lector.nextLine();
        
        for (int c1 = 0;c1 < frase.length(); c1++){
            if(Character.isUpperCase(frase.charAt(c1))){
                upper++;
            }
            if(Character.isLowerCase(frase.charAt(c1))){
                lower++;
            } 
            chars = c1;
        }
        chars++;
        System.out.println("Hi han " + upper + " majuscules i hi han " + lower + " minuscules en una frase de " + chars + " caracters");
    }
    
}