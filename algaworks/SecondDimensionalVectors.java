public class SecondDimensionalVectors {
    public static void main(String[] args) {
        Double[] JanuaryBilling = new Double[] { 1500.0, 2000.0, 1700.0 };
        Double[] FebruaryBilling = new Double[] { 1000.0, 2500.0, 1800.0 };
        
        Double[][] AnnualBilling = new Double[][] { JanuaryBilling, FebruaryBilling };

        System.out.println("Billing on the first of January " + AnnualBilling[0][0]);
        System.out.println("Billing on the third of February " + AnnualBilling[1][2]);
    }
}
