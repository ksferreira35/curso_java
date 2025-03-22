// Programa que utiliza uma função do Arrays de encontrar um número em uma determinada posição
import java.util.Arrays;

public class ex056 {
    public static void main(String[] args) {
        int vet[] = {3, 9, 5, 1, 2, 6, 13};
        for (int v:vet) {
            System.out.print(v + " ");
        }
        System.out.println(" ");
        int p = Arrays.binarySearch(vet, 13);
        System.out.println("Foi encontrado o valor na posição: " + p);
    }
}
// Desenvolvido por Kaiky - 2025
