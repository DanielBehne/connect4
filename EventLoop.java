import java.util.Scanner;

public class EventLoop
{
    static boolean player1Turn = true;
    static boolean isGameOn = true;

    //testing out something different
    public static void makeMove() {
        Scanner scanner = new Scanner(System.in);

        while (isGameOn) {
            if (player1Turn == true) {
                System.out.println(" ");
                System.out.println("It is player1's turn. Please enter a column.");
                int move = scanner.nextInt();
                if (move == 100) {
                    isGameOn = false;
                    System.out.println("See ya next time!");
                    break;
                }

                //still need if illegal move
                //if (move > 6) {
                //  System.out.println("Please enter a column from 0 to 6.");
                //player1Turn = true;
                //break;
                //}   

                //still need if column is full
                for (int i = Constants1.ROWS - 1; i >= 0; i--) {
                    if (Constants1.board.boardArray[i][move].equals("-")) {
                        Constants1.board.boardArray[i][move] = Constants1.player1();
                        player1Turn = false;
                        break;
                    }
                }            
                System.out.println();
                Constants1.board.printBoard();
                if (State1.gameWon() == true) {
                    isGameOn = false;
                    System.out.println();
                    System.out.println("PLAYER1 IS A WINNER!");
                    break;
                }
            }

            if (player1Turn != true) {
                System.out.println(" ");
                System.out.println("It is player2's turn. Please enter a column.");
                int move = scanner.nextInt();
                if (move == 100) {
                    isGameOn = false;
                    System.out.println("See ya next time!");
                    break;
                }
                //if (move > 6) {
                //System.out.println("Please enter a column from 0 to 6.");
                // player1Turn = false;
                // break;
                //}                

                for (int i = Constants1.ROWS - 1; i >= 0; i--) {
                    if (Constants1.board.boardArray[i][move].equals("-")) {
                        Constants1.board.boardArray[i][move] = Constants1.player2();
                        player1Turn = true;
                        break;
                    }
                }
                System.out.println();

                Constants1.board.printBoard();
            }          
            makeMove();
        }
    }

    //if (y == players.player1()) {
    //  count++;
    //}
    //if (count == 4) {
    //  isWinner = true;
    //System.out.println("PLAYER1 IS A WINNER");
    //}
}

