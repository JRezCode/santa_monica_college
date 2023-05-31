public class LinkedListClientApp {

	public static void main(String[] args){
		
		LLNode<String> letters = new LLNode<String>("B");
		LLNode<String> newNode1 = new LLNode<String>("C");
		LLNode<String> newNode2 = new LLNode<String>("D");
		letters.setLink(newNode1);
		newNode1.setLink(newNode2);
		
		//Traversal of linked list
		LLNode<String> currNode = letters;		
		while(currNode!=null){
			System.out.println(currNode.getData());
			currNode=currNode.getLink();
		}
							
	}
}
