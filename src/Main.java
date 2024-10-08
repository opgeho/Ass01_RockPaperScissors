import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String play1 = "";
        String play2 = "";
        String choose = "";
        boolean p1Done = false;
        boolean p2Done = false;
        boolean gDone = false;
        boolean chooseDone = false;
        do {
            do {
                System.out.println("Player 1, what do you choose? [R/P/S]: ");
                play1 = in.nextLine();
                if (play1.equalsIgnoreCase("R")) {
                    play1 = "R";
                    p1Done = true;
                } else if (play1.equalsIgnoreCase("P")) {
                    play1 = "P";
                    p1Done = true;
                } else if (play1.equalsIgnoreCase("S")) {
                    play1 = "S";
                    p1Done = true;
                } else {
                    System.out.println(play1 + " is not a valid move. please try another input.");
                }
            } while (p1Done == false);

            do {
                System.out.println("Player 2, what do you choose? [R/P/S]: ");
                play2 = in.nextLine();
                if (play2.equalsIgnoreCase("R")) {
                    play2 = "R";
                    p2Done = true;
                } else if (play2.equalsIgnoreCase("P")) {
                    play2 = "P";
                    p2Done = true;
                } else if (play2.equalsIgnoreCase("S")) {
                    play2 = "S";
                    p2Done = true;
                } else {
                    System.out.println(play2 + " is not a valid move. please try another input.");
                }
            } while (p2Done == false);
            if (play1.equals("R")) {
                if (play2.equals("R")) {
                    System.out.println("Rock vs. Rock Its a tie!");
                } else if (play2.equals("P")) {
                    System.out.println("Paper beats rock player 2 wins!");
                } else {
                    System.out.println("Rock beats Scissors player 1 wins!");
                }
            } else if (play1.equals("P")) {
                if (play2.equals("R")) {
                    System.out.println("Paper beats Rock player 1 wins!");
                } else if (play2.equals("P")) {
                    System.out.println("Paper vs. Paper Its a tie!");
                } else {
                    System.out.println("Scissors beats Paper player 2 wins!");
                }

            } else {
                if (play2.equals("R")) {
                    System.out.println("Rock beats Scissors player 2 wins!");
                } else if (play2.equals("P")) {
                    System.out.println("Scissors beats Paper player 1 wins!");
                } else {
                    System.out.println("Scissors vs. Scissors Its a tie!");
                }
            }
            do {
                System.out.println("Do you want to play again? [Y/N]");
                choose = in.nextLine();
                if (choose.equalsIgnoreCase("Y")){
                    chooseDone = true;
                }
                else if (choose.equalsIgnoreCase("N")) {
                    chooseDone = true;
                    gDone = true;
                }
                else {
                    System.out.println(choose + "is not a valid input. please try again.");
                }
            } while (chooseDone == false);
        } while (gDone == false);
    }
}