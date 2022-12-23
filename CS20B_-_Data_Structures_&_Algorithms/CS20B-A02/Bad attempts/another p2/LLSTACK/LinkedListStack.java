import linkedlist.*;
/**
 * Implementation of stack using a linked list
 * @author irma
 * @adapted by jonathan (for the purpose of Assignment 2 project 2)
 * 
 * This class implements the StackInterface with a generic type T
 * @param <T>
 */
public class LinkedListStack<T> implements StackInterface<T> 
{
	
	protected LLNode<T> top;   //references top of this stack
	public LinkedListStack() {
		top = null;
		}
		
	public void push(T element)
  // Safely places an element at the top of this stack
  { if(safePush(element))
	{
	  LLNode<T> newNode = new LLNode<T>(element); //create a new node
	  newNode.setLink(top); //set newNode to refer to the current top node
	  top = newNode; //change the top node to be the newly created node
	}
  }     
  
  public boolean safePush(T el) 
  // This method is logically not necessary in a LL but is included as part of the interface
  { return true; }
  
  public void pop()
  // Safely removes from the top element off stack
  {                  
      top = top.getLink(); //when an element is removed, we just move top to the next element
  }
  
  public boolean safePop()
  // Returns boolean result for use by pop() for handling of due to empty or final element (null link) in the stack
  {
      if (isEmpty())
          return false;
      else
          pop();
          return true;  
  }

  public T top()
  // Returns the top element of this stack or if none exists then a null.
  {                 
    if (isEmpty())
      return null;      //for the empty structure
    else
      return top.getInfo();
  }
  
  
  public boolean isEmpty()
  // Returns true if this stack is empty, otherwise returns false.
  {              
    return (top == null); 
  }

  public boolean isFull()
  // Returns false - a linked stack is never full
  {              
      return false;
  }

  
}

