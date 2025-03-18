import java.util.Scanner;

public class ex037 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o número de pernas: ");
            int pernas = input.nextInt();
            
            String tipo = "Mutante";

            switch (pernas) {
                case 1 -> tipo = "Saci";
                case 2 -> tipo = "Bípede";
                case 4 -> tipo = "Quadrúpede";
                case 6, 8 -> tipo = "Aranha";
                default -> {
                    if (pernas > 8) {
                        tipo = "ET";
                    }
                }
            }

            System.out.printf("Um animal com %d pernas é um %s.\n", pernas, tipo);
        }
    }
}
