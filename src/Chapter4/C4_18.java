package Chapter4;

import java.util.Scanner;

/**
 * Program that displays a student's major and what grade level they are
 *
 * @author Ethan Alberga
 */
public class C4_18 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters");
        String in = input.nextLine();

        char major = in.charAt(0);
        char level = in.charAt(1);

        String sMajor = "";
        String sLevel = "";

        switch (major) {
            case 'M':
                sMajor = "Mathematics";
                break;
            case 'C':
                sMajor = "Computer Science";
                break;
            case 'I':
                sMajor = "information Technology";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }

        switch (level) {
            case '1':
                sLevel = "Freshman";
                break;
            case '2':
                sLevel = "Sophomore";
                break;
            case '3':
                sLevel = "Junior";
                break;
            case '4':
                sLevel = "Senior";
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
                break;
        }
        System.out.println(sMajor + " " + sLevel);
    }
}
