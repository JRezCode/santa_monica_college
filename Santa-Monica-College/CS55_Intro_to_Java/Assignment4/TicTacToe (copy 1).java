/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JR
 */

import java.util.Scanner;

public class TicTacToe {
//Class: CS55 - Dehkhoda Tue/Thu 9:30am
//Name: Jonathan Reznik
//Assignment:  TicTacToe
/*

    Project Details:  
    Overall the functionality exists to have a good game of tic-tac-toe.  The recommendations
    of the project requirements were carefully followed and thus board[] is a 1-dimensional array
    and the method showBoard() is used to display it to the console. (That was helpful.)
    
    There are a few things to note, in terms of illogical move choices and how they are handled, when
    a player chooses to move where another player has already placed a X or O in that square.  For now the
    program is able to catch these and not replace the values, so that was a win, but the method chosen to handle
    it causes the forfeiture of moves by whichever player made the illogical choice to go where another was already.
    
    In terms of validating input, which is done in the userMove method to an extent by assigning Integer
    type for input and then working with the character types for much of the calculations such as array computations
    and comparisons, etc.
  
    I've included 2 reports this time, which include a usual case (no illogical moves in report.txt) and an unusual case
    that displays the problem present when a user will be forced to forfeit the move (report2.txt).

    */    
    
    public static void main(String[] args) {
        //The main method 
        
        //Create the scanner object for user input in main method
        Scanner input = new Scanner(System.in);

        //Set the default player value
        boolean xIsFirst=true;
        char player = 'X';

        //Setup the board array with unicode values 1-9
        char [] board = {'\u0031','\u0032','\u0033','\u0034','\u0035','\u0036', +
                '\u0037','\u0038','\u0039'};

        //Allow user to select to change which player X or O will have the first move
        System.out.println("You may select whether to begin as X or O?");
        if (input.nextLine().toUpperCase().charAt(0) != ('X')) 
        {
            xIsFirst=false; 
            player = alternate(player);     //same method used to alternate while playing
        }
        
        int moveCount = 0;
        
        do {
            moveCount++;
            showBoard(board);
            if (player=='X') {
                userMove("You are 'X'", board); }
            else { 
                userMove("Your are 'O'", board); }
            player = alternate(player);
        } while (determineWinner(board)==false && moveCount<9);
        if(moveCount==9)
        {
            showBoard(board);
            System.out.println("There is a draw.");
        }
        System.out.println("Thank you for playing.");
    }
    
    public static void showBoard(char board[]){
        //The method accepts an array and prints the array on 3 lines
        System.out.print(board[0] + " " + board[1] + " " + board[2] + "\n");
        System.out.print(board[3] + " " + board[4] + " " + board[5] + "\n");
        System.out.print(board[6] + " " + board[7] + " " + board[8] + "\n");
        System.out.println("Moves made so far:  "+ getMoveCount(board));
        
    }
    
    public static char alternate(char player) {
        //The method that accepts an argument for player 1 or 2 and returns opposite character
        switch (player) {
           case 'X':
                return 'O';
            case 'O':
                return 'X';
        }
        return 0;
    }

    public static int getMoveCount(char board[]) {
        //Counting the moves in the game
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if(board[i]>'9')
            count +=1;
        }
        return count;
    }        

    public static void userMove(String pName, char board[]) {
        //This method accesses elements in an array board and sets the move based on user input.
        Scanner input = new Scanner(System.in);
        System.out.print(pName + ", what is your move?  Choose a move (1-9): ");        

        //Another variable and method call to provide input validation that moves are between 1-9
        int nextMove;
        boolean validateMove;
                do {
            nextMove = input.nextInt();
             validateMove = invalidMoves(nextMove, board);
            if (pName.contains("X")==true) {
//&& board[nextMove-1]!='O'&& board[nextMove-1]!='X'
                board[nextMove-1] = 'X';
        }
            else {
                //(pName.contains("O")==true) {
//&& board[nextMove-1]!='O'&& board[nextMove-1]!='X'
              board[nextMove-1] = 'O';                
            }} while (validateMove==true);
    }
       
    
    public static boolean determineWinner(char board[]) {
       //This method determines from the board array (which is accepts as an argument)
       //whether a winner is located in the rows/columns/diagonals of the board
       int [] result = new int [8];    //the reason for this size is the 8 possible ways to win                                        
        //for example:  index 0 = diagonal left to right
        result[0] = sumall(0,4,8,board);    //diagonal LtoR
        result[1] = sumall(2,4,6,board);    //diagonal RtoL
        result[2] = sumall(0,1,2,board);    //row 1 across
        result[3] = sumall(3,4,5,board);    //row 2 across
        result[4] = sumall(5,6,7,board);    //row 3 across
        result[5] = sumall(0,3,6,board);    //col 1 down
        result[6] = sumall(1,4,7,board);    //col 2 down
        result[7] = sumall(2,5,8,board);    //col 3 down

        for (int i = 0; i < result.length; i++) {
            checkOutcome(i,result);
        }
                return false;
    }
    
    public static void checkOutcome(int i, int result[]) {
        //Accepts array argument passed to it with the 8 values for the possible ways to win the game
        //Each one of the 8 is compared to the unicode sum of 3 X's or 3 O's to determine if a winner exists.
        //Testing Note:  After much testing and this method has not failed yet!
        if (result[i]==('X'+'X'+'X'))
        {
            System.out.println("X has won.  Thank you for playing.");
            System.exit(0);
        }
        if (result[i]==('O'+'O'+'O'))
        {
            System.out.println("O has won.  Thank you for playing.");
            System.exit(0);
        }        
}
    
        public static boolean invalidMoves(int square, char board[]) {
        //Some input validation is always good for a game like this.
        //The array and integer parameters are taken as arguments
        //The method returns a boolean true (valid) or false (invalid)
        if (board[square-1]>'9') {
            System.out.println("You have entered an invalid move.");
            return true;}
        return false;
    }
    
    public static int sumall(int a, int b, int c, char board[]) {
        //This method accepts 3 arguments plus a 4th one for the array, and returns the
        //sum of those 3 indexed locations.        
        return board[a]+board[b]+board[c];

    }



}
