package Chapter7;

import java.util.Scanner;
import java.util.*;

/**
 * Has you enter numbers and tells you the average of them
 *
 * @author Ethan Alberga
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {

        System.out.println("How many numbers do you want to read in?: ");
        Scanner input = new Scanner(System.in);
        double numbers[] = new double[input.nextInt()];
        System.out.println("Enter " + numbers.length
                + " numbers to fill array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The average is: " + average(numbers));
        System.out.printf("The contents of the array are: \n\t"
                + Arrays.toString(numbers));
    }

    /**
     * Calculates the average of the numbers entered.
     *
     * @param numbers the numbers entered
     * @return the average
     */
    public static double average(double numbers[]) {
        Arrays.toString(numbers);
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double result = sum / numbers.length;
        return result;

    }
}
