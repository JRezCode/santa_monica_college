package I_O;
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


public class PracticeWithIO {

    static Scanner input = new Scanner(System.in);
    
public static void main(String [] args)
{
    char resp;
//      String resp;
    do
    {
        System.out.print("Continue");
        resp = input.next().charAt(0);
        //resp = input.next();
    } while(!(resp=='N' || resp=='n'));
    System.exit(0);
}
}
