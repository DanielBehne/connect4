import java.util.Scanner;

public class EventLoop
{
    static boolean player1Turn = true;
    
    public static void runEventLoop() {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        if (player1Turn == true) {
            System.out.println("It is player1's turn. Please enter a column.");
            board.makeBoard();
            board.printBoard();
            int move = scanner.nextInt();
            if (move > 6) {
                System.out.println("Please enter a column from 0 to 6.");
            }
        }
        
    }

    //public int sampleMethod(int y)
    //{
       
    //}
}
