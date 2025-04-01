// Programa que utiliza operadores ternários para dizer se o usuário e menor ou maior de idade
import java.util.Scanner;

public class ex024 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int ano;
            System.out.print("Em que ano você nasceu? ");
            ano = input.nextInt();

            int idade;
            idade = 2025 - ano;
            
            String sit;
            sit = (idade>=18)?"MAIOR":"MENOR";
            
            System.out.printf("Você tem ou vai fazer %d anos, por isso você é %s de idade.\n", idade, sit);
        }
    }
}
// Desenvolvido por Kaiky - 2025
