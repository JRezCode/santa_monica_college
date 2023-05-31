//----------------------------------------------------------------------
// ArrayListStack.java        by Dale/Joyce/Weems              Chapter 2
//
// Implements an unbounded stack using an ArrayList.
//----------------------------------------------------------------------

package ch02.stacks;

import java.util.ArrayList; 

public class ArrayListStack<T> implements StackInterface<T>
{
	/*
	 * @note by jon
	 * use of generic interface and implementation means declaring type 
	 * occurs in application code
	 * 
	 * Step 1. declare the object type
	 */
  protected ArrayList<T> elements; // ArrayList that holds stack elements

  public ArrayListStack() 
  {
	  /* 
	   * Step 2. instantiate the object does some magic in java for an empty list
	   */
    elements = new ArrayList<T>();      
  }


  /*
   * Step 3. Define operations on the data structure
   * Stack has push, pop and top
   * plus 2 observer functions isFull and isEmpty
   */

  // Args-object of parameterized type T/Returns-void
  public void push(T element)   
  // push - Places element at top of this stack
  {
	  // Error handling - none needed due to implementation with ArrayList (never filled)
    elements.add(element);
  }

  // Args-none/Returns-void
  public void pop()               
  // pop - Throws StackUnderflowException if this stack is empty, or removes top element from stack.
  {
	  // Error handling - checks if empty before removing elements
    if (isEmpty())
      throw new StackUnderflowException("Pop attempted on an empty stack.");
    else 
      elements.remove(elements.size() - 1);
	/*
	 * @note by jon
	 * Arraylist size() method is used with minus one for the last item index
	 */
  }

  // Args-none/Returns-T object
  public T top()
  // top - Throws StackUnderflowException if empty or returns top element of this stack.
  {
	  // Error handling - checks if empty before returning an object or returns null
	  if(isEmpty())
		  throw new StackUnderflowException("Top attempted on an empty stack.");
	  else
		  return elements.get(elements.size()-1);
  }
  
  //Observers for the full/empty checks
  
  //Args-none/Returns-boolean
  public boolean isEmpty()         
  // Returns boolean true if stack is empty, otherwise returns false.
  {
    return (elements.size() == 0);
  }

  //Args-non/Return-boolean
  public boolean isFull()
  // Returns false - an ArrayList stack is never full.
  {              
    return false;
  }

  /* Top method as initially demonstrated in the textbook
    public T top()             
  {
    T topOfStack = null;
    if (isEmpty())
      throw new StackUnderflowException("Top attempted on an empty stack.");    
    else 
      topOfStack = elements.get(elements.size() - 1);
    return topOfStack;
  } */
  

}