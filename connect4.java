
public class Connect4
{
    public static void main(String[] args) {
        Instructions.rules();

        Board board = new Board();
        board.makeBoard();
        board.printBoard();
        //Board.makeBoard();
        //Board.printBoard();

        EventLoop.runEventLoop();
    }
}
