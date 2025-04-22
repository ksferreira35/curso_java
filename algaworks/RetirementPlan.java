    import java.util.Scanner;

    public class RetirementPlan {
        static final Integer MINIMUM_AGE = 55;
        static final Integer MINIMUM_CONTRIBUTIONS = 25;
        @SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int age;
            int contributions;

            System.out.print("How old are you? ");
            age = scanner.nextInt();

            System.out.print("How many years of contributions do you have? ");
            contributions = scanner.nextInt();

            boolean retirement = (age >= MINIMUM_AGE && contributions >= MINIMUM_CONTRIBUTIONS);

            if (retirement) {
                System.out.println("You can retire");
            } else {
                System.out.println("You still can't retire");
            }

            scanner.close();
        }
    }
    