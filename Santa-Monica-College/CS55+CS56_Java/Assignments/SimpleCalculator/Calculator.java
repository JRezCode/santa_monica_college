import java.util.Scanner;

/*A calculator using Strings, double float and switch and case*/
   
public class Calculator {

    public static void main(String[] args)
    {
        //Create scanner for user input
        Scanner input = new Scanner(System.in);

        char restart;   // Yes (y) / No (n)

        //'do while' loop begin
        do
        {        
            System.out.println( "Hi, add, subtract, multiply or divide.\n"+
                                "Enter two numbers then press Enter:");
        
            //initiate double precision float values with input
            double first = input.nextDouble();
            double second = input.nextDouble();
                    
            System.out.println("Select from +,-,*,/  and press Enter:");

            //hold the operator assignment 
            String strOperation = input.next();

            //switch case structure
            switch(strOperation) {
                case "*": 
                    System.out.println(
                        first + " * " + second + " = " + first*second + 
                        "\n You multiplied " + first + " by " + second      ); 
                    break;
                case "/": 
                    System.out.println(
                        first + " / " + second + " = " + first/second + 
                        "\n You divided " + first + " by " + second         ); 
                    break;
                case "+": 
                    System.out.println(
                        first + " + " + second + " = " + (first + second) + 
                        "\n You added " + first + " to " + second           ); 
                    break;
                case "-": 
                    System.out.println(
                        first + " - " + second + " = " + (first - second) + 
                        "\n You subtracted " + first + " by " + second      ); 
                    break;
                default: 
                    System.out.println("That is not one of the operations.");
                    break;
            }
            //Prompt for quit or continue 
            System.out.println("Press 'q' to exit, or any other to continue:");
            restart = input.next().charAt(0);
        } while (restart != 'q');

        //Goodbye.
        System.out.println("Bye bye!");
        System.exit(0);
    }
}               
                       