package Chapter2;

import java.util.*;

/**
 * Program displays temp in Fahrenheit
 *
 * @author Ethan Alberga
 */
class C2_1 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius");
        temperature = in.nextInt();

        temperature = (temperature + 32) * (9.0 / 5);

        System.out.println("Temperature in Fahrenheit = " + temperature);
    }
}
