public class VectorMoreThanTwoDimensions {
    public static void main(String[] args) {
        Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
        Double[] faturamentoFevereiro = new Double[] { 1000.0, 2500.0, 1800.0 };

        Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };

        Double[][][] faturamentoQuinquenal = new Double[][][] { faturamentoAnual };

        @SuppressWarnings("unused")
        Double[][][][] faturamentoDaDecada = new Double[][][][] { faturamentoQuinquenal  };
    }
}
