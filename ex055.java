// Programa que deixa em ordem crescente os números fornecidos pelo num[]
import java.util.Arrays;

public class ex055 {
    public static void main(String[] args) {
        int num[] = {3, 5, 1, 8, 4};
        Arrays.sort(num);
        for (int valor: num) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
// Desenvolvido por Kaiky - 2025
