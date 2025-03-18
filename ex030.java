// Programa que analisa a idade é mostra se a pessoa é maior ou menor de idade.
import java.util.Scanner;

public class ex030 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Em que ano a pessoa nasceu? ");
            int nasc = input.nextInt();
            int idade = 2025 - nasc;
            
            if (idade>=18) {
                System.out.println("A pessoa é MAIOR de idade");
            } else {
                System.out.println("A pessoa é MENOR de idade");
            }    
        }
    }
}
// Desenvolvido por Kaiky - 2025
