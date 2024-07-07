/**
 * The stack that is array bounded and interface are unchanged from class
 * @implemented by jonathan (for Homework Project 3)
 * 
 * The generic type in here is String in this application
 */


import java.util.Scanner;
import stacks.*;

public class EditString {

    private static String phrase;
 
    public static void main(String[] args){	
		//we need a scanner
        Scanner input = new Scanner(System.in);

		//might as well take some input as well
		System.out.println("Type something here...");
        phrase=input.nextLine();

		//implementation of ArrayBoundedStack and push() to it with initial string input
        StackInterface<String> stringStack = new ArrayBoundedStack<String>();
        stringStack.push(phrase);
        
        while(true){
			//menu using switch/case (for cases - Upper, Lower, Reverse, Change chars, and Undo...and Finish)
            System.out.println("Make changes to the string...\nU\nL\nR\nC\nZ\nX - show result");
            switch(input.next().toUpperCase()){
                case("U"):
                    stringStack.push(stringStack.top().toUpperCase());
                    break;
                case("L"):
                    stringStack.push(stringStack.top().toLowerCase());
                    break;
                case("R"):
                    //In the case of "reverse" I use a StringBuilder on the top item
                    String forward = (String) stringStack.top();
                    StringBuilder backward = new StringBuilder();
                    for(int i = 0; i<phrase.length(); i++) {
                        backward.append(forward.charAt(phrase.length()-i-1));
                    }
					//finally the result is pushed to the stack
                    stringStack.push(reversed.toString());
                    break; 
                case("C"):
					//Scanner input is called again
					System.out.println("Character to replace?");
                    char input1 = input.next().charAt(0);
					System.out.println("Replace with character:");
                    char input2 = input.next().charAt(0);

                    stringStack.push(stringStack.top().replace(input1, input2));

                    break;

                case("Z"):
					//Undo = pop() is a nice thing!
                    stringStack.pop();
                    break;
					
                case("X"):
					//This is the final input to then finish the program using top() and exit
                    System.out.println("Your result is:\t" + stringStack.top());;
                    System.out.println("\nThank you for using the String Editor");
                    System.exit(0);
                    break;
        }
    }
    }
}        