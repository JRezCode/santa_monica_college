package stack.apps;
import stack.more.ArrayBoundedStack;
import stack.complete.StackInterface;


public class ReverseStringApp {

	public ReverseStringApp() {
	}
	
		public static void main(String[] args){
			
		StackInterface<Character> reversedString = new ArrayBoundedStack<Character>();		

		String s1 = "abcdefghij";
		System.out.println(s1);
		for(int i = 0; i<s1.length(); i++){
			System.out.println(s1.charAt(i));
			reversedString.push(s1.charAt(i));
		}		
		
		System.out.println("The output of the reversed String is...");
		for(int i = 0; i<s1.length();i++){
		System.out.println(reversedString.top());
		reversedString.pop();
	}

}
}
