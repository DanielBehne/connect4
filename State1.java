
public class State1
{
    public static boolean checkHorz() { 
        boolean isWinner = false;
        for (int i = 0; i < Constants1.ROWS; i++) {
            for (int j = 0; j <= Constants1.board.boardArray[i].length-4; j++) {
                if (Constants1.board.boardArray[i][j].equals(Constants1.player1()) 
                && Constants1.board.boardArray[i][j+1].equals(Constants1.player1()) 
                && Constants1.board.boardArray[i][j+2].equals(Constants1.player1())
                && Constants1.board.boardArray[i][j+3].equals(Constants1.player1())) {
                    isWinner = true;
                } else {
                    isWinner = false;
                }
            }
        }
        return isWinner;
    }
}
