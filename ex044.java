// Programa que calcula os valores finais de 'i' e 'a' após um loop com condições específicas.
public class ex044 {
    public static void main(String[] args) {
        int i = 1;
        int a = 0;
        
        while (i < 10) {
            ++a;
            i += 1;
            if (a>6) ++i;
        }
        System.out.println(i);
        System.out.println(a);
    }
}
// Desenvolvido por Kaiky - 2025
