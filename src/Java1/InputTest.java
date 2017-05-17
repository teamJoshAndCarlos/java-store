package Java1;

import org.w3c.dom.ranges.Range;

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

        InputValidation inputRangeInt = new InputValidation();
        System.out.println("Enter a number within the parameters: ");
        int min = 4;
        int max = 10;
        int Rangenumber = inputRangeInt.getInt(min, max);
        System.out.println(Rangenumber);

        InputValidation inputInt = new InputValidation();
        System.out.println("Enter any number: ");
        int number = inputInt.getInt();
        System.out.println(number);
        System.out.println("Excellent");

        InputValidation RangeDouble = new InputValidation();
        System.out.println("Enter a decimal number within the parameters");
        double dmin = 1.01;
        double dmax = 5.01;
        double doublenumber = RangeDouble.getRangeDouble(dmin, dmax);
        System.out.println(doublenumber);







    }


}
