/*
 * Written in class Queues
 * @author Jonathan
 */

public interface QueueInterface<T> {

	/**
	 * Removes the last entry from the queue
	 * @return
	 * @throws QueueUnderflow
	 */
	T dequeue() throws QueueUnderflow;
	
	/**
	 * Adds an entry to the queue
	 * @param q
	 * @throws QueueOverflow
	 */
	void enqueue(T q) throws QueueOverflow;
	
	/**
	 * Tests for empty queue
	 * @return
	 */
	boolean isEmpty();

	/**
	 * Tests if full is queue
	 * @return
	 */
	boolean isFull();

	/**
	 * Returns the size of the queue
	 * @return
	 */
	int size();
	
}
