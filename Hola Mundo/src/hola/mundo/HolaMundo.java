
package hola.mundo;


public class HolaMundo {

   
public static void main(String[] args) {
    String holaMundo = "Hello world";
    for (int i = holaMundo.length() - 1; i >= 0; i--) {
      System.out.print(holaMundo.charAt(i));
    }
    System.out.println("");
  }
    
}
