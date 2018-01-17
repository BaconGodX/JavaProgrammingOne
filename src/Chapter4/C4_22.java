package Chapter4;

import java.util.Scanner;

/**
 * Program that shows if the first string that was entered is a substring of the
 * second string entered.
 *
 * @author Ethan Alberga
 */
public class C4_22 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        //Variables
        String s1;
        String s2;

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter string s1");
        s1 = user_input.next();
        System.out.println("Enter string s2");
        s2 = user_input.next();

        if (s1 != null && s2.length() <= s1.length() & s1.contains(s2)) {
            System.out.println(s1 + " is a substring of " + s2);
        } else {
            System.out.println(s1 + " is not a substring of " + s2);
        }

    }
}
