package practice;
import java.util.HashSet;

public class Gem {

	//0. Create enumeration type Color with three possible values: GREEN, RED and BLUE
	
	//1. Create a variable here to contain a color of the Gem
	protected float weight;
	protected float size;
	
	//2. Create a constructor to create Gem objects
	
	
	//3. Create a toString() method that will print all the properties of the gem

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + Float.floatToIntBits(size);
		result = prime * result + Float.floatToIntBits(weight);
		return result;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gem other = (Gem) obj;
		if (Float.floatToIntBits(size) != Float.floatToIntBits(other.size))
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		//Instructions
		//4. Initialize Java's HashSet containing Gem types
		
		//5. Create Gem object g1 with size 3, weight 2, and Gem Color red
		
		//6. Add g1 to the HashSet
		
		//7. Create Gem object g2 with size 3, weight 2, and Gem Color green
		
		
		//8. Add g2 to the HashSet
		
		
		//9. Check if g1 and g2 are equal
		
		
		//10. Print g1's hashCode
		
		
		//11. Print g2's hashCode
		
		
		//12. Print the content of HashSet. How many objects would you expect to see in your HashSet given that HashSets 
		//don't contain duplicates, and given your equals function. How many do you actually have? Fix this.
		
		
	}
	
	
}
