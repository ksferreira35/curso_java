public class InteractionFor {
    public static void main(String[] args) {
//      for(int i = 1; i <= 5; i+
//          System.out.println(i + ": Any phrase.");
//      }
/*
    Double[] shoppingCart = new Double[]{
        50.0,
        51.0,
        52.0,
    };

    Double total = 0.0;

    for (int i = 0; i < shoppingCart.length; i++) {
        System.out.println("Index " + (i + 1) + ": $" + shoppingCart[i]);
        total += shoppingCart[i];
    }
    System.out.println("Total:" + "   " + "$" + total);
*/

        /*
            for(int i = 0; i < 10; i++) {
                if (i == 6) {
                System.out.println("Stop!");
                break;
                }
                System.out.println("Index " + i);
            }
        */
        /*
        for(int i = 0; i < 10; i++) {
            if (i == 6) {
            i = 0;
            System.out.println("Return!");
            continue;
            }
            System.out.println("Index " + i);
        }
        */

Integer[] products = new Integer[]{
        100, 
        225, 
        300, 
        66, 
        320, 
        180, 
        421, 
        489, 
        322, 
        236,
        232, 
        431, 
        431, 
        181, 
        52, 
        344, 
        217, 
        348, 
        174, 
        30, 
        225, 
        58, 
        400, 
        91, 
        171, 
        275, 
        172, 
        120, 
        18, 
        265, 
        230, 
        178, 
        212, 
        300, 
        196, 
        204, 
        340, 
        5, 
        214, 
        151, 
        22, 
        49, 
        430, 
        96, 
        55, 
        206, 
        329, 
        210, 
        230, 
        148, 
        85, 
        200, 
        278, 
        179, 
        179, 
        202, 
        12, 
        183, 
        122, 
        50, 
        78, 
        257, 
        171, 
        219, 
        83, 
        296, 
        110, 
        7, 
        173, 
        316, 
        222, 
        147, 
        141, 
        284, 
        290, 
        162, 
        302, 
        134, 
        248, 
        129, 
        128, 
        57, 
        281, 
        180, 
        52, 
        218, 
        225, 
        97, 
        116, 
        199, 
        317, 
        39, 
        35, 
        164, 
        239, 
        56, 
        260, 
        30, 
        188,
        832,
    };

        for(int i = 0; i < products.length; i++) {
            Integer product = products[i];

            String output = "Product " + i + ": " + product;

            if (product.equals(225) || product.equals(832)) {
                output += " [🎯 Product Found]";
            }           
            System.out.println(output);
        }
    }
}