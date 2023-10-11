
package cadena10;


public class Cadena10 {

    
    public static void main(String[] args) {
        String frase = "Optimice el espacio de su escritorio gracias a su tamaño reducido y a las sorprendentes \n"
        + "características de organización de cables. Coloque hasta dos monitores de 68,6 cm sin herramientas.";
        int repetides = 0;
        for (int c1 = 0; c1 < frase.length(); c1++){
            char c = frase.charAt(c1);
            if (c == 'a'){
                repetides++;
            }
        }
        System.out.println("A la frase: \n " + frase + " \nLa lletra a es repeteix " + repetides + " vegades");
    }
    
}
