package Chapter5;

import java.util.Scanner;

/**
 * You play rock paper scissors with a computer and in order to win, either you
 * or the computer need to get 2 wins ahead.
 *
 * @author Ethan Alberga
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param strings arguments from command line prompt
     */
    public static void main(String[] strings) {

        //Variables for the tracking of wins.
        int computerWins = 0;
        int userWins = 0;

        // Game and messages with it.
        while (userWins != computerWins + 2 && computerWins != userWins + 2 || userWins == 0 && computerWins == 0) {
            int computerHand = (int) (Math.random() * 3);

            Scanner input = new Scanner(System.in);
            System.out.print("Enter 0 for scissors, 1 for rock, 2 for paper");
            int playerHand = input.nextInt();

            String computer = getHand(computerHand);
            String player = getHand(playerHand);
            String gameStatus = getGameStatus(computerHand, playerHand);

            if (gameStatus.equals("You won")) {
                userWins++;
            }
            if (gameStatus.equals("You lost")) {
                computerWins++;
            }

            System.out.println("The computer is " + computer + ". You are " + player + ". " + gameStatus + ".");
        }
        if (userWins > computerWins) {
            System.out.println("You won! " + "Player wins:" + userWins + " Computer wins:" + computerWins);
        } else {
            System.out.println("You lost! " + "Player wins:" + userWins + " Computer wins:" + computerWins);
        }
    }

    /**
     * Assigning rock, paper, and scissors to keys.
     *
     * @param hand Shows what option between rock paper and scissors
     * @return returns choice
     */
    public static String getHand(int hand) {
        String handString;
        switch (hand) {
            case 0:
                handString = "scissors";
                break;
            case 1:
                handString = "rock";
                break;
            case 2:
                handString = "paper";
                break;
            default:
                handString = null;
        }
        return handString;
    }

    // Ddeciding if match has been won or lost.
    public static String getGameStatus(int computer, int player) {
        if (computer == player) {
            return "Draw";
        }
        String status = "";

        switch (player) {
            case 0:
                status = (computer != 1) ? "You won" : "You lost";
                break;
            case 1:
                status = (computer != 1) ? "You won" : "You lost";
                break;
            case 2:
                status = (computer != 1) ? "You won" : "You lost";
                break;
        }
        return status;
    }
}
