package Chapter5;

import java.util.Scanner;

/**
 * Program that has you enter a string and it will tell you the reverse of that
 * entered string.
 *
 * @author ea0987372
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String s2 = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        System.out.println("The reverse of the entered string is: " + s2);
    }
}
