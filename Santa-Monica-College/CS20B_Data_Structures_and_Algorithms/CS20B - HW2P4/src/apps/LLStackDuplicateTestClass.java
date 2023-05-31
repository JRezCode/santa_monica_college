package apps;

import java.util.ArrayList;

import stacks.LinkedStack;

import linkedlist.LLNode;

public class LLStackDuplicateTestClass {
					
	public static void main(String[] args){

		//Create stack with many duplicate entries
		LinkedStack<String> aStack = new LinkedStack<String>();
		aStack.push("top: A");
		aStack.push("BC");
		aStack.push("BE");
		aStack.push("BC");
		aStack.push("A");

		boolean result = hasStringDupes(aStack.top);
		if (result==true){
			System.out.println("This stack has duplicate string values");		
		}
		else
			System.out.println("No duplicates strings found");
	}

		//now to rearrange the stack so there are no duplicates
	
	public static boolean hasStringDupes(LLNode<String> listRef)
	{
		LLNode<String> currNode = listRef;
		ArrayList<String> collection = new ArrayList<String>();
		while(currNode!=null)
		{
			if(collection.contains(currNode.getInfo())){
				return true;
				}
			collection.add(currNode.getInfo());
			currNode=currNode.getLink();			
			}
		return false;
	}

	public static void printList(LLNode<String> head)  
    { 
        while (head != null)  
        { 
            System.out.print(head.getInfo() + " "); 
            head = head.getLink(); 
        } 
    } 

}