import java.util.Scanner;

public class StoreApp {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String ContinueShopping = "";
        String receipt = "";
        int option;
        int itemNumber = 0;
        double total = 0;
        System.out.println("Enter your Name");
        String customerName = input.nextLine();
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
                    String item = input.next();  // tried using .nextLine but my receipt only captures the enter for some reason.
//                    input.nextLine(); // Remove the trailing enter
                    System.out.println("How much does it cost?");
                    double costOfItem = input.nextDouble();
                    System.out.println("How many?");
                    int numberOfItems = input.nextInt();
                    receipt += addToCart(itemNumber, numberOfItems, costOfItem, item);
                    total = finalTotal(numberOfItems, costOfItem, total);
                    System.out.println("Continue Shopping? [Y/N]");
                    ContinueShopping = input.next();
                } while (ContinueShopping.equalsIgnoreCase("Y"));
            } else if (option == 2) {
                System.out.println("Printing Receipt");
                System.out.println("***************************");
                System.out.println("     //////////////");
                System.out.println("    //            ///");
                System.out.println("   //              ///");
                System.out.println("  //                ///");
                System.out.println(" ////////////        ///");
                System.out.println("           ///        ///");
                System.out.println("            ///      ///");
                System.out.println("             ///    ///");
                System.out.println("              ///  ///");
                System.out.println("                ///");
                System.out.println("");
                System.out.println("       coolstore.com");
                System.out.println("      San Antonio, TX");
                System.out.println("-----------------------------");
                System.out.println("Customer: " + customerName);
                System.out.println(receipt);
                System.out.printf("Total: $%.2f \n", total);
                System.out.println("***************************");
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


    public static String addToCart(int itemNumber, int numberOfItems, double costOfItem, String item) {
        double total = numberOfItems * costOfItem;
        return String.format(itemNumber + ") %-10s@%-6.2fx%-3d:$%.2f\n",item , costOfItem, numberOfItems, total );
    }

    public static double finalTotal(int numberOfItems, double costOfItem, double total){
        double subtotal = numberOfItems * costOfItem;
        double finalTotal = total + subtotal;
        return finalTotal;

    }


//    public static String printReceipt() {
//
//    }
}
