// Programa que adiciona o número zero na lista utilizando Arrays.fill
import java.util.Arrays;

public class ex057 {
    public static void main(String[] args) {
        int num[] = new int[20];
        Arrays.fill(num, 0);
        
        for (int n:num) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
