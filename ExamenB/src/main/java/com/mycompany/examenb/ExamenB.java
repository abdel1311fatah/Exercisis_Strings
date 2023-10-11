/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examenb;

/**
 *
 * @author abel1
 */
public class ExamenB {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu paraules: ");
        String text1 = lector.nextLine();
        String [] str = text1.split(" ");
        String text2 = "";
        String text3 = "";
        for (int c1 = 0; c1 <= text1.length(); c1++){
            text2 = str.toUpperCase(text1.charAt(0));
            text3 = text1;
            System.out.println(text3.toUpperCase());
        }
    }
}
