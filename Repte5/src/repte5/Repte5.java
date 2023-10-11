package repte5;

import java.util.Scanner;


public class Repte5 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase: ");
        System.out.println("");
        String frase = lector.nextLine();
        String[] espais = frase.split(" ");
        for (int i = 0; i < espais.length; i++) {
            System.out.println(espais[i]);
        }
    }
}