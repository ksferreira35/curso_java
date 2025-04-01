// Programa que analisa a idade do usuário de mostra se o voto e opcional, obrigatório e não vota, com alterações que deixa o código mais leve e limpo.
import java.util.Scanner;

public class ex035 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Em que ano você nasceu? ");
            int nasc = input.nextInt(); 
            int idade = 2025 - nasc;

            System.out.printf("Você nasceu em %d, ou seja, tem ou vai fazer %d anos de idade.\n", nasc, idade);

            if (idade < 16) {
                System.out.println("Você não vota!");
            } else if ((idade >= 16 && idade < 18) || idade > 70) {
                System.out.println("O seu voto é Opcional!");
            } else {
                System.out.println("O seu voto é Obrigatório!");
            }
        }
    }
}
// Desenvolvido por Kaiky - 2025
