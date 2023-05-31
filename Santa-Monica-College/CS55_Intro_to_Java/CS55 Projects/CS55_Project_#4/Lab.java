import java.util.Scanner;

/**
 *
 * CS55 Section 1780 (Tue/Thu 9:30a)
 * Assignment: Project 4
 * Student: Jonathan Reznik, 1654919
 * 
 * Description:  The program has a model or simulated environment for managing
 * an array of values that are meant to be computer labs and workstations inside
 * the lab.  Also with input a 5-digit ID number for users logging in and out, 
 * and a search aspect that was designed to help round out the functionality.
 * 
 * NOTES:  
 * Overall I found this project to be very helpful at working through some various
 * value-returning functions.  I went through several iterations (not many), with the
 * first one attempting to make use of an array of objects, but after discussing it
 * with other students I realized that was too ambitious for this assignment and I
 * was able to begin work on this assignment again in this more successful outcome.
 * 
 * In the code below each method is described in terms of parameter/arguments and
 * return values, as well as a brief description (all before the method definition).
 * 
 * Features:
 * This program includes various mechanisms or features to assist, including the
 * use of global variable assignments for the dynamic array, some error handling
 * and input validation all explained throughout the project code.
 */



public class Lab {
    //global variables 
    private static final int ROW = 4;
    private static final int[] COL = {5,6,4,3};
    private static int[][] labArray = new int[ROW][];        //unsure whether to have final keyword or not here
        
    //creating the 2d array
    public static void createLab() {
        //The method accepts none and returns none, but assigns memory only
    labArray[0]=new int[COL[0]];
    labArray[1]=new int[COL[1]];
    labArray[2]=new int[COL[2]];
    labArray[3]=new int[COL[3]];
    }
    
    public static void main(String[]args) {
        //main method - starts by calling the method to create a lab that stores workstations
        createLab(); 
        //next is the loop for user menu and input/output
        int userChoice = 4;
        do {
            switch(userChoice) {
            case(1):
            //getters for labs, workstations and user id (overloaded method)
                int pc[] = getInput(); int usr = getInput("ID");
                int row = pc[0],col = pc[1];            
            //error handling so it just works                
                if(alreadyThere(row,col))continue;   
            //setter for 2d array using 3 values
                setEntryAdd(usr,row,col);
                break;
            case(2):
             //getters for user id, and location in table.
                int drop = getInput("ID");        
                row = getRow(drop); col = getCol(drop);
             //setter for removal from 2d array
                setEntryRemove(row,col);
                System.out.println("User "+drop+"is logged off.");
                break;
            case(3):
              //getters are the same for case 2 then search method performed
                int user = getInput("ID");         
                row = getRow(user); col = getCol(user);
                searchUser(user,row,col);
                break;
            case(4):
              //an option to select for showing the table again
                showComputers(labArray);
                break;
            case(0):
               //quits the program
                System.exit(0);
            default:
                //some more error handling
                System.out.println("Oops, you do need to enter a valid input.");
        }
                userChoice = menu();
        }   while (userChoice!=0);
    }
    
    //Method for main menu= accepts no parameters, and returns an int with the selection.
    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please read and make your selection...\n0) Quit\n1) Simulate login\n2) Simulate logoff\n3) Search\n4) Show table again\n");
        return input.nextInt();
    }
    
    //Method for table display= accepts argument of a 2d array, and returns nothing
    public static void showComputers(int[][] sta) {
    System.out.print("Information Technology Tracker");
    for (int i = 0; i < sta.length; i++) {
        System.out.print("\nLab"+(i+1)+":");
        for (int j=0; j<sta[i].length; j++) {
            if(sta[i][j]==0)System.out.print("\t"+"PC-"+(j+1)+": empty ");
            else System.out.print("\t"+"PC-"+(j+1)+": "+sta[i][j]);
        }
    }
    System.out.println();
    }

    //Method for adding login event = accepts 3 integers and returns no value
    public static void setEntryAdd(int usr, int row, int col) {
        labArray[row][col]= usr;
        showComputers(labArray);                  
    }

    //Method for removing table entry = accepts 2 integers row/col and returns no value    
    public static void setEntryRemove(int row, int col) {
        labArray[row][col] = 0;
    }
    
    //Method for mistakes in input = accepts integers row/col and returns boolean occupied (true) or available (false).
    public static boolean alreadyThere(int r, int c) {
        if(labArray[r][c]!=0) {
                    System.out.println("Someone has already been logged in there. Maybe try another station");
                    return true;
        }
        return false;
    }

    //Method for accepting input = no parameters, input is returned as an array indexing the lab and workstation location.
    public static int[] getInput() {
        Scanner in = new Scanner(System.in);
        int[] result = new int[2];
        //calls global variable to help guide the input via output (does this twice over next 4 lines)
        System.out.println("Enter the lab number the user is logging in from (1-"+ROW+"):");
        result[0] = in.nextInt()-1;
        System.out.println("Enter computer station number the user is logging in to (1-"+COL[result[0]]+"):");
        result[1] = in.nextInt()-1;
        return result;
    }
    
    //Overloaded method for accepting input = accepts a string argument, is overloaded and returns user input as integer.
    public static int getInput(String arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 5-digit ID of the user:");
        //it would be good to do further handling for catching input errors
        return in.nextInt();
    }
    
    //Method for search = accepts 3 integers and does not return any value. (Void)
    public static void searchUser(int usr, int lab, int pc) {
        //Used locate a specific user in the table
        if (lab==0 && pc==0) {
            //Checks if there is a user logged into 0,0 indexed location which is a logical error handling otherwise.
            if(labArray[lab][pc]==usr)
                System.out.println("User "+usr+" is logged into lab 1 at workstation 1");
            System.out.println("User not found.");
        }
        else System.out.println("User "+usr+" is logged into lab "+(lab+1)+" at workstation "+(pc+1));
    }
    
    //Method for finding table row and column given user ID = accepts integer user ID and returns a string.
    public static String findID(int user) {
        int row=0,col=0;
        for (int i = 0; i < labArray.length; i++)
            for (int j=0; j<labArray[i].length; j++) {
                if(labArray[i][j]==user) {
                    row=i;col=j;
                }}
        return row+" "+col;
    }

    //Method for getting lab/row = accepts argument for user ID and calls method findID returning an integer for the lab #.
    public static int getRow(int u) {
        return (int)(findID(u).charAt(0) - 48);
    }

    //Method for getting computer/col = accepts argument for user ID and calls method findID returning an integer for the computer station # in the lab.
    public static int getCol(int u) {
        return (int)(findID(u).charAt(2) - 48);
    }    
}