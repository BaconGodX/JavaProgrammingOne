package Chapter7;

import java.util.Scanner;

/**
 * Has you enter 10 numbers, then tells you the smallest.
 *
 * @author Ethan Alberga
 */
public class C7_9 {

    static final int SIZE = 10;

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double[] n = new double[SIZE];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter " + SIZE + " numbers: ");
        for (int i = 0; i < n.length; i++) {
            n[i] = input.nextDouble();
        }
        System.out.println("The minimum number is: " + min(n));
    }

    /**
     * Finds the min of the 10 numbers entered
     *
     * @param array the numbers entered
     * @return the min number
     */
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
