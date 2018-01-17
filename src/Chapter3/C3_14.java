package Chapter3;

import java.util.Scanner;

/**
 * Program does a coin flip
 *
 * @author Ethan Alberga
 */
public class C3_14 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Variables
        int coinSide;
        int flip = (int) (Math.random() * 2);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 0 or 1:");
        coinSide = s.nextInt();

        if (coinSide == flip) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
