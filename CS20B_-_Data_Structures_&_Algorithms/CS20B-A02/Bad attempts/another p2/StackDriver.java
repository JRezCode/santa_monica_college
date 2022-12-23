package stacks;
import linkedlist.*;
import implementation.*;

public class StackDriver 
{
  public static void main(String[] args)
  {
    StackInterface<String> test;
    test = new LinkedListStack<String>();     

    //Using test to show top without anything pushed onto the stack (it is safe!)
    test.top();
      
    //Push A and B, which is basically safe always!
    test.push("A");
    test.push("B");

    //For the testing of Pop (it is safe!)
    System.out.println(test.top());
    test.safePop();
    System.out.println(test.top());
    test.safePop();
    System.out.println(test.top());
    test.safePop();
    System.out.println(test.top());
    test.safePop();
    System.out.println(test.top());
    
    
  }
}