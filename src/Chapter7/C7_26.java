package Chapter7;

import java.util.Scanner;

/**
 * Finds out if 2 arrays are identical
 *
 * @author Ethan Alberga
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your first list: ");

        int[] list1 = new int[input.nextInt()];
        System.out.println("Enter the first list:");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter the length of your second list: ");
        int[] list2 = new int[input.nextInt()];
        System.out.println("Enter your second list: ");
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.println("The two lists are stictly identical.");
        } else {
            System.out.println("The two lists are not strictly identical.");
        }
    }

    /**
     * Finds if the 2 arrays are identical
     *
     * @param list1 the first list entered
     * @param list2 the second list entered
     * @return if it is identical or not
     */
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list2.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}
