package Chapter4;

import java.util.Scanner;

/**
 * Program that calculates who will win out a bid between 2 people of a job. The
 * winner is based off of hours required and how much they charge per hour.
 *
 * @author Ethan Alberga
 */
public class P4 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        //Variables
        String name1;
        String name2;
        int hours1;
        int hours2;
        double charges1;
        double charges2;
        double cost1;
        double cost2;

        Scanner s = new Scanner(System.in);
        Scanner user_input = new Scanner(System.in);
        System.out.println("Bidder 1, enter your name:");
        name1 = user_input.next();
        System.out.println("How many hours do you require:");
        hours1 = s.nextInt();
        System.out.println("How much do you charge per hour:");
        charges1 = s.nextDouble();
        System.out.println("Bidder 2, enter your name:");
        name2 = user_input.next();
        System.out.println("How many hours do you require:");
        hours2 = s.nextInt();
        System.out.println("How much do you charge per hour:");
        charges2 = s.nextDouble();

        cost1 = (hours1 * charges1);
        cost2 = (hours2 * charges2);

        if (cost1 < cost2) {
            System.out.println("Winner is:" + name1 + " ");
            System.out.printf("%.2f\n", cost1);
        }
        if (cost1 > cost2) {
            System.out.println("Winner is: " + name2);
            System.out.println("Cost: ");
            System.out.printf("%.2f\n", cost2);
        }
        if (cost1 == cost2 && hours1 < hours2) {
            System.out.println("Winner is: " + name1);
            System.out.println("Cost: ");
            System.out.printf("%.2f\n", cost1);
            System.out.println("Hours: " + hours1);
        }
        if (cost1 == cost2 && hours1 > hours2) {
            System.out.println("Winner is: " + name2);
            System.out.println("Cost: ");
            System.out.printf("%.2f\n", cost2);
            System.out.println("Hours: " + hours2);
        }
        if (cost1 == cost2 && hours1 == hours2) {
            System.out.print(name1);
            System.out.print(" and ");
            System.out.print(name2);
            System.out.println(", you have identical bids. ");
            System.out.println(name1);
            System.out.println("Cost: ");
            System.out.printf("%.2f\n", cost1);
            System.out.println("Hours: " + hours1);
            System.out.println(name2);
            System.out.println("Cost: ");
            System.out.printf("%.2f\n", cost2);
            System.out.println("Hours: " + hours2);
        }
    }
}
