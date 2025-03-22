// Programa que calcula o fatorial de um número e exibe a fórmula.
package ex072;

public class Fatorial {

    @SuppressWarnings("unused")
    private int num = 0;
    private int fat = 1;
    private String formula = "";


    public void setValor(int n) {
        num = n;
        int f = 1;
        String s = ""; 
        for(int c = n; c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }


    public int getFatorial() {
        return fat;
    }


    public String getFormula() {
        return formula;
    }

}
// Desenvolvido por Kaiky - 2025
