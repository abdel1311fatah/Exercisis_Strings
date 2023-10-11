package com.mycompany.repte1;

import java.util.Scanner;
public class Repte1 {
  int[] llistaEnters = new int[10];
  public static void main(String[] args) {
    Repte1 programa = new Repte1();
    programa.inici();
  }
  public void inici() {
    llegirLlista();
    ordenarLlista();
    mostrarLlista();

  }
  //Mètode amb les instruccions per llegir la llista.
  public void llegirLlista() {
    System.out.println("Escriu 10 valors enters i prem retorn.");
    Scanner lector = new Scanner(System.in);
    int index = 0;
    while (index < llistaEnters.length) {
      if (lector.hasNextInt()) {
        llistaEnters[index] = lector.nextInt();
        index++;

      } else {
        lector.next();

      }

    }
    lector.nextLine();

  }
  //Mètode amb les instruccions per ordenar la llista.
  public int [] ordenarLlista() {

    for (int i = 0; i < llistaEnters.length - 1; i++) {

      for (int j = i + 1; j < llistaEnters.length; j++) {
        //La posició tractada té un valor més alt que el de la cerca... Els intercanviem.
        if (llistaEnters[i] > llistaEnters[j]) {
          //Per intercanviar valors cal una variable auxiliar
          int canvi = llistaEnters[i];
          llistaEnters[i] = llistaEnters[j];
          llistaEnters[j] = canvi;
        }
      }
    }
    return llistaEnters;
  }

  public void mostrarLlista() {
      int [] upper = new int [llistaEnters.length];
      int upperNum = 0;
    System.out.print("L’array ordenat és: [ ");
//Llegir i mirar el mes gran
    for (int i = 0; i < llistaEnters.length; i++) {
      System.out.print(llistaEnters[i] + " ");
      if(upper[i]<llistaEnters[i]){
          upperNum = llistaEnters[i];
      }
    }
    System.out.println("]");
     for (int i = 0; i < llistaEnters.length; i++) {
      if((upperNum / 2) < llistaEnters[i]){
          upper[i] = llistaEnters[i];
          System.out.println(upper[i] + " es mes gran que " +upperNum+ " partir entre 2 ");
      }
      
    }
    
  }

}