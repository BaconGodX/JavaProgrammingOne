package Chapter4;

import java.util.Scanner;

/**
 * Program that calculates the pay of an employee.
 *
 * @author Ethan Alberga
 */
public class C4_23 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        //Variables
        String name;
        double hours;
        double payrate;
        double federalTax;
        double stateTax;
        double grossPay;
        double federalWithholding;
        double stateWithholding;
        double totalDeduction;
        double netPay;

        //Enter the information
        Scanner s = new Scanner(System.in);
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        name = user_input.next();
        System.out.println("Enter number of hours ");
        hours = s.nextDouble();
        System.out.println("Enter hourly pay rate ");
        payrate = s.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        federalTax = s.nextDouble();
        System.out.println("Enter state tax withholding rate: ");
        stateTax = s.nextDouble();

        //Calculate
        grossPay = hours * payrate;
        federalWithholding = grossPay * federalTax;
        stateWithholding = grossPay * stateTax;
        totalDeduction = federalWithholding + stateWithholding;
        netPay = grossPay - totalDeduction;

        //Display
        System.out.println(" ");
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " + payrate);
        System.out.print("Gross Pay: ");
        System.out.printf("%.2f\n", grossPay);
        System.out.println("Deductions:");
        System.out.print("   Federal Withholding: ");
        System.out.printf("%.2f\n", federalWithholding);
        System.out.print("   State Withholding: ");
        System.out.printf("%.2f\n", stateWithholding);
        System.out.print("   Total Deduction: ");
        System.out.printf("%.2f\n", totalDeduction);
        System.out.print("Next Pay: ");
        System.out.printf("%.2f\n", netPay);
    }
}
