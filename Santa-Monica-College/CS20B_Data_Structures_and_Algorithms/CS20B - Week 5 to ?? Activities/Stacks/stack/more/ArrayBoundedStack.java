package stack.more;

import stack.noexcept.StackInterfaceSimple;
import stack.complete.StackInterface;
import stack.complete.StackOverflowException;
import stack.complete.StackUnderflowException;


public class ArrayBoundedStack<T> implements StackInterface<T>{
    
	private T[] elements;
	private final int CAPACITY = 100;
	private int topIndex = -1;
	
	@SuppressWarnings("unchecked")
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

/*
 *  public class ArrayBoundedStack<T> implements StackInterfaceSimple<T>{

	protected final int DEFCAPACITY=100;
	protected T[] elements;
	protected int topIndex = -1;		//-1 when the stack is empty

	public ArrayBoundedStack(){
		elements = (T[]) new Object[DEFCAPACITY];
	}
	
	public boolean isEmpty(){
		if(topIndex == -1)
			return true;
		return false;	
	}
	
	
	
	
	
	
	@Override
	public void pop() {
		// remove item from the top of the stack for garbage collection
		// throws stackunderflowexception if empty
		
	}
	@Override
	public void push(T obj) {
		//add item to the top of the stack
		
	}
	
	@Override
	public T top() {
		// TODO Auto-generated method stub
		return null;
	}
		
}

 */
