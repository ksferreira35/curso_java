// Programa que permite o usuário digitar seu ano de nascimento e a partir disso descobre a sua idade.
import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Que ano você nasceu? ");
            int ano = input.nextInt();
            int idade = 2025 - ano;
            System.out.println(idade);
        }    
    }
}
// Desenvolvido por Kaiky - 2025
