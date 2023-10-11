package repte2;
import java.util.Scanner;
public class Repte2 {
    public static final char RESPOSTA_CORRECTA = 'b';
    public static void main (String[] args) {
        boolean valorCorrecte = false;
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Endevina la pregunta.");
        System.out.println("Quin dels següents no és un tipus primitiu?");
        System.out.println("a) Enter");
        System.out.println("b) Scanner");
        System.out.println("c) Caràcter");
        System.out.println("d) Booleà");
        for (int c1 = 0;c1 <=3; c1++){
            System.out.print("La teva resposta és l’opció: ");
            String paraula = lector.next();
            if (paraula.length() == 1) {
                char caracter = paraula.charAt(0);
                if ((caracter >= 'a')&&(caracter <= 'd')) {

                    if (caracter == RESPOSTA_CORRECTA) {
                        valorCorrecte = true;
                        System.out.println("Efectivament, la resposta era ’" + RESPOSTA_CORRECTA + "’.");
                    } else {
                        System.out.println("La resposta ’" + caracter + "’ és incorrecta.");
                    }
                } else {
                    System.out.println("’" + caracter + "’ és una opció incorrecta.");
                }
            } else {
                System.out.println(paraula + " no és un caràcter individual.");
            }
            lector.nextLine();
            if(valorCorrecte){
                c1 = 3;
            }
        }
    }
}