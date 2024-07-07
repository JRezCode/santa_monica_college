import java.util.Scanner;

/**
 *
 * CS55 Section 1780 (Tue/Thu 9:30a)
 * Assignment: Project 4
 * Student: Jonathan Reznik, 1654919
 * 
 * Description:  A model or simulated environment for managing computer labs,
 * and workstations inside the lab.  A 5-digit ID number for user login, and 
 * a search designed to help round out the functionality.
 * 
 * NOTES:  Each method is described by parameter/arguments and return values, 
 * as well as a brief description of its purpose before the method definition.
 * 
**/


public class Lab {

    //global variables 
    private static final int ROW = 4;       //total number of labs
    private static final int[] COL = {5,6,4,3};     //# computers in each lab
    private static int[][] labArray = new int[ROW][];
        
    /* Static method that takes no args and returns nothing 
     * Used to create the 2d array, it assigns memory only */
    public static void createLab() {
        for(int i=0;i<ROW; i++){
            labArray[i]=new int[COL[i]];
        }
    }
    
    public static void main(String[]args) {
        createLab();    //call static method to create data structure

        //user menu
        int userChoice = 4;
        do {
            switch(userChoice) {
                case(1):
                //get labs, workstations and user id (overloaded method)
                    int pc[] = getInput(); int usr = getInput("ID");
                    int row = pc[0],col = pc[1];            
                //error handling                
                    if(isOccupied(row,col))continue;   
                //otherwise
                    setEntryAdd(usr,row,col);
                    break;
                case(2):
                //get user id, and location in table.
                    int drop = getInput("ID");        
                    row = getRow(drop); col = getCol(drop);
                //removal from array
                    setEntryRemove(row,col);
                    System.out.println("User "+drop+"is logged off.");
                    break;
                case(3):
                //get user id, and location in table
                    int user = getInput("ID");         
                    row = getRow(user); col = getCol(user);
                //search method performed
                    searchUser(user,row,col);
                    break;
                case(4):
                //show table
                    showComputers(labArray);
                    break;
                case(0):
                //quits the program
                    System.exit(0);
                default:
                //some more error handling
                    System.out.println("Oops, you do need to enter a valid "+
                    "input.");
            }
            userChoice = menu();
        }   
        while (userChoice!=0);
    }
    
    /*Menu Selection - Static method accepts no arguments, and returns an int.*/
    public static int menu() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please read and make your selection..."+
                        "\n0) Quit"+
                        "\n1) Simulate login"+
                        "\n2) Simulate logoff"+
                        "\n3) Search"+
                        "\n4) Show table again\n");
        return input.nextInt();
    }
    
    /*Show Lab - Static method accepts argument of a 2d array, and returns nothing */
    public static void showComputers(int[][] lab) {
        System.out.print("Information Technology Tracker");
        //iterate through lab
        for (int i = 0; i < lab.length; i++) {
            System.out.print("\nLab"+(i+1)+":");
            for (int j=0; j<lab[i].length; j++) {
                if(lab[i][j]==0)System.out.print("\t"+"PC-"+(j+1)+": empty ");
                else System.out.print("\t"+"PC-"+(j+1)+": "+lab[i][j]);
            }
        }
        System.out.println();
    }

    /* Adding a login - Static method accepts 3 integers and returns no value.*/
    public static void setEntryAdd(int usr, int row, int col) {
        labArray[row][col]= usr;
        showComputers(labArray);                  
    }

    /* Removing a login - Static method accepts 2 integers row/col and returns no value.*/
    public static void setEntryRemove(int row, int col) {
        labArray[row][col] = 0;
    }
    
    /* Error handling - Static method accepts two integers and returns a boolean.*/
    public static boolean isOccupied(int r, int c) {
        if(labArray[r][c]!=0) {
            System.out.println("Someone has already been logged in there. Maybe try another station");
            return true;
        }
        return false;
    }

    /* User input - Static method has no parameters, returns an array. */
    public static int[] getInput() {
        Scanner in = new Scanner(System.in);
        int[] result = new int[2];
        System.out.println("Enter the lab number the user is logging in from (1-"+ROW+"):");
        result[0] = in.nextInt()-1;
        System.out.println("Enter computer station number the user is logging in to (1-"+COL[result[0]]+"):");
        result[1] = in.nextInt()-1;
        return result;
    }
    
    /* Overloaded static method accepts string, and returns integer.*/
    public static int getInput(String arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 5-digit ID of the user:");
        //it would be good to do further handling for catching input errors
        return in.nextInt();
    }
    
    /* Search - static method accepts 3 ints and does not return any value*/ 
    public static void searchUser(int usr, int lab, int pc) {
        //Used to locate a specific user in the table
        if (lab==0 && pc==0) {
            //Check into 0,0 indexed location which is a logical error handling otherwise.
            if(labArray[lab][pc]==usr)
                System.out.println("User "+usr+" is logged into lab 1 at workstation 1");
            System.out.println("User not found.");
        }
        else System.out.println("User "+usr+" is logged into lab "+(lab+1)+" at workstation "+(pc+1));
    }
    
    /* Find table row and column given user ID
     * Static method accepts integer user ID and returns a string.*/
    public static String findID(int user) {
        int row=0,col=0;
        for (int i = 0; i < labArray.length; i++)
            for (int j=0; j<labArray[i].length; j++) {
                if(labArray[i][j]==user) {
                    row=i;col=j;
                }
            }
        return row+" "+col;
    }

    /* Getting lab row
    Static method accepts int arg (userID), calls findID(), returns int.*/
    public static int getRow(int u) {
        return (int)(findID(u).charAt(0) - 48);
    }

    /* Getting lab column
    Static method accepts int arg (userID), calls findID(), returns int.*/
    public static int getCol(int u) {
        return (int)(findID(u).charAt(2) - 48);
    }
    
}