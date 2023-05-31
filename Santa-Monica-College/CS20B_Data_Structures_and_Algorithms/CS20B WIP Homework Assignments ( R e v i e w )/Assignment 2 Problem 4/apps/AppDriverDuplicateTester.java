package apps;

import stacks.LinkedStack;

public class AppDriverDuplicateTester {

	public static void main(String[] args){

		//Create stack with many duplicate entries
		LinkedStack<String> aStack = new LinkedStack<String>();
		aStack.push("??");
		aStack.push("C");
		aStack.push("??");
		aStack.push("D");
		aStack.push("B");

//		boolean result = LLStackDuplicateTestClass.hasStringDupes(aStack.top);
		boolean result = LLStackDuplicateTestAltClass.detectDuplicates(aStack);
		if (result==true){
			System.out.println("This stack has duplicate string values");		
		}
		else
			System.out.println("No duplicates strings found");
	}


}
