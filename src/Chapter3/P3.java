package Chapter3;

import java.util.Scanner;

/**
 * Program calculates and displays grades.
 *
 * @author Ethan Alberga
 */
public class P3 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Variables
        double grade;
        double gradeTwo;
        // Lines to enter cost
        Scanner s = new Scanner(System.in);
        System.out.println("Enter grade:");
        grade = s.nextDouble();
        System.out.println("Enter grade two:");
        gradeTwo = s.nextDouble();
        //Calculate stuff
        if (grade < gradeTwo) {
            System.out.println("The first number is less than the second");
        }
        if (grade > gradeTwo) {
            System.out.println("The first number is greater than the second");
        }
        if (grade == gradeTwo) {
            System.out.println("The first number is equal the second");
        }
        if (grade <= gradeTwo) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (grade != gradeTwo) {
            System.out.println("The first number is not equal to the second");
        }
        if (gradeTwo == 0) {
            System.out.println("Cannot divide by 0");
        } else if ((grade / gradeTwo) < 1) {
            System.out.println("Proper fraction");
        } else {
            System.out.println("Improper fraction");
        }

        if (grade >= 90.0) {
            System.out.println("A");
        } else if (grade >= 80.0) {
            System.out.println("B");
        } else if (grade >= 70.0) {
            System.out.println("C");
        } else if (grade >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if ((gradeTwo <= 100) && (gradeTwo >= 1)) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
