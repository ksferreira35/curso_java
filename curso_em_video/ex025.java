// Programa básico que analisa sua idade e diz se o seu voto e opcional ou não opcional sem utilizar if e else.
import java.util.Scanner;

public class ex025 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int ano;
            System.out.print("Em que ano você nasceu? ");
            ano = input.nextInt();

            int idade;
            idade = 2025 - ano;
            
            String sit;
            sit = ((idade >= 16 && idade < 18) || (idade > 70)) ? "É OPCIONAL" : "NÃO É OPCIONAL";
            
            System.out.printf("Você tem ou vai fazer %d anos, por isso o voto %s.\n", idade, sit);
        }
    }
}
// Desenvolvido por Kaiky - 2025
