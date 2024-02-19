
public class State1
{

    public static boolean checkHorz() { 
        for (int i = 0; i < Constants1.ROWS; i++) {
            for (int j = 0; j <= Constants1.board.boardArray[i].length-4; j++) {
                if (Constants1.board.boardArray[i][j].equals(Constants1.player1()) 
                && Constants1.board.boardArray[i][j+1].equals(Constants1.player1()) 
                && Constants1.board.boardArray[i][j+2].equals(Constants1.player1())
                && Constants1.board.boardArray[i][j+3].equals(Constants1.player1())) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean checkVert() {
        for (int i = 0; i < Constants1.COLS; i++) {
            for (int j = 0; j <= Constants1.board.boardArray.length-4; j++) {
                if (Constants1.board.boardArray[j][i].equals(Constants1.player1())
                && Constants1.board.boardArray[j+1][i].equals(Constants1.player1())
                && Constants1.board.boardArray[j+2][i].equals(Constants1.player1())
                && Constants1.board.boardArray[j+3][i].equals(Constants1.player1())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean gameWon() {
        if (checkHorz() || checkVert()) {
            return true;
        }
        return false;
    }
}
