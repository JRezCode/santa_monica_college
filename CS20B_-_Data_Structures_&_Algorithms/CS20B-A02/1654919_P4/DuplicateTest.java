
public class DuplicateTest {

	protected static LinkedListStack<String> aStacktemp = new LinkedListStack<String>();		

	class testDuplicates {
		/*		if(detectDuplicates(aStack))
		System.out.println("We've detected some duplicate data in this stack.");
				else
		System.out.print("The values in this stack are 100% unique"); */	
	}	
					
	public static void main(String[] args){
		LinkedListStack<String> aStack = new LinkedListStack<String>();
		aStack.push("top: A");
		aStack.push("B");
		aStack.push("B");
		aStack.push("B");
		aStack.push("A");
		System.out.println("So far this is a start with count of items in the stack");		
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

		//now to rearrange the stack so there are no duplicates
		bStack.push("top: A");
		bStack.push("E");
		bStack.push("D");
		bStack.push("C");
		bStack.push("B");
		bStack.push("A");
		System.out.println("Now for another test on unique items in the stack");		
		String[] locations2 = new String[6];
		System.out.println(locations2.length);

		i = 0;
		while(!bStack.isEmpty()){
			locations2[i]=bStack.top().toString();
			aStacktemp.push(bStack.top());
			bStack.pop();
			i++;
		}
		bStack = aStacktemp;
		
		for(int b = 0; b<locations2.length;b++) {
			System.out.println(locations2[b]);		
		}

		System.out.println(testDuplicates(locations2));		


		//without using Hashset, Collections, cloneable it is very challenging
		//initial thoughts are get a count and set up an array of the elements to
		//simply identify if duplicates exist at all, and this is relatively simpler
		//since there is no changes made to references of the stack, and also there
		//is no need to account for the actual stack operations other than for reading
		//from it with top() push() and pop()


	}
		
	public static boolean testDuplicates(String[] l){
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
		
		

	boolean detectDuplicates(LinkedListStack<String> s){
		//insert logic
		return false;
	}

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
	
	public static void printList(LLNode<String> head)  
    { 
        while (head != null)  
        { 
            System.out.print(head.getInfo() + " "); 
            head = head.getLink(); 
        } 
    } 

}

class LinkedListStack<T> implements StackInterface<T>
{
  protected LLNode<T> top;   // reference to the top of this stack

  public LinkedListStack()
  {
    top = null; //when newly created the top node is null
  }

  public void push(T element)
  // Places element at the top of this stack.
  { 
    LLNode<T> newNode = new LLNode<T>(element); //create a new node
    newNode.setLink(top); //set newNode to refer to the current top node
    top = newNode; //change the top mode to be the newly created node
  }     

  public void pop()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise removes top element from this stack.
  {                  
    if (isEmpty())
      throw new StackUnderflowException("Pop attempted on an empty stack.");
    else
      top = top.getLink(); //when an element is removed, we just move top to the next element
  }

  public T top()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise returns top element of this stack.
  {                 
    if (isEmpty())
      throw new StackUnderflowException("Top attempted on an empty stack.");
    else
      return top.getInfo();
  }

  public boolean isEmpty()
  // Returns true if this stack is empty, otherwise returns false.
  {              
    return (top == null); 
  }

  public boolean isFull()
  // Returns false - a linked stack is never full
  {              
      return false;
  }

}

class LLNode<T>
{
  protected LLNode<T> link;
  protected T info;
  
  public LLNode(T info)
  {
    this.info = info;
    link = null;
  }
  

  //getters and setters
  public void setInfo(T info){ this.info = info;}
  public T getInfo(){ return info; }
  public void setLink(LLNode<T> link){this.link = link;}
  public LLNode<T> getLink(){ return link;}
}
 


