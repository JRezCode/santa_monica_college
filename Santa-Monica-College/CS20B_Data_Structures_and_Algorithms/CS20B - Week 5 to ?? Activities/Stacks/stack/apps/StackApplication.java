package stack.apps;
import stack.more.ArrayBoundedStack;
import stack.complete.StackInterface;;


public class StackApplication {
	public static void main(String[] args) {
		StackInterface<String> st = new ArrayBoundedStack<String>();
		st.push("A");
		st.push("B");
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
		st.pop();
		st.pop();
		
	}
}
