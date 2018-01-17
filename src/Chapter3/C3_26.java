package Chapter3;

import java.util.Scanner;

/**
 * Figures out if an integer is divisible by 5 and 6, 5 or 6, or 5 or 6 but not
 * both.
 *
 * @author Ethan Alberga
 */
public class C3_26 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        //Variables
        int integer;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer");
        integer = s.nextInt();

        System.out.println("Is integer divisable by 5 and 6?");
        System.out.println("Is integer divisable by 5 or 6");
        System.out.println("Is intger divisable by 5 or 6, but not both?");

    }
}
