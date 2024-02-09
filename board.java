
/**
 * Write a description of class board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//6x7 board

public class board
{
    private char[][] boardArray;

    public board() {
        boardArray = new char[7][6];
        makeBoard();

    }

    public void makeBoard() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                boardArray[i][j] = '-';
            }
        }
    }
    
    public void printBoard() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(boardArray[i][j]);
            }
        }
    }
}