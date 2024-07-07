package apps;
import stacks.*;

public class StackDriver 
{
  public static void main(String[] args)
  {
    StackInterface<String> test;
    test = new ArrayBoundedStack<String>(); 
    test.push("A");
  }
}