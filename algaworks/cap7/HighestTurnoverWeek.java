package cap7;
public class HighestTurnoverWeek {
    public static void main(String[] args) {
        Double[] weekOne = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
        Double[] weekTwo = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
        Double[] weekThree = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
        Double[] weekFour = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

        Double[][] month = new Double[][] { weekOne, weekTwo, weekThree, weekFour };

        Double highestTotal = 0.0;
        int weekWithHighestTotal = 0;

        for (int i = 0; i < month.length; i++){
            Double weeklyTotal = 0.0;
            for (Double item : month[i]) {
                weeklyTotal += item;
            }

            if (weeklyTotal > highestTotal) {
                highestTotal = weeklyTotal;
                weekWithHighestTotal = i + 1;
            }
        }

        System.out.println("Week with the highest turnover: Week " + weekWithHighestTotal + "\nTotal value: $" + highestTotal);
    }
}
