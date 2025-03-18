import java.util.Scanner;

public class ex036 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o número de pernas: ");
            int pernas = input.nextInt();
            
            String tipo = "Mutante";

            if (pernas == 1) {
                tipo = "Saci";
            } else if (pernas == 2) {
                tipo = "Bípede";
            } else if (pernas == 4) { 
                tipo = "Quadrúpede";
            } else if (pernas == 6 || pernas == 8) {
                tipo = "Aranha";
            } else if (pernas > 8) {
                tipo = "ET";
            }

            System.out.printf("Um animal com %d pernas é um %s.\n", pernas, tipo);
            
            input.close();
        }    
    }
}
