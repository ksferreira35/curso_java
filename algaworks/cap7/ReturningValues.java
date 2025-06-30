package cap7;
public class ReturningValues {
    public static void main(String[] args) {
        Double[] premissaInicial = new Double[] { 50.0, 100.0 };

        Double proporcao = 20.0;
        Double resultadoFinal = regraDeTres(premissaInicial, proporcao);

        System.out.println("O resultado é: " + resultadoFinal);
    }

    static Double regraDeTres(Double[] premissa, Double proporcacao) {
        Double resultado = (premissa[0] * proporcacao) / premissa[1];
        return resultado;
    }
}
    