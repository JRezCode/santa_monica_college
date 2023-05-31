public class LinkedListQueue<T> implements QueueInterface<T> {

	private LLNode<T> front;
	private LLNode<T> rear;
	private int numElements = 0;
	
	//Constructor
	
	
	@Override
	public T dequeue() throws QueueUnderflow {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enqueue(T q) throws QueueOverflow {
		// TODO Auto-generated method stub
		LLNode<T> newNode = new LLNode<T>(q);
		if(rear == null){
			front = newNode;
		}
		else{
		this.rear.setLink(newNode);
		}
		rear = newNode;	
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}	

}
