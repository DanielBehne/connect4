
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
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 3; col++) {
                if (Constants1.board.boardArray[row][col].equals(Constants1.player1())
                && Constants1.board.boardArray[row+1][col+1].equals(Constants1.player1())
                && Constants1.board.boardArray[row+2][col+2].equals(Constants1.player1())
                && Constants1.board.boardArray[row+3][col+3].equals(Constants1.player1())) {
                    return true;
                }
            }
        }
        
        return false;
    }

    //top right to bottom left
    public static boolean checkDiag2() {
        for (int row = 0; row <= 2; row++) {
            for (int col = 6; col >= 3; col--) {
                if (Constants1.board.boardArray[row][col].equals(Constants1.player1())
                && Constants1.board.boardArray[row+1][col-1].equals(Constants1.player1())
                && Constants1.board.boardArray[row+2][col-2].equals(Constants1.player1())
                && Constants1.board.boardArray[row+3][col-3].equals(Constants1.player1())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean gameWon() {
        if (checkHorz() || checkVert() || checkDiag1() || checkDiag2()) {
            return true;
        }
        return false;
    }
}

