import java.util.Scanner;

class RockPapSci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        while (true) {
            System.out.print(
                    "What is your move? To make a move, enter rock, paper, or scissors. To quit the game, enter quit. ");
            String myMove = in.nextLine();
            if (myMove.equals("quit")) {
                break;
            }
            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {

                System.out.println("Your move isn't valid!");

            } else {
                int rand = (int) (Math.random() * 3);
                String opponentMove = "";
                if (rand == 0) {
                    opponentMove = "rock";
                } else if (rand == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent move: " + opponentMove);
                if (myMove.equals(opponentMove)) {
                    System.out.println("It's a tie!");
                } else if ((myMove.equals("rock") && opponentMove.equals("scissors"))
                        || (myMove.equals("scissors") && opponentMove.equals("paper"))
                        || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost!");
                }
            }
        }
        System.out.println("Thanks for playing Rock, Paper, Scissors!");
        in.close();
    }
}