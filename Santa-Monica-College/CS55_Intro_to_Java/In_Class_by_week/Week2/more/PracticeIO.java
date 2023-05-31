/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In_Class_by_week.Week2.more;

import java.util.*;
/**
*
*  @author dehkhoda_abbas
*/
public class PracticeIO
{
static Scanner input = new Scanner(System.in);
public static void main(String [] args)
{
System.out.print("what is your Name:");
String name = input.nextLine();
System.out.print(name +" you have a nice name\n\n");
showInOut();
System.exit(0);
}
public static void showInOut()
{
int a; char ch;
float f; double g; boolean x;
System.out.print("Enter an Integer:");
a = input.nextInt();
input.nextLine();
System.out.print("Enter a Character:");
ch  = input.nextLine().charAt(0);
System.out.print("Enter a true or false:");
x = input.nextBoolean();
System.out.print("Enter a double:");
g = input.nextDouble();
System.out.println("ch:"+ch+" a:"+a+" g:"+g+" x:"+x);
System.out.printf("ch:%c a:%d g:%.4f x:%b\n",ch,a,g,x);
}
}
