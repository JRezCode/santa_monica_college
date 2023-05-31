package In_Class_by_week.Week4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JR
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dehkhoda_abbas
 */
public class FileIO 
{
    
    public static void main(String [] args) throws Exception
    {    int nBlank = 0;
        File infile = new File("data.txt");
        File outfile = new File("result.txt");
        
        PrintWriter pr = new PrintWriter(outfile);
        
        Scanner input = new Scanner(infile);
        
        while(input.hasNext())
        {
        
           String line = input.nextLine();
           for(int i = 0 ; i < line.length(); i++)
           {
               if(line.charAt(i)==' ')
               {
                   nBlank++;
               }
               
           }
           System.out.println(line);
           pr.println(line);
        }
        System.out.println("Total Blanks are:"+nBlank);
        pr.println("Total Blanks are:"+nBlank);
        input.close();
        pr.close();
        
        
        
        
        
    
       System.exit(0);
    }
    
}
