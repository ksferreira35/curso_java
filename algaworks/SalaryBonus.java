import java.util.Scanner;

public class SalaryBonus {
    static final double INVALID_VALUE = -1.0; 
    static final double BONUS_PERCENTAGE = 0.8;

    @SuppressWarnings("ConvertToTryWithResources") 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double annualGoal;
        double actualRevenue;
        double employeeSalary;

        annualGoal = getInput(scanner, "What was the annual goal? ");
        actualRevenue = getInput(scanner, "What was the actual revenue? ");
        employeeSalary = getInput(scanner, "What is the employee's salary? ");


        if (annualGoal == INVALID_VALUE || actualRevenue == INVALID_VALUE || employeeSalary == INVALID_VALUE) {
            System.out.println("One or more inputs were invalid. Please try again.");
        } else {
            calculateBonus(annualGoal, actualRevenue, employeeSalary);
        }

        scanner.close();
    }

    public static double getInput(Scanner scanner, String message) {
        double input = INVALID_VALUE; 
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print(message);
                input = scanner.nextDouble();

                if (input < 0) {
                    System.out.println("Please enter a positive number.");

                } else if (message.contains("salary") && input <= 0) {
                    System.out.println("Salary must be greater than zero.");

                } else {
                    valid = true;
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();
            }
        }

        return input;
    }

    public static void calculateBonus(double annualGoal, double actualRevenue, double employeeSalary) {
        if (actualRevenue >= annualGoal) {
            double bonusAmount = employeeSalary;

            System.out.printf("You received a bonus! \nSalary: $%.2f \nBonus: $%.2f \nFinal Salary: $%.2f\n",
                    employeeSalary, bonusAmount, employeeSalary + bonusAmount);

        } else if (actualRevenue >= BONUS_PERCENTAGE * annualGoal) {
            double bonusAmount = BONUS_PERCENTAGE * employeeSalary;

            System.out.printf("You received a bonus! \nSalary: $%.2f \nBonus: $%.2f \nFinal Salary: $%.2f\n",
                    employeeSalary, bonusAmount, employeeSalary + bonusAmount);

        } else {
            System.out.printf("Unfortunately, no bonus for this period. Final Salary: $%.2f\n", employeeSalary);
        }
    }
}
