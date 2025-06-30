package cap5;
import java.util.Scanner;

public class DaysWeek {
    @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfTheWeek;
        String dia;

        System.out.println("Digite o número referente ao dia da semana: ");
        daysOfTheWeek = scanner.nextInt();

        dia = switch (daysOfTheWeek) {
            case 1 -> "domingo";
            case 2 -> "monday";
            case 3 -> "tuesday";
            case 4 -> "wednesday";
            case 5 -> "thursday";
            case 6 -> "friday";
            case 7 -> "saturday";
            default -> "INVÁLIDO";
        };
        System.out.println("O dia escolhido foi: " + dia);

        scanner.close();
    }
}
