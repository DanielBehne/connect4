import java.util.Scanner;

public class EventLoop
{
    static boolean player1Turn = true;

    public static void runEventLoop() {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Players players = new Players();
        int movesLeft0 = 5;
        int movesLeft1 = 5;
        int movesLeft2 = 5;
        int movesLeft3 = 5;
        int movesLeft4 = 5;
        int movesLeft5 = 5;
        int movesLeft6 = 5;

        board.makeBoard();
        //board.printBoard();

        if (player1Turn == true) {
            System.out.println(" ");
            System.out.println("It is player1's turn. Please enter a column.");
            //board.makeBoard();
            //board.printBoard();
            int move = scanner.nextInt();
            if (move > 6) {
                System.out.println("Please enter a column from 0 to 6.");
            }
            if (move == 0) {
                board.boardArray[movesLeft0][0] = players.player1();
                movesLeft0--;
            }
            if (move == 1) {
                board.boardArray[movesLeft1][1] = players.player1();
                movesLeft1--;
            }
            if (move == 2) {
                board.boardArray[movesLeft2][2] = players.player1();
                movesLeft2--;
            }
            if (move == 3) {
                board.boardArray[movesLeft3][3] = players.player1();
                movesLeft3--;
            }
            if (move == 4) {
                board.boardArray[movesLeft4][4] = players.player1();
                movesLeft4--;
            }
            if (move == 5) {
                board.boardArray[movesLeft5][5] = players.player1();
                movesLeft5--;
            }
            if (move == 6) {
                board.boardArray[movesLeft6][6] = players.player1();
                movesLeft6--;
            }
            board.printBoard();
            player1Turn = false;
            //runEventLoop();
        }
        if (!player1Turn) {
            System.out.println(" ");
            System.out.println("HELLO");
            player1Turn = true;
        }
        runEventLoop();
    }
}