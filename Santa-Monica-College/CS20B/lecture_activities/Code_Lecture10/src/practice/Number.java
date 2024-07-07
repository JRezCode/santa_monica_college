package practice;


/**
 * This exercise demonstrates the issues with clustering when generating hashcode inefficiently. In case
 * our data contains some patterns, those patterns can break our hashmap mechanism of efficiently retrieving 
 * values (due to the introduced clustering)
 * @author irma
 *
 */
public class Number {
	
	int number;
	
	public Number(int n) {
		this.number = n;
	}

	@Override
	public int hashCode() {
		return this.number % 4; //INSTRUCTION: change this number to some primes
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Number other = (Number) obj;
		if (number != other.number)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		//Create all numbers divisible by 10 -> there is a pattern
		Number n1 = new Number(10);
		Number n2 = new Number(20);
		Number n3 = new Number(30);
		Number n4 = new Number(40);
		
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		System.out.println(n3.hashCode());
		System.out.println(n4.hashCode());
	}
	
	

}
