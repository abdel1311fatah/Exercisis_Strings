
package com.mycompany.repte2_2;

import java.util.Scanner;

public class Repte2_2 {

    public static void main(String[] args) {
        Repte2_2 programa = new Repte2_2();
        programa.inici();
    }
    
    public void inici() {
        numero();
        printar();
    }
    public void numero(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu un numero: ");
        if (lector.hasNextInt()) {
            int numero = lector.nextInt();
            lector.nextLine();
            for (int c2 =0; c2<=numero;c2++){
                printar();
            }
        }else{
            lector.next();
        }
    }
    public void printar(){
        System.out.print(" * ");
    }
}
