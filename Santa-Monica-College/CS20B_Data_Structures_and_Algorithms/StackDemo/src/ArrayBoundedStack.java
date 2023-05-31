
public class ArrayBoundedStack<T> implements StackInterface<T>{
    
	private T[] elements;
	private final int CAPACITY = 100;
	private int topIndex = -1;
	
	public ArrayBoundedStack() {
		this.elements = (T[]) new Object[CAPACITY];
	}
	
	@Override
	public void pop() {
		if(isEmpty())
		//if(topIndex == -1)
			throw new StackUnderflowException("My stack is empty");
		this.elements[topIndex--] = null;
	}

	@Override
	public void push(T obj) {
		if(topIndex == CAPACITY)
			throw new StackOverflowException("My stack is full");
		this.elements[++topIndex] = obj; 
		
	}

	@Override
	public T top() {
		return elements[topIndex];
	}

	@Override
	public boolean isEmpty() {
		if(topIndex == -1)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		if(topIndex == CAPACITY)
			return true;
		return false;
	}

	

}
