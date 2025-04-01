// Programa que permite a entrada de valores, para inicio, fim e passos. Para mostrar uma contagem com os valores dados, com um limite no valor de cada um.
import java.util.Scanner;

public class ex051 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int i = 0, f = 0, p = 0;

            // Entrada do início
            while (true) {
                System.out.print("Digite o início (não maior que 5): ");
                i = input.nextInt();
                if (i > 5) {
                    System.out.println("O início não pode ser maior que 5. Tente novamente.");
                } else {
                    break; 
                }
            }

            // Entrada do fim
            while (true) {
                System.out.print("Digite o fim (não maior que 20): ");
                f = input.nextInt();
                if (f > 20) {
                    System.out.println("O fim não pode ser maior que 20. Tente novamente.");
                } else {
                    break; 
                }
            }

            // Entrada do passo
            while (true) {
                System.out.print("Digite o passo (não maior que 4): ");
                p = input.nextInt();
                if (p > 4) {
                    System.out.println("O passo não pode ser maior que 4. Tente novamente.");
                } else {
                    break; 
                }
            }

            // Exibindo a contagem com as condições fornecidas pelo o usuário
            System.out.println("Contagem: ");
            for (int j = i; j <= f; j += p) {
                System.out.print(j + " ");
            }
            System.out.println();

            input.close();
        }        
    }
}
// Desenvolvido por Kaiky - 2025
