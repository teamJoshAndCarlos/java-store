package Java1;

import java.util.Scanner;

/**
 * Created by jsr on 5/17/17.
 */
public class InputValidation {
    private Scanner scan;


    public InputValidation() {
        this.scan = new Scanner(System.in);
    }

    public String getString() {
        return scan.next();
    }

    public boolean yesNo() {
        String input = scan.next();
        if (input.equalsIgnoreCase("Y")) {
            return true;
        } else if (input.equalsIgnoreCase("N")) {
            return false;
        } else {
            return yesNo();
        }
    }

    public int getInt(int min, int max) {
        int input = scan.nextInt();
        if (input >= min && input <= max) {
            System.out.println("Excellent. Number is WITHIN parameters");
            return input;
        } else {
            System.out.println("Number is not within parameters. Choose another number.");
            return getInt(min, max);
        }
    }

    public int getInt() {
        return scan.nextInt();
    }

    public double getRangeDouble(double dmin, double dmax) {
        double input = scan.nextDouble();
        if (input >= dmin && input <= dmax) {
            System.out.println("Excellent. Number is WITHIN parameters");
            return input;
        } else {
            System.out.println("Number is not within parameters. Choose another number.");
            return getRangeDouble(dmin, dmax);
        }
    }

    public double getDouble() {
        return scan.nextDouble();


    }


}
