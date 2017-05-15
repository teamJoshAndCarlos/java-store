import java.util.Scanner;

public class StoreApp {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String ContinueShopping = "";
        String receipt = "";
        int option;
        int itemNumber = 0;
        int total = 0;
        do {
            System.out.println("Menu \n" +
                    "1) Sale \n" +
                    "2) Print Receipt \n" +
                    "3) Exit");
            option = input.nextInt();

            if (option == 1) {
                do {
                    itemNumber++;
                    System.out.println("What would you like to buy?");
                    String item = input.next();
                    System.out.println("How much does it cost?");
                    int costOfItem = input.nextInt();
                    System.out.println("How many");
                    int numberOfItems = input.nextInt();
                    receipt += addToCart(itemNumber, numberOfItems, costOfItem, item);
                    total = finalTotal(numberOfItems, costOfItem, total);
                    System.out.println("Continue Shopping? [Y/N]");
                    ContinueShopping = input.next();
                } while (ContinueShopping.equalsIgnoreCase("Y"));
            } else if (option == 2) {
                System.out.println("Print Receipt");
                System.out.println(receipt);
                System.out.println("Total: $" + total);
                option = 3;
            } else if (option == 3) {
                System.out.println("Exit");
            } else {
                System.out.println("not valid");
            }

        } while (option != 3);
        System.out.println("Thank you, come again!");


//  if (ContinueShopping.equals("N")){
//      System.out.println("Would you like to print your receipt? [Y/N]");
//      int receipt = input.nextInt();
//      System.out.println("Printing Receipt:" + addToCart());
//    }


    }


    public static String addToCart(int itemNumber, int numberOfItems, int costOfItem, String item) {
        int total = numberOfItems * costOfItem;
        return (itemNumber + ") " + item + " @" + costOfItem + " x" + numberOfItems + " :$" + total + "\n");
    }

    public static int finalTotal(int numberOfItems, int costOfItem, int total){
        int subtotal = numberOfItems * costOfItem;
        int finalTotal = total + subtotal;
        return finalTotal;

    }


//    public static String printReceipt() {
//
//    }
}
