public class ArrayPair<T> implements PairInterface<T> {

	//the pair in form of array of SIZE
	protected final int SIZE = 2;
	private T[] aPair = (T[]) new Object[SIZE];
	
	//A constructor to fill array, with generic type
	public ArrayPair(T first, T second) {
		aPair[0]=first;
		aPair[1]=second;
	}
	
	public static void main(String[] args){
		//test cases or driver code here
		PairInterface myPair = new ArrayPair<String>("orange","peach");
		System.out.println(myPair.getFirst() + " " + myPair.getSecond());

		//change the second array index 1
		myPair.setSecond("orange");
		System.out.println(myPair.getFirst() + " " + myPair.getSecond());

	}
	
	//methods are same signature for same interface, but array[] format for accessing the values
	public void setFirst(T o){
		this.aPair[0]=o;
	}
	
	public void setSecond(T o){
		this.aPair[1]=o;
	}
		
	public T getFirst(){
		return this.aPair[0];
	}
	
	
	public T getSecond(){
		return this.aPair[1];
	}

}