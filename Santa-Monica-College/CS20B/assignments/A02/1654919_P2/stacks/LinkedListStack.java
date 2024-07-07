package stacks;
import linkedlist.*;
/**
 * Safe Implementation of stack using a linked list
 * @author jonathan (adapted from irma prior to HW2)
 * 
 * This class implements the StackInterface with a generic type T
 * @param <T>
 */
public class LinkedListStack<T> implements StackInterface<T>
{
  protected LLNode<T> top;   //references top of this stack
  public LinkedListStack()
  {
    top = null;
  }

  public void push(T element)
  // Safely places an element at the top of this stack
  { if(safePush(element))
	{
	  LLNode<T> newNode = new LLNode<T>(element);
	  newNode.setLink(top); //set newNode to reference the current top node
	  top = newNode; //change the top node to be the newly created node
	}
  }     
  
  public boolean safePush(T el)
  // This method is logically not necessary in a LL but is included as part of the interface
  { return true; }
  
  public void pop()
  // Removes the top element off stack
  {                  
    //we just move top to the next element
      top = top.getLink(); 
  }
  
  public boolean safePop()
  // Safely checks if pop() can be used before calling it
  {
      if (isEmpty())
          return false;
      else
          pop();
          return true;  
  }

  public T top()
  // Returns top of stack element or a null
  {                 
    if (isEmpty())
      return null;      //for empty stack
    else
      return top.getInfo();
  }
  
  
  public boolean isEmpty()
  // Returns true if this stack is empty, otherwise returns false.
  {              
    return (top == null); 
  }

  public boolean isFull()
  // Returns false always since a linked list is not limited in its capacity
  {              
      return false;
  }

  
}

