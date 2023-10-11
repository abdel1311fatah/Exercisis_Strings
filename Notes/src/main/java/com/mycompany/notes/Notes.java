
package com.mycompany.notes;

import java.util.Scanner;

public class Notes {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix numeros: ");
        String frase = lector.nextLine();
        String [] retallada = frase.split(" ");
        int [] numeros = new int[retallada.length];
        int suma = 0;
        for (int c1 = 0; c1 < frase.length(); c1++){
            numeros[c1] = Integer.parseInt(retallada[c1]);
            suma += numeros [c1];
            System.out.println(suma); 
        }
        
    }
    
}
