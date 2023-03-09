package problem2;

public class PairOfDice {
	//Data members for the class
	public int face1;
	public int face2;


	//Empty Constructor for the class
	public PairOfDice() {
	}
	
	
	public static void main(String[] args){
		PairOfDice aPair = new PairOfDice();
		roll(aPair);
		System.out.println("Roll 1 results..."+aPair);
		roll(aPair);
		System.out.println("Roll 2 results..."+aPair);
		roll(aPair);
		System.out.println("Roll 3 results..."+aPair);
	}

	//Static method that accepts the object of class PairOfDice, and acts as a setter for face1 and face2
	public static void roll(PairOfDice a) {
		a.face1=(int)(Math.random()*(6))+1;
		a.face2=(int)(Math.random()*(6))+1;
	}

	//Instance method to return the sum of both faces for a particular instance of a pair of die
	public int value() {
		return this.face1+this.face2;
	}

	//Overrided toString method that displays the faces and the sum after calling instance method for value()
	public String toString(){
		return " "+this.face1+" : "+this.face2+" = "+this.value();
	}
	
}

class BiasedDicePair {
	//Insert code for biased die which can be used by creating a constructor for it in the main
	//method of PairOfDice class.
}
