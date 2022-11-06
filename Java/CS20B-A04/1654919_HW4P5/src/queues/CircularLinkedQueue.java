//---------------------------------------------------------------------------
// LinkedQueue.java            by Dale/Joyce/Weems                  Chapter 4
//
// Implements QueueInterface using a linked list.
//---------------------------------------------------------------------------

package queues;

import linkedlist.LLNode;

public class CircularLinkedQueue<T> implements QueueInterface<T>
{
  //protected LLNode<T> front;     // we no longer need a reference to the front of this queue
  protected LLNode<T> rear;      // reference to the rear of queue
  protected int numElements = 0; // number of elements in this queue

  public CircularLinkedQueue()
  {
    //front = null;
    rear = null;
  }

  public void enqueue(T element)
  // Adds element to the rear of this queue.
  { 
    LLNode<T> newNode = new LLNode<T>(element);
    if (rear != null){
    	newNode.setLink(rear.getLink());
    	rear.setLink(newNode);
    	rear = newNode;
    	}    
    else{
    	rear = newNode;
    	rear.setLink(rear);
    }
    numElements++;
  }     

  public T dequeue()
  // Throws QueueUnderflowException if this queue is empty;
  // otherwise, removes front element from this queue and returns it.
  {
    if (isEmpty())
      throw new QueueUnderflowException("Dequeue attempted on empty queue.");
    else
    {
      T element;
      element = rear.getLink().getInfo();
      rear.setLink(rear.getLink().getLink());
      if(numElements==1)
    	  rear = null;
      numElements--;
      return element;
    }
  }

  public boolean isEmpty()
  // Returns true if this queue is empty; otherwise, returns false.
  {              
    return (rear == null);
  }
  
  public boolean isFull()
  // Returns false - a linked queue is never full.
  {              
    return false;
  }

  public int size()
  // Returns the number of elements in this queue.
  {
    return numElements;
  }

}

