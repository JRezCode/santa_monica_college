
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jon
* Good method for practicing input output with exception handling of negative values
*
*/
public class PrintStringOfNumbers {

    public static void main(String[] args) {
    double x=2000000;
    Scanner output = new Scanner(System.in);
    System.out.print("I can add 2,000,000 to a number, enter a number in between 0 and 127");
    byte y=output.nextByte();
    System.out.print("The number provided, " + y + ", added to " + x + " is " +(x+y));
    System.exit(0);
}
    
}
