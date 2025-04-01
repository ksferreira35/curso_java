// Programa que ajuda no entendimento do for, parecido com o for in range(0,16,2).
public class ex052 {
    public static void main(String[] args) {
        for(int i=0; i<=15; i+=2) {
            if (i % 3 == 0) continue;
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
// Desenvolvido por Kaiky - 2025
