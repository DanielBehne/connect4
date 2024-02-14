import java.util.Scanner;

/**
 * OLD EVENTLOOP THAT IS SUPER INEFFICIENT
 */
public class dinosaur
{
    static boolean player1Turn = true;
    public static Board board = new Board();
    static int movesLeft0 = 5;
    static int movesLeft1 = 5;
    static int movesLeft2 = 5;
    static int movesLeft3 = 5;
    static int movesLeft4 = 5;
    static int movesLeft5 = 5;
    static int movesLeft6 = 5;
    static boolean isGameOn = true;
    public static void runEventLoop() {
        Scanner scanner = new Scanner(System.in);
        Players players = new Players();
        while (isGameOn) {
            if (player1Turn == true) {
                System.out.println(" ");
                System.out.println("It is player1's turn. Please enter a column.");
                int move = scanner.nextInt();
                if (move == 100) {
                    isGameOn = false;
                    System.out.println("See ya next time!");
                    break;
                }
                if (move > 6) {
                    System.out.println("Please enter a column from 0 to 6.");
                }
                if (move == 0) {
                    if (movesLeft0 >= 0) {
                        board.boardArray[movesLeft0][0] = players.player1();
                        movesLeft0--;
                        player1Turn = false;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = true;
                    }
                }
                if (move == 1) {
                    if (movesLeft1 >= 0) {
                        board.boardArray[movesLeft1][1] = players.player1();
                        movesLeft1--;
                        player1Turn = false;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = true;
                    }
                }
                if (move == 2) {
                    if (movesLeft2 >= 0) {
                        board.boardArray[movesLeft2][2] = players.player1();
                        movesLeft2--;
                        player1Turn = false;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = true;
                    }
                }
                if (move == 3) {
                    if (movesLeft3 >= 0) {
                        board.boardArray[movesLeft3][3] = players.player1();
                        movesLeft3--;
                        player1Turn = false;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = true;
                    }
                }
                if (move == 4) {
                    if (movesLeft4 >= 0) {
                        board.boardArray[movesLeft4][4] = players.player1();
                        movesLeft4--;
                        player1Turn = false;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = true;
                    }
                }
                if (move == 5) {
                    if (movesLeft5 >= 0) {
                        board.boardArray[movesLeft5][5] = players.player1();
                        movesLeft5--;
                        player1Turn = false;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = true;
                    }
                }
                if (move == 6) {
                    if (movesLeft6 >= 0) {
                        board.boardArray[movesLeft6][6] = players.player1();
                        movesLeft6--;
                        player1Turn = false;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = true;
                    }
                }
                board.printBoard();
            }
            if (!player1Turn) {
                System.out.println(" ");
                System.out.println("It is player2's turn. Please enter a column.");
                int move = scanner.nextInt();
                if (move == 100) {
                    isGameOn = false;
                    System.out.println("See ya next time!");
                    break;
                }
                if (move > 6) {
                    System.out.println("Please enter a column from 0 to 6.");
                }
                if (move == 0) {
                    if (movesLeft0 >= 0) {
                        board.boardArray[movesLeft0][0] = players.player2();
                        movesLeft0--;
                        player1Turn = true;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = false;
                    }
                }
                if (move == 1) {
                    if (movesLeft1 >= 0) {
                        board.boardArray[movesLeft1][1] = players.player2();
                        movesLeft1--;
                        player1Turn = true;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = false;
                    }
                }
                if (move == 2) {
                    if (movesLeft2 >= 0) {
                        board.boardArray[movesLeft2][2] = players.player2();
                        movesLeft2--;
                        player1Turn = true;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = false;
                    }
                }
                if (move == 3) {
                    if (movesLeft3 >= 0) {
                        board.boardArray[movesLeft3][3] = players.player2();
                        movesLeft3--;
                        player1Turn = true;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = false;
                    }
                }
                if (move == 4) {
                    if (movesLeft4 >= 0) {
                        board.boardArray[movesLeft4][4] = players.player2();
                        movesLeft4--;
                        player1Turn = true;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = false;
                    }
                }
                if (move == 5) {
                    if (movesLeft5 >= 0) {
                        board.boardArray[movesLeft5][5] = players.player2();
                        movesLeft5--;
                        player1Turn = true;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = false;
                    }
                }
                if (move == 6) {
                    if (movesLeft6 >= 0) {
                        board.boardArray[movesLeft6][6] = players.player2();
                        movesLeft6--;
                        player1Turn = true;
                    } else {
                        System.out.println("This column is full, please move somewhere else.");
                        player1Turn = false;
                    }
                }
                board.printBoard();
            }
            runEventLoop();
        }
    }

}
