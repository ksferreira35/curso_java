// Programa que permite o usuário digitar números e no final mostra alguns fatores, como total de números, total de números pares digitados e etc 
import java.util.Scanner;

public class ex047 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int n, totalValores = 0, totalPares = 0, totalImpares = 0, acimaDe100 = 0;
            int soma = 0; // Vai ser usado para calcular a média

            do {
                System.out.print("Digite um número (0 para sair): ");
                n = input.nextInt();

                if (n != 0) {
                    totalValores++;
                    soma += n; // Somando os valores
                    
                    if (n % 2 == 0) {
                        totalPares++;
                    } else {
                        totalImpares++;
                    }

                    if (n > 100) {
                        acimaDe100++;
                    }
                }

            } while (n != 0);

            input.close();

            double media = (totalValores > 0) ? (double) soma / totalValores : 0;

            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Total de valores digitados: " + totalValores);
            System.out.println("Total de números pares: " + totalPares);
            System.out.println("Total de números ímpares: " + totalImpares);
            System.out.println("Quantidade acima de 100: " + acimaDe100);
            System.out.println("Média dos valores: " + media);
        }
    }
}
// Desenvolvido por Kaiky - 2025
