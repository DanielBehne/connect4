
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
    
    //top left to bottom right
    public static boolean checkDiag1() {
        for (int i = 0; i <= Constants1.ROWS-4; i++) {
            if (Constants1.board.boardArray[i][i].equals(Constants1.player1())
            && Constants1.board.boardArray[i+1][i+1].equals(Constants1.player1())
            && Constants1.board.boardArray[i+2][i+2].equals(Constants1.player1())
            && Constants1.board.boardArray[i+3][i+3].equals(Constants1.player1())) {
                return true;
            }
        }
        for (int i = 0; i <= Constants1.ROWS-4; i++) {
            if (Constants1.board.boardArray[i][i+1].equals(Constants1.player1())
            && Constants1.board.boardArray[i+1][i+2].equals(Constants1.player1())
            && Constants1.board.boardArray[i+2][i+3].equals(Constants1.player1())
            && Constants1.board.boardArray[i+3][i+4].equals(Constants1.player1())) {
                return true;
            }
        }
        for (int i = 0; i <= Constants1.ROWS-4; i++) {
            if (Constants1.board.boardArray[i][i+2].equals(Constants1.player1())
            && Constants1.board.boardArray[i+1][i+3].equals(Constants1.player1())
            && Constants1.board.boardArray[i+2][i+4].equals(Constants1.player1())
            && Constants1.board.boardArray[i+3][i+5].equals(Constants1.player1())) {
                return true;
            }
        }
        
        return false;
    }
    

    public static boolean gameWon() {
        if (checkHorz() || checkVert() || checkDiag1()) {
            return true;
        }
        return false;
    }
}
