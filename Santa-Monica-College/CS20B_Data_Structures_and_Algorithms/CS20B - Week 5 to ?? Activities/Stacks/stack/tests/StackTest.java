package stack.tests;

import stack.more.ArrayBoundedStack;

public class StackTest {

	public static void main(String[] args){
		
		ArrayBoundedStack<Integer> stack = new ArrayBoundedStack<Integer>();
		stack.push(10);
		stack.top();
	}
}
