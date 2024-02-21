
public class State2
{

    public static boolean checkHorz() { 
        for (int i = 0; i < Constants1.ROWS; i++) {
            for (int j = 0; j <= Constants1.board.boardArray[i].length-4; j++) {
                if (Constants1.board.boardArray[i][j].equals(Constants1.player2()) 
                && Constants1.board.boardArray[i][j+1].equals(Constants1.player2()) 
                && Constants1.board.boardArray[i][j+2].equals(Constants1.player2())
                && Constants1.board.boardArray[i][j+3].equals(Constants1.player2())) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean checkVert() {
        for (int i = 0; i < Constants1.COLS; i++) {
            for (int j = 0; j <= Constants1.board.boardArray.length-4; j++) {
                if (Constants1.board.boardArray[j][i].equals(Constants1.player2())
                && Constants1.board.boardArray[j+1][i].equals(Constants1.player2())
                && Constants1.board.boardArray[j+2][i].equals(Constants1.player2())
                && Constants1.board.boardArray[j+3][i].equals(Constants1.player2())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //bottom left to top right
    public static boolean checkDiag1() {
        for (int r = 5, c = 3; r >= 0 && c <= 6; c--, r++) {
            if (Constants1.board.boardArray[r][c].equals(Constants1.player1())) {
                return true;
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
