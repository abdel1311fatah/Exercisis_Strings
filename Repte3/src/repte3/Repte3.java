
package repte3;

import java.util.Scanner;


public class Repte3 {

    public static void main(String[] args) {
        String text = "";
        char lletra = 'a';
        char espai = ' ';
        int a = 0, c2 = 0, espais = 0;
        System.out.println("Escriu el text: ");
        Scanner lector = new Scanner(System.in);
        text = lector.nextLine();
        for(int c1=0; c1<text.length(); c1++){
            if(text.charAt(c1) == lletra){
                a++;
            }else if(text.charAt(c1) == espai){
                espais++;
            }else{
                c2++;
            }
        }
        System.out.println("Hi hann: "+ a +" lletres 'a', tambe hi han " +espais+ " espais i hi han " +c2+ " altres caracters");
    }

}