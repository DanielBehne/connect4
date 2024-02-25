import java.util.Scanner;

public class EventLoop
{
    static boolean player1Turn = true;
    static boolean isGameOn = true;

    public static void makeMove() {
        Scanner scanner = new Scanner(System.in);

        while (isGameOn) {
            if (player1Turn == true) {
                System.out.println(" ");
                System.out.println("It is player1's turn. Please enter a column.");
                String move = scanner.nextLine();
                try {
                    if (move.equalsIgnoreCase("exit")) {
                        isGameOn = false;
                        System.out.println("See ya next time!");
                        break;
                    } else {
                        int moveCol = Integer.parseInt(move);
                        if (moveCol > 6) {
                            System.out.println();
                            System.out.println("Please enter a column from 0 to 6.");
                            player1Turn = true;
                            makeMove();
                        }   

                        for (int i = Constants1.ROWS - 1; i >= 0; i--) {
                            if (Constants1.board.boardArray[i][moveCol].equals("-")) {
                                Constants1.board.boardArray[i][moveCol] = Constants1.player1();
                                player1Turn = false;
                                break;
                            } else if (i == 0) {
                                System.out.println();
                                System.out.println("This column is full please select another.");
                                player1Turn = true;
                                makeMove();
                            }
                        }            
                        System.out.println();
                        Constants1.board.printBoard();
                        if (State1.gameWon() == true) {
                            isGameOn = false;
                            System.out.println();
                            System.out.println("PLAYER1 IS A WINNER!");
                            break;
                        }

                    }
                } catch (NumberFormatException ignored) {
                    System.out.println();
                    System.out.println("Please enter a number from 0 to 6 to move.");
                    player1Turn = true;
                    makeMove();
                }
            }
            if (player1Turn != true) {
                System.out.println(" ");
                System.out.println("It is player2's turn. Please enter a column.");
                String move = scanner.nextLine();
                try {
                    if (move.equalsIgnoreCase("exit")) {
                        isGameOn = false;
                        System.out.println("See ya next time!");
                        break;
                    } else {
                        int moveCol = Integer.parseInt(move);
                        if (moveCol > 6) {
                            System.out.println();
                            System.out.println("Please enter a column from 0 to 6.");
                            player1Turn = false;
                            makeMove();
                        }   

                        for (int i = Constants1.ROWS - 1; i >= 0; i--) {
                            if (Constants1.board.boardArray[i][moveCol].equals("-")) {
                                Constants1.board.boardArray[i][moveCol] = Constants1.player2();
                                player1Turn = true;
                                break;
                            } else if (i == 0) {
                                System.out.println();
                                System.out.println("This column is full please select another.");
                                player1Turn = false;
                                makeMove();
                            }
                        }            
                        System.out.println();
                        Constants1.board.printBoard();
                        if (State2.gameWon() == true) {
                            isGameOn = false;
                            System.out.println();
                            System.out.println("PLAYER2 IS A WINNER!");
                            break;
                        }

                    }
                } catch (NumberFormatException ignored) {
                    System.out.println();
                    System.out.println("Please enter a number from 0 to 6 to move.");
                    player1Turn = false;
                    makeMove();
                }
            }          
            makeMove();
        }

    }
}
