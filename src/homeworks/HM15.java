package homeworks;

import java.util.Random;
import java.util.Scanner;

public class HM15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1: Choose rock, paper, scissors, lizard, stock: ");

        String player1 = scanner.nextLine().toLowerCase();

        while (!player1.matches ("rock|paper|scissors|lizard|spock") ){
            break;
        }


        /*System.out.println("Player 2: Choose rock, paper, scissors, lizard, stock: ");

        String player2 = scanner.nextLine().toLowerCase();

        while (!player2.matches ("rock|paper|scissors|lizard|spock") ){
            break;
        }
        System.out.println("invalid input");*/

        String [] words = {"rock","paper","scissors","lizard","spock"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String player2 = words[randomIndex];
        System.out.println("Computer:" + player2);



        if (player1.equals(player2)) {
            System.out.println("Tie");
        } else if (player1.equals("rock")) {
            if (player2.equals("paper")) {
                System.out.println("player 1 loses");
            } else if (player2.equals("scissors")) {
                System.out.println("player 1 wins");
            } else if (player2.equals("lizard")) {
                System.out.println("player 1 wins");
            } else if (player2.equals("spock")) {
                System.out.println("player 1 loses");
            }
        } else if (player1.equals("paper")) {
            if (player2.equals("rock")) {
                System.out.println("player 1 wins");
            } else if (player2.equals("scissors")) {
                System.out.println("player 1 loses");
            } else if (player2.equals("lizard")) {
                System.out.println("player 1 loses");
            } else if (player2.equals("spock")) {
                System.out.println("player 1 wins");
            }
        } else if (player1.equals("scissors")) {
            if (player2.equals("paper")) {
                System.out.println("player 1 wins");
            } else if (player2.equals("rock")) {
                System.out.println("player 1 loses");
            } else if (player2.equals("lizard")) {
                System.out.println("player 1 wins");
            } else if (player2.equals("spock")) {
                System.out.println("player 1 loses");
            }
        } else if (player1.equals("lizard")) {
            if (player2.equals("paper")) {
                System.out.println("player 1 wins");
            } else if (player2.equals("rock")) {
                System.out.println("player 1 loses");
            } else if (player2.equals("scissors")) {
                System.out.println("player 1 loses");
            } else if (player2.equals("spock")) {
                System.out.println("player 1 wins");
            }
        } else if (player1.equals("spock")) {
            if (player2.equals("paper")) {
                System.out.println("player 1 loses");
            } else if (player2.equals("rock")) {
                System.out.println("player 1 wins");
            } else if (player2.equals("scissors")) {
                System.out.println("player 1 wins");
            } else if (player2.equals("lizards")) {
                System.out.println("player 1 loses");
            }

        } else {
            System.out.println("try again");
        }
    }

}

