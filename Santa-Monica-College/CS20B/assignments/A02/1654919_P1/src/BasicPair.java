public class BasicPair<T> implements PairInterface<T> {
	//these form the pair
	private T first;
	private T second;

	//a useful constructor
	public BasicPair(T first, T second){
		this.first=first;
		this.second=second;
	}

	public static void main(String[] args){
		//driver test case application here
		
		//make a pair of mango and peach
		PairInterface myPair = new BasicPair<String>("mango","peach");
		System.out.println(myPair.getFirst() + " " + myPair.getSecond());
		
		//change peach to orange
		myPair.setSecond("orange");

		System.out.println(myPair.getFirst() + " " + myPair.getSecond());
	}
	
	//setters and getters for objects in this class are according to interface
	public void setFirst(T first){
		this.first=first;
	}
	
	public void setSecond(T second){
		this.second=second;
	}
	
	public T getFirst(){
		return first;
	}
	
	public T getSecond(){
		return second;
	}
}
	
