package support;

public class Test {
	
	public static int sumSquares1(LLNode<Integer> list) {
		if(list == null){
			return 0;
		}
		else
			return list.getInfo()*list.getInfo() + sumSquares1(list.getLink());
	}
	
	public static int sumSquares2(LLNode<Integer> list) {
		if(list.getLink() == null){
			return list.getInfo()*list.getInfo();
		}
		else
			return list.getInfo()*list.getInfo() + sumSquares2(list.getLink());
	}
	
	public static void main(String[] args) {
		LLNode<Integer> list = new LLNode<Integer>(5);
		LLNode<Integer> n2 = new LLNode<Integer>(2);
		LLNode<Integer> n3 = new LLNode<Integer>(3);
		LLNode<Integer> n4 = new LLNode<Integer>(1);
		//list.setLink(n2);
		//n2.setLink(n3);
		//n3.setLink(n4);
		
		System.out.println(sumSquares1(list));
		System.out.println(sumSquares2(list));
		
		
	}
}
