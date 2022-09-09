package test;

import queues.LinkedQueue;
import queues.QueueInterface;

public class LinkedQueueHW4P1Test {
	public static void main(String[] args){
		
	   QueueInterface<Character> stringQueue;
	    stringQueue = new LinkedQueue<Character>();
	    	    
	    char c = 'A'-1;
	    for (int i = 0; i < 7; i++)
	    {
	      System.out.print("Loading queue A-G> ");
	      c+=1;
	      stringQueue.enqueue(c);
	    }
	      
	    System.out.println("The test for toString representation");
	    System.out.println(stringQueue);
	    
	    int n = 3;
	    System.out.println("Testing the removal of first " + n + " items");
	    stringQueue.remove(n);
	    	    
	    //Now dequeue to print the other way
	    System.out.print("\nDequeueing:\n");
	    while (!stringQueue.isEmpty())
	    {
	      c = stringQueue.dequeue();
	      System.out.println(c);
	    }

	  }
}
