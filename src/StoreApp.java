import java.util.Scanner;

public class StoreApp {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Menu \n" +
                "1) Sale \n" +
                "2) Print Receipt \n" +
                "3) Exit");

        int option = input.nextInt();


        String ContinueShopping = "";

  do {
      if(option == 1){
          System.out.println(addToCart());
          System.out.println("Continue Shopping? [Y/N]");
          ContinueShopping = input.next();
      } else if (option == 2) {
          System.out.println("Print Receipt");
      }else if(option == 3) {
          System.out.println("Exit");
      }else {
          System.out.println("not valid");
      }
  }while (ContinueShopping.equalsIgnoreCase("Y"));

//  if (ContinueShopping.equals("N")){
//      System.out.println("Would you like to print your receipt? [Y/N]");
//      int receipt = input.nextInt();
//      System.out.println("Printing Receipt:" + addToCart());
  }


    }


    public static String addToCart(){
        System.out.println("What would you like to buy?");
        String item = input.next();
        System.out.println("How much does it cost?");
        int costOfItem = input.nextInt();
        System.out.println("How many");
        int numberOfItems = input.nextInt();
        return ("1) " + item + " x" + numberOfItems + "  :$" + numberOfItems * costOfItem);

    }
}
