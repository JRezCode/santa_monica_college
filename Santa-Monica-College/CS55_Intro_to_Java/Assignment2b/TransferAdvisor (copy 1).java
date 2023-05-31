/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Name - Jonathan Reznik
 * Project - CS55 second assignment (redo)
 * Notes re: this program
 *  Initial program done with no File imports and no file management
 *  Currently the file was redone with reliance on the files in the project folder
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
        
public class TransferAdvisor {
/* -This program implements a lookup of minimum required transfer GPA to compare to student GPA from input.
*  -The final portion handles errors for combinations not occurring.
*  
  //Changs to project:
*  1)) fixed minor issues
*  2) improved error handling
*  3) also improved comments and format
*  
*  NOTE DUE TO THE USE OF FILE INPUT IN THIS PROGRAM, THE FOLLOWING FILES MUST EXIST IN THE CORRECT PLACE
*  FOR THE PROGRAM TO WORK....UCB.txt, UCI.txt, UCLA.txt, and UCSD.txt 	thank you
*/              
      public static void main(String [] args) 
      {

          //Created a new scanner object and collects information about School/Major
          Scanner input = new Scanner(System.in);

          System.out.println("Enter The School Name: ");
          String transferCollege = input.nextLine();        
          System.out.println("Enter the major (either CS, Econ or English): ");
          String collegeMajor = input.nextLine();
          
          System.out.print("Minimum entry GPA to this school for " + collegeMajor + ": ");

          //This part of the program returns the correct minimum gpa for transfer college & major
          double minGPA = compareGPA(transferCollege,collegeMajor);
          
          //Get user input for comparison against
          System.out.print("Enter your GPA: ");
          double gradePointAverage = input.nextDouble();

          if(gradePointAverage>=minGPA)
          {
              System.out.println("You could transfer to " + transferCollege + " to study " + collegeMajor);
          }
          else {
        	  System.out.printf("you must raise your GPA to be eligible for transfer to " + transferCollege + " by %.1f", (minGPA - gradePointAverage));
          } 
          input.close();
      }
            
      //This method accepts two string arguments college and major and returns the double value from the file lookup
      public static double compareGPA(String transferCollege,String collegeMajor) {
       double gpa;
       File file = new File(transferCollege.toUpperCase().concat(".txt"));       
       try {
              Scanner sc = new Scanner(file);
              while (sc.hasNextLine())
              {
            	  String line = sc.nextLine();
            	  if (line.equalsIgnoreCase(collegeMajor)) 
            	  {
            		  gpa = Double.parseDouble(sc.nextLine());
            		  System.out.println(gpa);
            		  return gpa;
            		  }
            	  else if (line.isEmpty()) {
            		  sc.close();
            	  }
            		  continue;
              }
       System.out.println("The entered major, " + collegeMajor + ",is not offered at " + transferCollege + ".");  
       }
        
        catch (FileNotFoundException ex) {
        	  System.out.println(ex);
        	  handleExceptionsFor(collegeMajor, transferCollege);
        	  //An optional logger uncomment://  Logger.getLogger(TransferAdvisor.class.getName()).log(Level.SEVERE, null, ex);              
          }
          
       
     //Another way of handling of data inside the program is a switch case instead of file input

/*        switch (transferCollege+"+"+collegeMajor) {
            case "UCLA+CS": return(3.7);                    //String city = 'Los_Angeles';
            case "UCLA+ECON": return(3.5);                  //String city = 'Los_Angeles';
            case "UCLA+ENGLISH": return(3.2);               //String city = 'Los_Angeles';
            case "UCB+CS": return(3.8);                     //String city = 'Berkley';
            case "UCB+ECON": return(3.4);                   //String city = 'Berkley';
            case "UCB+ENGLISH": return(3.3);                //String city = 'Berkley';
            case "UCI+CS": return(3.6);                     //String city = 'Irvine';
            case "UCI+ECON": return(3.7);                   //String city = 'Irvine';
            case "UCI+ENGLISH": return(3.4);                //String city = 'Irvine';
            case "UCSD+CS": return(3.5);                    //String city = 'San_Diego';
            case "UCSD+ECON": return(3.3);                  //String city = 'San_Diego';
            case "UCSD+ENGLISH": return(3.0);               //String city = 'San_Diego';
    }
  */      
       return 0;
    }

      public static void handleExceptionsFor(String collegeMajor, String transferCollege) 
      {
    	  if (!collegeMajor.equals("CS") && !collegeMajor.equals("ECON") && !collegeMajor.equals("ENGLISH")) 
    	  {
    		  System.out.println("This database is only for majors of CS, Econ, or English\n please try again");
    		  }
    	  else if (!transferCollege.equals("UCLA") && !transferCollege.equals("UCB") && !transferCollege.equals("UCI") && !transferCollege.equals("UCSD"))
    	  {
    		  System.out.println(transferCollege + " is not in the school system \n At this time information is only available for UCLA, UCB, UCI, and UCSD.");
    		  }
    	  else 
    	  {
    		  System.out.println("There is no " + collegeMajor + " at " + transferCollege);
    		  }
    	  System.exit(0);
    	  }
      }