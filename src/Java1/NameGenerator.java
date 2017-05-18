package Java1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by jsr on 5/18/17.
 */
public class NameGenerator {

    String[] adjectives = {"funny", "smelly", "gigantic","silly", "crazy", "gigantic", "skinny", "chubby","awesome", "dumb"};
    String[] nouns = {"monkey", "rocket", "tank", "boys", "girls", "students", "almonds", "images", "state", "name", };

    public static String randomGenerator()
    Random randomvar = new Random();
    Scanner input = new Scanner(System.in);

        system.out.println("do you want to generate a name?");

    String yeahno = input.nextLine();
        if (yeahno.equalsIgnoreCase("y")){
        int randomnoun = randomvar.nextInt(nouns.length);
        int randomadj = randomvar.nextInt(adjectives.length);

        System.out.println(adjectives[randomadj] + " "+ nouns[randomnoun]);


    }else{
        System.out.println("your'e lame");
    }


}
