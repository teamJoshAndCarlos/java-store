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
            return input;
        } else {
            return getInt();
        }
    }

    public int getInt() {
        return scan.nextInt();
    }

    public double getDouble(double min, double max) {
        double input = scan.nextDouble();
        if (input >= min && input <= max) {
            return input;
        } else {
            return getDouble();
        }
    }

    public double getDouble() {
        return scan.nextDouble();

    }


}
