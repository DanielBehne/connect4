
/**
 * Write a description of class board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//6x7 board

public class board
{
    String[][] boardArray = new String[7][6];
    public void printBoard() {
        for (int w = 0; w < 6; w++) {   
            System.out.print("|");
            for (int i = 0; i < 7; i++) {
                System.out.print("___|");
            }

        }
    }
