package apps;
import stacks.*;

public class LLStackDuplicateTestAltClass {

	protected static LinkedStack<String> tempA = new LinkedStack<String>();	
	protected LinkedStack<String> tempB = new LinkedStack<String>();	

	public static void main(String[] args)
	{
	LinkedStack<String> bStack = new LinkedStack<String>();	
	bStack.push("top: A");
	bStack.push("E");
	bStack.push("D");
	bStack.push("B");
	bStack.push("C");
	bStack.push("A");
	System.out.println("Now to do another test using stack only operations on items in the stack");		
	System.out.println(detectDuplicates(bStack));
	}
	
	public static boolean detectDuplicates(LinkedStack<String> ls){

		//start by getting a count of the items in the linked list stack
		int count=0;
		while(!ls.isEmpty()){
			//shuffle stacks creating a reverse order incidentally that will need to be undone
			//can it be done without adding to a collection, probably yes, but how? with array
			tempA.push(ls.top());
			ls.pop();			
			count++;
			}
		
		ls = tempA; //note that the stack has actually been reversed at this point
		
		//create a local array same size as the stack for checking
		String[] comparison = new String[count];
		
		//now because there are 2 copies of the stack one can be used however we want
		int i = 0;
		while(!tempA.isEmpty())  //double check this isn't working on both stacks due to object reference
		{
			//another way to write maybe with int j = i, j>0, j--
			for(int j = 0; j<i; j++)
			{
				if(tempA.top()==comparison[j])
				{
					return true;
				}
				else 
				{
					comparison[i] = tempA.top();
				}
				}
			tempA.pop();
			i++;
			}	
		
		//code to print out the N unique values of the array
		for (int c = 0; c<comparison.length; c++)
			System.out.println(comparison[c]);
		//and returning false
		return false;
	}
}



/*public
	for(int b = 0; b<locations2.length;b++) {
		System.out.println(locations2[b]);		
	}

	System.out.println(testDuplicates(locations2));		

	/*
	String[] locations = new String[5];
	System.out.println(locations.length);

	int i = 0;
	while(!aStack.isEmpty()){
		locations[i]=aStack.top().toString();
		aStacktemp.push(aStack.top());
		aStack.pop();
		i++;
	}
	aStack = aStacktemp;
	
	for(int b = 0; b<locations.length;b++) {
		System.out.println(locations[b]);		
	}

	System.out.println(testDuplicates(locations));		

	//now to clear both the stack
	while(!aStack.isEmpty())
		aStack.pop();
	while (!aStacktemp.isEmpty())
		aStacktemp.pop();
	
		System.out.println("The temp stack has been cleared: "+aStacktemp.isEmpty());
	LinkedListStack<String> bStack = new LinkedListStack<String>();

		*/
	
	/*	public static boolean testDuplicates(String[] l){
	boolean found = false;
	for(int i = 0; i<l.length;i++) {
		for(int j = i+1; j<l.length-i;j++){
			if(l[i].equals(l[j]))
				found = true;
			else
				continue;
		}
	}
	return found;
}		
	
*/	
/*	
	//helper function to get count or number of items in the stack
	public static Integer getCount(LinkedListStack<String> s) {
			int counter = 0;
			while(!s.isEmpty()){
				aStacktemp.push(s.top());
				s.pop();
				counter++;
			}
			//now has to rename reference to the temp Stack to actual stack
			s=aStacktemp;
			return counter;	 
			}
	



*/