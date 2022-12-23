
public class SumMethods {

	//Main method
	public static void main(String[] args) {
	System.out.println("With linear complexity: " + sumLinearComplexity(100));	
	System.out.println("With complexity of bounded-time: " + sumBoundedTime(100));	
	}
	
	//This method accepts argument for the largest value and uses linear complexity to sum the values
	public static int sumLinearComplexity(int n) {
		int total = 0;
		for (int i = 0; i<=n;i++) {
			total+=i;
		}		
		return total;
	}
	
	//This method accepts the same argument of the largest value but uses a formula for O(1) complexity
	//or in other words bounded-time
	public static int sumBoundedTime(int n) {
		return n*(n+1)/2;
	}
	
}
