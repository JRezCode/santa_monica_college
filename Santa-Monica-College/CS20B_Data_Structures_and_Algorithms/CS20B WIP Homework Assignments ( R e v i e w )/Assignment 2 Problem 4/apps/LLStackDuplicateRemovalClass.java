package apps;

import java.util.ArrayList;
import java.util.Scanner;

import stacks.LinkedStack;
import linkedlist.LLNode;

public class LLStackDuplicateRemovalClass extends LLStackDuplicateTestClass {
					
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
			System.out.println("This stack has duplicate string values...ready to remove? [y]");		
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			if(sc.next().charAt(0)=='y')
			{
				removeStringDuplicate(aStack.top);				
			}
		}
		else
			System.out.println("No duplicates strings found");
				
		//Function called to traverse basically output each item on the stack
		popAll(aStack);
	}

	public static void popAll(LinkedStack<String> st){
		while(!st.isEmpty())
		{
			System.out.println(st.top());
			st.pop();
		}
	}
		//now to rearrange the stack so there are no duplicates
	
	public static void removeStringDuplicate(LLNode<String> listRef){
		while(hasStringDupes(listRef)){
			LLNode<String> currNode = listRef;
			LLNode<String> prevNode = null;
			ArrayList<String> collection = new ArrayList<String>();
			while(currNode!=null)
			{
				if(collection.contains(currNode.getInfo()))					
						prevNode.setLink(currNode.getLink());
				collection.add(currNode.getInfo());
				prevNode=currNode;
				currNode=currNode.getLink();
			}
			removeStringDuplicate(listRef);
		}
	}

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