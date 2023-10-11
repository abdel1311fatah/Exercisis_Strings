
package com.mycompany.proba1;
import java.util.*;

public class Proba1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase: ");
        String frase = lector.nextLine();
        System.out.println("Escriu un caracter: ");  
        char x = lector.next().charAt(0);
        int repetides = 0;
        for (int c1 = 0; c1 < frase.length(); c1++){
            char y = frase.charAt(c1);
            if(y == x){
                repetides++;
            }
        }
        System.out.println(repetides);
    }
}
