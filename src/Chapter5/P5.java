package Chapter5;

import java.util.Scanner;

/**
 * Program that lets people vote yes or no and after you decide to finish it
 * will show show how many people voted yes and how many people voted no.
 *
 * @author ea0987372
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer;
        int yes = 0, no = 0;

        do {

            System.out.print("Enter 'Y' to vote yes, 'N' to vot no, or 'Q' to quit voting. ");
            answer = input.next().toLowerCase();

            if (answer.equals("y")) {
                ++yes;
            } else if (answer.equals("n")) {
                ++no;
            } else if (answer.equals("q")) {
                break;
            } else if (!answer.equals("y") || !answer.equals("n") || answer.equals("q")) {
                System.out.println("Invalid input.");
            }

        } while (answer.equals("y") || answer.equals("n") || !answer.equals("y") || !answer.equals("n") || answer.equals("q"));

        System.out.println("The amount of yes votes were: " + yes);
        System.out.println("The amount of no votes were: " + no);

    }
}
