package apps;

import java.util.ArrayList;
import linkedlist.LLNode;

public class LLStackDuplicateTestClass {
					
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