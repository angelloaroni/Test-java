import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);

        String palabra = "elmousepro123";
        int intentos_Max = 10;
        int intentos = 0;

        boolean fueadivinada = false;
        char[] letrasAdivinadas = new char[palabra.length()];
        
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_'; // toda la palabra se convierte a "_"

        }

        while(!fueadivinada && intentos < intentos_Max){ //se usa cuando creas una palabra de chars?
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));

            System.out.print("Introduce una letra: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0)); //CharAt 0 devuevle solo la priumer letra, buen metodo

            boolean letra_correcta = false;
            
            for (int i = 0; i < palabra.length(); i++) {

                if (palabra.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letra_correcta = true;
                }    
            }

            if (!letra_correcta){
                intentos++;
                System.out.println("Esta letra no se encontraba en la palabra. Te quedan: " + (intentos_Max - intentos)+ " intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabra)){
                fueadivinada = true;
                System.out.println("Felicidades, adivinaste, la palabra era: " +palabra);
            }
        }
        if(!fueadivinada){
            System.out.println("Te has quedado sin intentos :S");

        }
        scanner.close();
    }
}
