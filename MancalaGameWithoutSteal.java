import java.util.Scanner;

/**
 * Represents a game of Mancala.
 */
public class MancalaGameWithoutSteal {
    /**
     * The number of rows on the game board.
     */
    private static final int ROWS = 2;

    /**
     * The number of columns on the game board.
     */
    private static final int COLUMNS = 6;

    /**
     * The index of player 1.
     */
    private static final int PLAYER1 = 0;

    /**
     * The index of player 2.
     */
    private static final int PLAYER2 = 1;

    /**
     * The 2D array representing the stones on the game board.
     */
    private int[][] board = new int[ROWS][COLUMNS];

    /**
     * The stores of each player.
     */
    private int[] store = new int[2];



    /**
     * Constructor for MancalaGame.
     * Initializes the game board.
     */
    public MancalaGameWithoutSteal() {
        initializeBoard();
    }

    /**
     * Initializes the game board.
     * Sets all pits to 4 stones and both stores to 0.
     */
    public void initializeBoard() {
        // initialize the board
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = 4;
        }
        // initialize the store
        store[PLAYER1] = 0;
        store[PLAYER2] = 0;
    }

    /**
     * Prints the current state of the game board to the console.
     */
    public void printBoard() {
        System.out.println("+----+----+----+----+----+----+----+----+");
        System.out.print("|    |");
        for (int i = 0; i < COLUMNS; i++)
        System.out.printf("%3d |", board[0][i]);
        System.out.println("    |");
        System.out.println("| " + String.format("%2d", store[0]) + " |----+----+----+----+----+----| "
        + String.format("%2d", store[1]) + " |");
        System.out.print("|    |");
        for (int i = 0; i < COLUMNS; i++)
            System.out.printf("%3d |", board[1][i]);
        System.out.println("    |");
        System.out.println("+----+----+----+----+----+----+----+----+");
    }

    /**
     * Prints the game board with a header.
     * The header includes the column numbers.
     */
    private void printBoardWithHeader() {
        System.out.println("     |  1 |  2 |  3 |  4 |  5 |  6 |");
        printBoard();
    }

    /**
     * Checks if the game is over.
     * The game is over if all the pits of one player are empty.
     *
     * @return true if the game is over, false otherwise
     */
    public boolean isGameOver() {
        // if all the pits of one player are empty, the game is over
        boolean player1Empty = true;
        boolean player2Empty = true;
        for (int i = 0; i < COLUMNS; i++) {
            if (board[PLAYER1][i] != 0)
                player1Empty = false;
            if (board[PLAYER2][i] != 0)
                player2Empty = false;
        }
        return player1Empty || player2Empty;
    }

    /**
     * Plays the game for a given player and pit number.
     *
     * @param playerIndex The index of the player.
     * @param pitNumber   The number of the pit.
     * @return true if the player gets a second turn, false otherwise.
     */
    public boolean play(int playerIndex, int pitNumber) {

        // convert pitNumber to index
        pitNumber--;

        // get the number of stones in the pit
        int stones = board[playerIndex][pitNumber];
        // empty the pit
        board[playerIndex][pitNumber] = 0;

        int row = playerIndex;
        // distribute the stones
        // if the player is player 1, move towareds left

        // second turn
        boolean secondTurn = false;

        while (stones > 0) {
            // player 1
            if (row == 0) {
                int i = pitNumber - 1;
                // distribute the stones
                while (i >= 0 && stones > 0) {
                    board[row][i]++;
                    stones--;
                    i--;
                }
                // if there are still stones left, put them in the store
                // and it is their own mancala
                if (row == playerIndex) {
                    if (stones > 0) {
                        store[row]++;
                        stones--;
                        if (stones == 0) {
                            secondTurn = true;
                        }
                    }
                }
                row = PLAYER2;
                pitNumber = -1;
            } else {
                // distribute the stones
                int i = pitNumber + 1;
                while (i < COLUMNS && stones > 0) {
                    board[row][i]++;
                    stones--;
                    i++;
                }
                // if there are still stones left, put them in the store
                // and it is their own mancala
                if (row == playerIndex) {
                    if (stones > 0) {
                        store[row]++;
                        stones--;
                        if (stones == 0) {
                            secondTurn = true;
                        }
                    }
                }
                row = PLAYER1;
                pitNumber = COLUMNS;
            }
        }

        return secondTurn;
    }

    /**
     * Determines the winner of the game.
     *
     * @return The index of the winning player, or -1 if it's a draw.
     */
    public int winner() {
        // it is guarranteed that the game is over

        // count total number of stones in each player's store
        int player1Stones = store[PLAYER1];
        int player2Stones = store[PLAYER2];
        // add the stones in the pits to the stores
        for (int i = 0; i < COLUMNS; i++) {
            player1Stones += board[PLAYER1][i];
            player2Stones += board[PLAYER2][i];
        }

        if (player1Stones > player2Stones)
            return PLAYER1;
        else if (player1Stones < player2Stones)
            return PLAYER2;
        else
            return -1;
    }

    /**
     * The main method that runs the Mancala game.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        MancalaGameWithoutSteal game = new MancalaGameWithoutSteal();

        // ask for user to input the pit number
        Scanner input = new Scanner(System.in);

        // print header for the game
        System.out.println("+---------------------------------------------+");
        System.out.println("|                  Mancala Game               |");
        System.out.println("+---------------------------------------------+");
        System.out.println();


        // ask for name of the player
        System.out.print("Enter your name to continue: ");
        String name = input.nextLine();

        game.printBoardWithHeader();


        int currentPlayer = 1; // user starts first
        while (!game.isGameOver()) {

            boolean secondTurn = false;
            int pitNumber = 0;

            // computer is taking turn
            if (currentPlayer == 0) {
                // randomly choose a pit (1 - 6)
                pitNumber = (int) (Math.random() * COLUMNS) + 1;
                // if the pit is empty, choose another pit
                while (game.board[currentPlayer][pitNumber-1] == 0) {
                    pitNumber = (int) (Math.random() * COLUMNS) + 1;
                }
                System.out.println("Computer chooses pit " + pitNumber);
                System.out.print("Press enter to continue...");
                input.nextLine();
            } else {
                System.out.print(name + "! choose a pit [1-6]: ");
                pitNumber = input.nextInt();
                // if the input is invalid, or the pit is empty, ask for input again
                while (pitNumber < 1 || pitNumber > 6 || game.board[currentPlayer][pitNumber - 1] == 0) {
                    System.out.print("Invalid input. Choose a (non-empty) pit [1-6]: ");
                    pitNumber = input.nextInt();
                }
                // discard the rest of the line
                input.nextLine();
            }

            secondTurn = game.play(currentPlayer, pitNumber);
            game.printBoard();

            if (!secondTurn) {
                // switch player
                currentPlayer = (currentPlayer + 1) % 2;
            }
            System.err.println();
        }

        // print the winner
        int winner = game.winner();
        if (winner == -1)
            System.out.println("It is a tie!");
        else if (winner == 0)
            System.out.println("Computer wins!");
        else
            System.out.println(name + " wins!");

        input.close();
    }

}
