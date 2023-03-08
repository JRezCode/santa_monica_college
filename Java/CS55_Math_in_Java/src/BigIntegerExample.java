import java.math.BigInteger;

//Adapted from the in-class example, which was meant to show the most basic properties
//of the class BigInteger.  With this class do some further research to determine
//further adaptation of projects with it.

public class BigIntegerExample {
	
	public static int max = 19;
	
	public static void main(String[] args) {
		//Initialize 3 integers
		int num = 1, total = 0;
		//Create 3 big integers
		BigInteger bigIn1, bigIn2, bigIn2b, bigIn2d, bigIn3, bigIn4, bigIn5, bigIn5b;
		BigInteger b = BigInteger.valueOf(max);
		bigIn1 = new BigInteger("1");
		bigIn2 = new BigInteger("2147483647");
		bigIn2b = new BigInteger ("-2147483647");
		bigIn2d = new BigInteger ("4294967295");
		bigIn3 = new BigInteger("0");
		bigIn4 = new BigInteger("0");
		bigIn5 = new BigInteger("0");
		bigIn5b = new BigInteger("1000000000000000000000");
		int maxValidate = 1;
		for (int j = 1; j <= max; j++) 
		{
			//The factorial equation using the BigInteger class
			total += j;
			bigIn1 = bigIn1.multiply(BigInteger.valueOf(j));
			
			//Another factorial equation requires initializing num as 1
//			if(i==max)
			num *= j;
			
			//Record the upper bound of the values used in ! or Sigma
			maxValidate = j;		
		}
		//A calculation to show the difference
		System.out.println("The static variable for the program factorial is: " + max);
		System.out.println("The algorithm max value for multiplier is: " + maxValidate);
		bigIn2b = bigIn2.multiply(BigInteger.valueOf(2));
		bigIn3 = bigIn1.divide(bigIn2);
		bigIn4 = bigIn1.remainder(bigIn2b);
		bigIn5 = bigIn4.subtract(BigInteger.valueOf(num));
		if(bigIn5.compareTo(bigIn2d)==1)
			bigIn5=bigIn5b;						

		System.out.println("Factorial (" + max+"!):" + bigIn1);

		System.out.println();
		System.out.println("Here are the facts about the first " + max + " integers as they are handled in Java computing");
		System.out.println();
		System.out.println("Sigma:" + total);
		System.out.println("Factorial (" + max+"!):" + bigIn1 +"\n");
		System.out.println("The factorial calculation using the Primitive data type/class (Integer) reports: "+num);

		System.out.println("Continuing to account for the differences...");
//		System.out.println("Which is roughly 1 / " + bigIn3 + " of " + bigIn1 +"\n");
	//	System.out.println("The maximum Integer (primitive) in Java is: " + Integer.MAX_VALUE + "\n");	
		System.out.println("After dividing " + max + "! by " + bigIn2b + " the remainder is " + bigIn4);
		System.out.println("The difference between the remainder and what integer class reports is: " + bigIn5);
		if(bigIn5.equals(bigIn3))
			System.out.println("The expected difference is accounted for!\n");
		else
			System.out.println("There remains still some unaccounted for\n\n");
		System.out.println("FYI the bitlength of these digits is: " + bigIn1.bitLength());
		System.out.println("Here is the length of this BigInteger in a byte array: " + bigIn1.toByteArray().length);
		System.out.println("The amount of the BigInteger class beyond the max for Integer class: " + (bigIn1.subtract(BigInteger.valueOf(2147483647))));
		System.out.println("Putting this in perspective here is the list of the first " + max + " factorials: ");
		
		int factorialList =b.intValue();
		for (int j=1;j<=factorialList;j++)
			System.out.println(factorials(BigInteger.valueOf(j)));
	}
	public static BigInteger factorials(BigInteger b) {
		int ans=1;
		int num=b.intValue();
		if(num>11){
			for(int i=1;i<num;i++) {
					b=b.multiply(BigInteger.valueOf(i));
			}
			System.out.println("Using the BigInteger class:");
			return b;
		}
		else {
			for(int i=1;i<=num;i++)
				ans*=i;
			System.out.print("Using the primitive Integer class:");
			return BigInteger.valueOf(ans);
					}
		}
	}