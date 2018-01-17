package Chapter3;

import java.util.Scanner;

/**
 * Compares the cost of 2 packages based on weight and price
 *
 * @author Ethan Alberga
 */
public class C3_33 {

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
