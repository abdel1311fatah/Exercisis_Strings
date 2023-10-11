
package com.mycompany.examena;

import java.util.Scanner;


public class ExamenA {

    public static void main(String[] args) {
        String frase = "Mañana es sabado  y voy a ir cenar con los amigos por la zona de marcha de Logroño"; 
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase: ");
        String frase2 = lector.nextLine();
        int m = 0, o = 0, e = 0;
        boolean iguals = false;
        for (int c1 = 0; c1 < frase.length(); c1++){
            char x = frase.charAt(c1);
            if (x == 'm'){
                m++;
            }
        }
        System.out.println("Hi han " + m + " lletres m");
        iguals = (frase.equals(frase2));
        if (iguals){
            System.out.println("Son iguals");
        }else{
            System.out.println("No son iguals");
        }
    }
}
