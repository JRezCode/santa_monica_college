
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jon
 */

/* NOTES REGARDING INSTRUCTIONS about Program Function and Structure:
   +The program makes use of a input (Scanner object) inside of main method
   +A section that can be changed is for calculations of different data types in float vs integer calculations
   +The program lacks color for input/ouptu and appearance could be improved (for later)
*/
   
public class Calculator {

    public static void main(String[] args)
    {
        //Create object of type scanner and begin 'do while' loop
        Scanner input = new Scanner(System.in);
        char restart;
        do
        {        
        //print initial output to user
        System.out.println("Hi, I am really good at math!  Try me out.  I can add, subtract, multiply and divide.");
        System.out.println("Please enter two numbers and then press Enter:");

//The compiler is therefore afforded the choice to make the change in the code as either an Integer or Float calculator

        //uncomment for Integer calculator but be sure to COMMENT OUT the below assignments of type float (double precision).
        //int first = input.nextInt();
        //int second = input.nextInt();
        
//By default the next two lines should be uncommented for double precision float calculator.
            double first = input.nextDouble();
            double second = input.nextDouble();

                    
        //String operator assignment statement with input.next() method call followed by switch case structure
        System.out.println("Please enter one of the operations +,-,*,/  and press Enter:");
            char strOperation = input.next().charAt(0);
            switch(strOperation) {
                case '*': 
                    System.out.println(first + " * " + second + " = " + first*second + "\n I am great at Multiplication!\n I multiplied " + first + " by " + second); break;
                case '/': 
                    System.out.println(first + " / " + second + " = " + first/second + "\n I am great at Division!\n I divided " + first + " by " + second); break;
                case '+': 
                    System.out.println(first + " + " + second + " = " + (first + second) + "\n I am great at Addition!\n I added " + first + " to " + second); break;
                case '-': 
                    System.out.println(first + " - " + second + " = " + (first - second) + "\n I am great at Subtraction!\n I subtracted " + first + " by " + second); break;
                default: 
                    System.out.println("I am a computer that can compute really well, but what you entered is not one of the operations I know. \n"); break;
            }
         //Prompt user for quit or continue and sets variable 'restart' using input.next.charAt(0) 
            System.out.println("Press 'q' to exit, or any other character followed by enter to continue:");
            restart = input.next().charAt(0);
            } while (restart != 'q');
        //This final portion of code is only run when user input for prior step is the character 'q', which triggers exit from the loop structure.
            System.out.println("Bye bye!");
            input.close();
            System.exit(0);
                        }
        }               
                       