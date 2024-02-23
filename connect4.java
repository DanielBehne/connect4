
public class Connect4
{
    public static void main(String[] args) {
        Constants1.rules();
        System.out.println();

        Board board = new Board();
        board.makeBoard();
        board.printBoard();

        EventLoop.makeMove();
    }
}
