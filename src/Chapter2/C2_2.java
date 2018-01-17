package Chapter2;

import java.util.Scanner;

/**
 * Program shows area and volume of a cylinder
 *
 * @author Ethan Alberga
 */

public class C2_2 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double PI = 3.14159265359;

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
