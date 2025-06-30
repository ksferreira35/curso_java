package cap7;
@SuppressWarnings("ConvertToTryWithResources") // The scanner is underlined, so I added this to prevent it from being underlined in VSCode.

public class OneDimensionVectors {
    public static void main(String[] args) {
        // String[] menu = new String[] {
        //     "Pepperoni",
        //     "Tuna",
        //     "Cheese",
        //     "Ham"
        // };

        // System.out.println("Choose a flavor:");

        // for(int i = 0; i < menu.length; i++) {
        //     System.out.println("[" + i + "] " + menu[i]);
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the number corresponding to the flavor: ");
        // int flavor = scanner.nextInt();

        // System.out.println("Your chosen flavor is " + menu[flavor] + ".");

        // scanner.close();

        // String[] menu = new String[] {
        //     "Pepperoni",
        //     "Tuna",
        //     "Cheese",
        //     "Ham"
        // };

        // menu[3] = "Chicken";

        // for(int i = 0; i < menu.length; i++) {
        //     System.out.println("[" + i + "] " + menu[i]);
        // }

        String[] menu = new String[4];
        menu[0] = "Pepperoni";
        menu[1] = "Tuna";
        menu[2] = "Cheese";
        menu[3] = "Ham";

        for(int i = 0; i < menu.length; i++) {
            System.out.println("[" + i + "] " + menu[i]);
        }
    }
}
