package app;

import queues.CircularLinkedQueue;

public class HomeworkP5Test {

	public static void main(String[] args){
		CircularLinkedQueue<String> strQ = new CircularLinkedQueue<String>();
		strQ.enqueue("a");
		strQ.enqueue("b");
		strQ.enqueue("c");
		strQ.enqueue("d");
		strQ.enqueue("e");
		System.out.println("Loaded the queue with " + strQ.size() + " items");
		System.out.println("Testing dequeue");
		System.out.println(strQ.dequeue());
		System.out.println(strQ.dequeue());
		System.out.println(strQ.dequeue());
		System.out.println(strQ.dequeue());
		System.out.println(strQ.dequeue());		
		System.out.println(strQ.dequeue());
	}
}
