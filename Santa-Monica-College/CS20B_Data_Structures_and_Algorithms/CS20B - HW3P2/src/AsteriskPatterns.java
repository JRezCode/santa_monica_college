public class AsteriskPatterns {

	public static void main(String[] Args)
	{
		//driver code goes here 
		printTriangleUp(1);
		printTriangleDn(1);

		System.out.println("Upward facing thing");
		printTriangleUp(5);
		
		System.out.println("Downward facing thing");
		printTriangleDn(5);
		
	}

	static void printTriangleDn(int n)
	{
		if(n>=1){
			for(int i = 0; i<n; i++)
			{System.out.print("*");}
			System.out.println();
			printTriangleDn(n-1);}
		else
		{
			System.out.println("");
		}
	}
	
	static void printTriangleUp(int n)
	{
		if(n==0)
			return;
		else{
			printTriangleUp(n-1);			
			for(int i = 0; i<n; i++)
				System.out.print("*");
			System.out.println();
			return;
		}
		}		
}
