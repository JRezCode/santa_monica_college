import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jon
 */

public class Calculator {
    
    public static void main(String[] args) 
        {
            /*double first;
            double second;*/
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first operand");
            double first = input.nextDouble();
            System.out.println("Enter second operand");
            double second = input.nextDouble();
           
            //System.out.println("Next you have to enter operator for the calculation")
            
            //Assignment of result to x       
          double x;
            x = first + second;
            System.out.println(x);
            System.exit(0);
        }
}