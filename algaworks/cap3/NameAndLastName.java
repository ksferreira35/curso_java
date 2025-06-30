package cap3;
import java.util.Scanner;

public class NameAndLastName {
        @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String lastname;
        String complete;

        System.out.print("What is your name? ");
        name = scanner.nextLine();

        System.out.print("What is your last name? ");
        lastname = scanner.nextLine();

        complete = name + " " + lastname;

        System.out.printf("Hi, your name is %s. \n", complete);

        scanner.close();
    }
}
