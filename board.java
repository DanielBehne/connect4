import java.util.Arrays;
public class Board
{
    public String[][] boardArray;

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
        String[] colNums = {"0", "1", "2", "3", "4", "5", "6"};
        for (String w : colNums) {
            System.out.print(w + " ");
        }
        System.out.println();
        for (String[] x : boardArray) {
            for (String y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
