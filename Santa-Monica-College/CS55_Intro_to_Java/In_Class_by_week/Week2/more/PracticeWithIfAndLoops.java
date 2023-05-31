/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In_Class_by_week.Week2.more;

import java.util.Scanner;

/**
 *
 * @author dehkhoda_abbas
 */
public class PracticeWithIfAndLoops 
{
    public static void main(String [] args)
    {   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number = input.nextInt();
        System.out.println(number + ((number % 2)==0? " Even": " Odd") );
        
        
        
       /*
        boolean even = (number % 2) == 0;
        if(even)
        {
           System.out.print(number + " is an Even\n"); 
        }
        else
        {
           System.out.print(number + " is an odd\n"); 
        }
        
        
        if((number % 2) == 0)
            System.out.print(number + " is an Even\n");
        else
            System.out.print(number + " is an Odd\n");

        */
        
        System.exit(0);
    }
    
    public static void showLoopEndingWithTrueFalse()
    {
        Scanner input = new Scanner(System.in);
        boolean resp;
        do
        {
            
            
 
            System.out.print("Continue (true/false):");
            resp = input.nextBoolean();  
            
        }while(resp); 
    }
    
    
    
    
    public static void showLoopsEndingWithString()
    {
        Scanner input = new Scanner(System.in);
        String resp;
        do
        {
            
            
         
            System.out.print("Continue (Yes/No):");
            resp = input.next();
            
        }while(resp.equalsIgnoreCase("YES"));
        
        
    }
    
    
    
    
    public static void showLoopsEndingWithCharater()
    {
        Scanner input = new Scanner(System.in);
        char resp;
        do
        {
            
            
         
            System.out.print("Continue (Y/N):");
            resp = input.next().charAt(0);
            
        }while(resp == 'Y');
    }
}
