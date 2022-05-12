//Geunuk Na, geunuk.na@stonybrook.edu

/* 
 * Tic Tac Toe game
 */

/* As you read this code, you will see 'Pre:' and 'Post:'.  'Pre:'
 * refers to the pre-conditions and 'Post:' post-conditions.
 * Pre-conditions are the conditions that should hold before
 * the method is executed, whereas post-conditions are the conditions
 * that should hold after the method has been executed.
 *
 *
 *
 * A board is a 3x3 grid, which you can picture mentally as follows.
 * The squares of the grid are numbered 1 through 9, as indicated below.
 *
 *    |   |
 *  1 | 2 | 3
 *    |   |
 * ---+---+---
 *    |   |
 *  4 | 5 | 6
 *    |   |
 * ---+---+---
 *    |   |
 *  7 | 8 | 9
 *    |   |
 *
 * Each square can be empty, can be occupied by an X, or
 * can be occupied by an O.
 */

public class Ttt2 {

    private static int spacesLeft;

    private static char[][] board;
    
    public static void main (String[] args) {
        System.out.println("Welcome to Tic Tac Toe");
        initializeBoard();
        firstDraw();
	spacesLeft = 9;
	
        char mark = 'X';

	while (true) {
	     if (spacesLeft == 1) {
		for (int i=0; i<3; i++){
		    for(int j=0; j<3; j++){
			if(board[i][j] == ' '){
			    board[i][j] = mark;
			    //System.out.println("empty cord:" + i + j+ "current:" + board[i][j]); debug line
			    if(is3InRow(mark)){
				board[i][j] = ' ';
			    }
			    else{
				spacesLeft = 0;
				System.out.println(spacesLeft);
			    }
			}
		    }
		}
		//
	    }
	    if (isBoardFull()) {
               System.out.println("Tie game!");
               break;
	    }            
            int square = getLegalMove(mark);
            move(square, mark);
            draw();
	    //System.out.println(spacesLeft); test
            if (is3InRow(mark)) {
                System.out.println(mark + " wins!");
                break;
            }
            
            if (isBoardFull()) {
                System.out.println("Tie game!");
                break;
            }
            
            if (mark == 'X') {
                mark = 'O';
            }
            else {
                mark = 'X';
            }
        }
    }

    // Pre:  mark is 'X' or 'O'
    //       The current board contains an empty square 
    // Post: Interacts with the user until the user provides the number
    //       of an empty square in the board.  It then returns that number.
    //
    public static int getLegalMove (char mark) {
        java.util.Scanner console = new java.util.Scanner(System.in);
        while (true) {
            System.out.println(mark + "'s next move: ");
            int square = console.nextInt();
            if ((square >= 1) &&
                (square <= 9) &&
                (isSquareEmpty(square))) {
                return square;
            }
            System.out.println("\nIllegal move, try again\n");
        }
    }

    // Initializes the board to be empty.
    public static void initializeBoard () {
	board = new char[3][3];
	for(int i=0; i<3; i++){
	    for(int j=0; j<3; j++){
		board[i][j] = ' ';
	    }
	}   
    }
    
    // Post: Draws the board to standard output (screen) with the
    //       square numbers
    public static void firstDraw () {
        System.out.println("   |   |   ");
        System.out.println(" " + 1 + " | " + 2 + " | " + 3);
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println(" " + 4 + " | " + 5 + " | " + 6);
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println(" " + 7 + " | " + 8 + " | " + 9);
        System.out.println("   |   |   ");
        System.out.println();
    }
    
    // Post: Draws the board to the standard output
    public static void draw () {
        System.out.println();
        System.out.println("   |   |   ");
        System.out.println(" " + board[0][0] + " | "
                           + board[0][1] + " | " + board[0][2]);
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println(" " + board[1][0] + " | "
                           + board[1][1] + " | " + board[1][2]);
        System.out.println("   |   |   ");
        System.out.println("---+---+---");
        System.out.println("   |   |   ");
        System.out.println(" " + board[2][0] + " | "
                           + board[2][1] + " | " + board[2][2]);
        System.out.println("   |   |   ");
        System.out.println();
    }
    
    // Pre:  mark is 'X' or 'O'
    //       1 <= square <= 9
    // Post: Stores the specified mark in the specified
    //       square of the board
    public static void move (int square, char mark) {
        if (isSquareEmpty(square)) {
            spacesLeft -= 1;
	}
	int add = 1;
	for(int i=0;i<3;i++){
	    if (i>0){
		add += 2;
	    }
	    for(int j=0; j<3; j++){
		if(i+j+add == square){
		    board[i][j] = mark;
		}
	    }
	}
    }

    // Pre:  1 <= square <= 9
    // Post: Returns true if the specified square of the
    //       board is empty; returns false otherwise.
    public static boolean isSquareEmpty (int square) {
	int add = 1;
	for(int i=0; i<3; i++){
	    if (i>0){
		add += 2;
	    }
	    for(int j=0; j<3; j++){
		if(i+j+add == square){
		    return(board[i][j] == ' ');
		}
	    }
	}
	return false;
    }
    // Pre:  mark is 'X' or 'O'
    // Post: Returns true if the board contains three of
    //       the specified mark in a row; returns false
    //       otherwise.
    public static boolean is3InRow (char mark) {
        return
            (board[0][0] == mark && board[0][1] == mark && board[0][2] == mark) ||
            (board[1][0] == mark && board[1][1] == mark && board[1][2] == mark) ||
            (board[2][0] == mark && board[2][1] == mark && board[2][2] == mark) ||
            (board[0][0] == mark && board[1][0] == mark && board[2][0] == mark) ||
            (board[0][1] == mark && board[1][1] == mark && board[2][1] == mark) ||
            (board[0][2] == mark && board[1][2] == mark && board[2][2] == mark) ||
            (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) ||
            (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark);
    }

    // Post: Returns true if the board contains no empty
    //       spaces; returns false otherwise.
    public static boolean isBoardFull () {
	
        return spacesLeft == 0;
    }
}
