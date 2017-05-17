package Java1;

/**
 * Created by jsr on 5/17/17.
 */
public class InputTest {
    public static void main(String[] args) {
        InputValidation inputname = new InputValidation();
        System.out.println("Enter your name: ");
        String name = inputname.getString();
        System.out.println(name);

        InputValidation inputyesno = new InputValidation();
        System.out.println("Are you cool?: ");
        Boolean answer = inputyesno.yesNo();
        System.out.println(answer);

        InputValidation inputInt = new InputValidation();
        System.out.println("Enter a number: ");
        int min = 4; int max = 10;
        int number = inputInt.getInt(min, max);
        System.out.println(number);



    }


}
