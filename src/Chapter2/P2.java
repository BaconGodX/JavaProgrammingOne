package Chapter2;

import java.util.Scanner;

/**
 * Program displays the total cost of a bill
 *
 * @author Ethan Alberga
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Variables
        double mealCost;
        double drinkCost;
        double dessertCost;
        double subtotal;
        double tax;
        double tip;
        double total;
        // Lines to enter cost
        Scanner s = new Scanner(System.in);
        System.out.println("Enter cost of meal:");
        mealCost = s.nextDouble();
        System.out.println("Enter cost of drink: ");
        drinkCost = s.nextDouble();
        System.out.println("Enter cost of dessert: ");
        dessertCost = s.nextDouble();
        //Calculate Cost
        subtotal = mealCost + drinkCost + dessertCost;
        tax = subtotal * 0.10;
        tip = (subtotal + tax) * 0.15;
        total = subtotal + tax + tip;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Tip $" + tip);
        System.out.println("Total: $" + total);
    }
}
