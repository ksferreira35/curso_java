// Programa que permite a operacao.contador, funcionar em outro programa utlizando public.
package ex070;

public class operacao {

    public static String contador(int i, int f) {
        String s = "";
        for (int c = i; c <= f; c++) {
            s += c + " ";
        }
        return s;
    } 
}
// Desenvolvido por Kaiky - 2025
