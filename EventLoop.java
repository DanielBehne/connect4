import java.util.Scanner;

public class EventLoop
{
    static boolean player1Turn = true;
    static boolean isGameOn = true;
    public static Board board = new Board();
    //testing out something different
    public static void makeMove() {
        Scanner scanner = new Scanner(System.in);
        int ROWS = 6;
        int COLS = 7;
        Players players = new Players();
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
                for (int i = ROWS - 1; i >= 0; i--) {
                    if (board.boardArray[i][move].equals("-")) {
                        board.boardArray[i][move] = players.player1();
                        player1Turn = false;
                        break;
                    }
                }
                board.printBoard();
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

                for (int i = ROWS - 1; i >= 0; i--) {
                    if (board.boardArray[i][move].equals("-")) {
                        board.boardArray[i][move] = players.player2();
                        player1Turn = true;
                        break;
                    }
                }
                board.printBoard();
            }
            makeMove();
        }
    }
}