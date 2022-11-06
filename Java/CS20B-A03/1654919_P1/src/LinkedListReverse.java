public class LinkedListReverse 
{
	
	// Prints the contents of the listRef linked list to standard output
	// in reverse order recursively
	static void recRevPrintList(LLNode<String> listRef)
	{
		//checks for an empty list
		if (listRef != null)
		{
			//the recursive call
			recRevPrintList(listRef.getLink());
			System.out.println(listRef.getInfo());
			}
		}

	
	static void iterRevPrintList(LLNode<String> listRef)
	{
		//checks for empty list
		if(listRef != null){		

			//3 pointers
			LLNode<String> prev = null; 
			LLNode<String> current = listRef; 
			LLNode<String> next; 
			
			//Links are reversed for the list
			while (current != null) { 
				next = current.getLink(); 
				current.setLink(prev); 
				prev = current; 
				current = next; 
				} 		

			//helper function call to print it
			printList(prev);
			}	
		}
	
	// Prints contents of a linked list simply
	static void printList(LLNode<String> listRef)
	{
		while(listRef != null){
			System.out.println(listRef.getInfo());
			listRef=listRef.getLink();
			}
		} 
		
			
	public static void main(String[] args)
	{
	System.out.println("\n\nTesting empty list:");
	LLNode<String> emptyList = null;
	System.out.println("\n  recursive print: "); 
	recRevPrintList(emptyList);
	System.out.println("\n  iterative print: "); 
	iterRevPrintList(emptyList);
	System.out.println("\n\nTesting list with: alpha:");
	LLNode<String> temp1;
	temp1 = new LLNode<String>("alpha");
	LLNode<String> singletonList = temp1;
	System.out.println("\n  recursive print: "); 
	recRevPrintList(singletonList);
	System.out.println("\n  iterative print: "); 
	iterRevPrintList(singletonList);
	System.out.println("\n\nTesting list with: alpha, beta, comma, delta, emma:");
	LLNode<String> temp2, temp3, temp4, temp5;
	temp1 = new LLNode<String>("alpha");
	temp2 = new LLNode<String>("beta");
	temp3 = new LLNode<String>("comma");
	temp4 = new LLNode<String>("delta");
	temp5 = new LLNode<String>("emma");
	LLNode<String> multiList = temp1;
	temp1.setLink(temp2);
	temp2.setLink(temp3);
	temp3.setLink(temp4);
	temp4.setLink(temp5);
	System.out.println("\n  recursive print: "); 
	recRevPrintList(multiList);
	System.out.println("\n  iterative print: "); 
	iterRevPrintList(multiList);
	}
}