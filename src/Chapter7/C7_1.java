package Chapter7;

import java.util.Scanner;

/**
 * Assigns grades based on the highest score.
 *
 * @author Ethan Alberga
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter the number of students:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] score = new int[n];
        int bestScore = 0;

        System.out.println("Enter " + n + " scores:");

        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
            if (bestScore < score[i]) {
                bestScore = score[i];
            }
        }

        char grade;
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= bestScore - 10) {
                grade = 'A';
            } else if (score[i] >= bestScore - 20) {
                grade = 'B';
            } else if (score[i] >= bestScore - 30) {
                grade = 'C';
            } else if (score[i] >= bestScore - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Student " + i + " has a score of " + score[i] + " and their grade is a(n) " + grade);
        }

    }
}
