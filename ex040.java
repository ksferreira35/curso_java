// Programa que faz uma contagem regressiva de 0 até 5
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ex040 {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Digite o fim da contagem: ");
            int fim = input.nextInt();
            int cc = 0;

            while (cc < (fim + 1)) {
                System.out.println(cc);
                cc++;
                TimeUnit.SECONDS.sleep(1);
            }
        }
    }
}
