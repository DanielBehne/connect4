import java.util.Arrays;
public class Board
{
    private String[][] boardArray;

    public Board() {
        boardArray = new String[6][7];
        makeBoard();
    }

    public void makeBoard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                boardArray[i][j] = "-";
            }
        }
    }
    
    public void printBoard() {
        //for (String[] row : boardArray) {
          //  System.out.println(row);
        //}
        for (int i = 0; i < boardArray.length; i++) {
            System.out.println(Arrays.toString(boardArray[i]));
        }
    }
}