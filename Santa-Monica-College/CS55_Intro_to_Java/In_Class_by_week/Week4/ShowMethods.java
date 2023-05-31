/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In_Class_by_week.Week4;

import java.util.Scanner;

/**
 *
 * @author JR
 */
public class ShowMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
       
        for(int i = 0; i < 20 ; i++)
        {
            //System.out.println(getNumberBetweenFiveAnd75());
            System.out.println(getRandom(100,999));
        }
        
        System.exit(0);
    }
    
    public static void doIt(Scanner   x)
    {
        double d = x.nextDouble();
        System.out.printf("====>>>%.4f\n",d);
        
    }
    
    
    
    public static int getNumberBetweenFiveAnd75()
    {
        int r =   (int)(Math.random()*(75-5+1))+ 5;
        return r;
    }
    public static int getRandom(int low, int high)
    {
        
        return (int)(Math.random()*(high-low+1))+ low;
    }
}
