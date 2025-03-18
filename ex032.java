
import java.util.Scanner;

public class ex032 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Em que ano você nasceu? ");
            int nasc = input.nextInt();
            int idade = 2025 - nasc;
            System.out.printf("Você tem %d anos de idade.\n", idade);
            if (idade < 16) {
                System.out.println("NÃO VOTA!");

            } else if (idade >= 16 && idade < 18) {
                System.out.println("O voto é OPCIONAL!");

            } else if (idade >= 18 && idade <= 70) {
                System.out.println("O voto é OBRIGATÓRIO!");

            } else {
                System.out.println("O voto é OPCIONAL!");
            }
        }
    }
}
