
public class Constants1
{
    public static Board board = new Board();

    public static final int ROWS = 6;
    public static final int COLS = 7;

    public static String player1()
    {
        String redPiece = "R";
        return redPiece;
    }

    public static String player2()
    {
        String blackPiece = "B";
        return blackPiece;
    }

    public static void rules() {
        System.out.println("Welcome to Connect4.");
        System.out.println("The objective of the game is to connect 4 of your pieces vertically, horizontally, or diagonally.");
        System.out.println("The game is over when you or your opponent meets this objective.");
        System.out.println("Because each piece falls down when you place it, you will only have to enter the number of the column to make your move.");
        System.out.println("The columns are numbered from 0 to 6, from left to right.");
        System.out.println("player1 will be colored red and their piece will be shown as " + player1());
        System.out.println("player2 will be colored black and their piece will be shown as " + player2());
        System.out.println("If you wish to exit the game, enter 100");
        EventLoop.player1Turn = true;
    }
}
