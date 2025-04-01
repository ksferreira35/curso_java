
import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {
    @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your weight? (kg)");
        Float weight = scanner.nextFloat();

        System.out.print("What is your height? (m)");
        Float height = scanner.nextFloat();

        Float IMC = weight / (height * height);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Your IMC is " + df.format(IMC));

        scanner.close();

    }
    
}
