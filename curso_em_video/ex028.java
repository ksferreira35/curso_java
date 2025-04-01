// Um mini jogo criado de adivinhação v1.0.0
import java.util.Scanner;

public class ex028 {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("Estou pensando em um número de 1 a 5, consegue descobrir?");

            Thread.sleep(3000);

            double valor = 1 + Math.random() * (6-1);
            int cpu = (int) valor;

            System.out.print("Que número eu pensei? ");
            int user = input.nextInt();

            String f1 = "Você acertou!!";
            String f2 = "Você errou! o número pensado foi " + cpu;

            String resposta = (cpu == user) ? f1 : f2;
            System.out.println(resposta);
        }
    }
}
// Desenvolvido por Kaiky - 2025
