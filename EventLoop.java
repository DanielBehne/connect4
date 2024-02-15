import java.util.Scanner;

public class EventLoop
{
    static boolean player1Turn = true;
    static boolean isGameOn = true;
    public static Board board = new Board();
    public static Players players = new Players();

    static final int ROWS = 6;
    static final int COLS = 7;
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
                for (int i = ROWS - 1; i >= 0; i--) {
                    if (board.boardArray[i][move].equals("-")) {
                        board.boardArray[i][move] = players.player1();
                        player1Turn = false;
                        break;
                    }
                }
                board.printBoard();
                if (checkHorz() == true) {
                    System.out.println("PLAYER1 IS A WINNER!");
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

    public static boolean isWinner = false;
    public static boolean checkHorz() { 
        int count = 0;
        for (String[] x : board.boardArray) {
            for (int w = 0; w < COLS-1; w++) {
                for (int i = 1; i < COLS; i++) {
                    if (x[w].equals(x[i])) {
                        count++;
                    }
                }
            }
        }

        if (count == 4) {
            isWinner = true;
            //System.out.println("PLAYER1 IS A WINNER!");
            return isWinner;
        } else {
            return isWinner;
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