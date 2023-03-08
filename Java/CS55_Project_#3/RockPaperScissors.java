
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Name - Jonathan Reznik
 * Project - CS55 assignment (rock paper scissors)
 * Notes re: this program
 *  This program is defined by project 2 requirements for simple comparing characters returned
 *  during the early part of main, until the end when a more complex void (non-returning)  method
 *  providing the game results.    All of main's statements are contained within a do while loop 
 *  so that the game is also repeatable, and I included 1 overload for play again to help deal with
 *  some possible wrong user input during the selection of menu items.  Hence the additional method is
 *  for exception handling.  Another method could easily be added for handling the input for repeats.
 *  .
 */

public class RockPaperScissors {
    
    public static void main(String[] args)
    {
        System.out.println("Recall the rules of the game Rock crushes scissor. Paper wraps rock. And. Scissor cuts paper");        
        char again;
        Scanner repeat = new Scanner(System.in);
        Scanner user = new Scanner(System.in);
                do {
        	char usermove = userChoice(user);
            if (!(usermove=='r' || usermove=='s' || usermove=='p'))
                playAgain("badInput");
            
            else {
            	char compmove = computerChoice();
            	determineWinner(usermove, compmove);
            	}
            playAgain();
            again = repeat.nextLine().toLowerCase().charAt(0);
            }  while (again=='y');
        repeat.close();
        user.close();
    }
    

    //This void method accepts two character arguments and determines from them the winner of the game
    //As well as prints the result to output/console
    public static void determineWinner(char x, char y) 
        {
    	String gameResult;
    	if ((x=='r' && y=='s') || (x=='s' && y=='p') || (x=='p' && y=='r')) {
            gameResult = "You win!!";
                switch(x) {
                    case 'r':
                    gameResult+=" Rock crushes scissors.\n";
                    break;
                    case 'p':
                    gameResult+=" Paper wraps rock.\n";
                    break;
                    case 's':
                    gameResult+=" Scissor cuts paper.\n"; 
                    break;
                }
    	}
    	else if (x==y) {
                gameResult = "There is a draw.";
            }
    	else {
    		gameResult = "You lose.";
    	}
    	System.out.println(gameResult);
    }
    
    //This void method with no args is just a method for printing the line 'Would you like to play again'
    //The method is used to overload it with other things later like error handling
    public static void playAgain() 
    {
    	System.out.print("Would you like to play [y/N]: ");
     }

    public static boolean playAgain(String arg) 
    //This overload method accepts a String arg is for handling specific input error the method 
    //is called in main 1x with no argument for typical output and 1x inside the game for this bad input condition
    {
    	if (arg=="badInput") 
    	{
    		System.out.println("You chose something that isn't an option therefore when program restarts enter r, p or s");    		
    		}
    	return false;
    	}
    
    
    public static char userChoice(Scanner u) 
    {
    	//user method does not accept argument and returns only 1 character which is...ideally r, p or s
    	System.out.println("Please choose\n (r) Rock\n (p) Paper\n (s) Scissor");
//    	Scanner input = new Scanner(System.in);
    	char result = u.nextLine().charAt(0);
//    	input.close();
    	return result;
     }
    
    public static char computerChoice() 
    //This method accepts no args and returns the char that produces the computer move
    //It uses a second method call inside this method to get the random number for the move.
    {
    	int rand = randInt(1,3);
    	char computer = ' ';
        switch(rand) {
            case 1:
                computer = 'r';
                break;
            case 2:
                computer = 'p';
                break;
            case 3:
                computer = 's';
                break;                
        }
        return computer;
        }
    
    public static int randInt(int min, int max) 
    //This method takes two integer arguments and returns a random int working better than
    //the alternative of (int)((Math.random())* 3)  
    {
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min)+1)+min;
    return(randomNum);
    }
}
