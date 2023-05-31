package stack.more;

import java.util.*;

import stack.complete.StackInterface;

public class ArrayListStack<T> implements StackInterface<T>{
    
	private List<T> elements;
	
	public ArrayListStack() {
		elements = new ArrayList<T>();
	}
	
	@Override
	public void pop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void push(T obj) {
		elements.add(obj);
		
	}

	@Override
	public T top() {
		return null;
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

}


/*
 * import java.util.ArrayList;
import java.util.List;


public class ArrayListStack<T> implements StackInterfaceSimple<T> {

	private List<T> elements;
	
	public ArrayListStack() {
		elements = new ArrayList<T>();		
	}

	@Override
	public void pop() {
	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void push(T obj) {
		// TODO Auto-generated method stub
		elements.add(obj);
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		return null;
	}

}

 */
