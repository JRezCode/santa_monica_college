package testclasses;

public class PairOfDice {
	//Data members for the class
	public int face1;
	public int face2;


	//Empty Constructor for the class
	public PairOfDice() {
	}
		
	public static void main(String[] args){

		//With one pair of dice
		System.out.println("\nBegin with the fair dice roll...");
		PairOfDice aPair = new PairOfDice();
		aPair.roll();
		System.out.println("Roll #1:\t"+aPair);
		aPair.roll();
		System.out.println("Roll #2:\t"+aPair);
		aPair.roll();
		System.out.println("Roll #3:\t"+aPair);


		//Now with two weighted or bias pair of dice
		System.out.println("\nNext the biased pair rolls...");
		PairOfDice biasPair = new BiasedDice();
		for(int i = 0; i<10; i++){
			biasPair.roll();
			System.out.println("Roll #" +i+ ":\t"+biasPair);
		}

		System.out.println("\nThere should be a noticeable difference between fair and biased.");
		
	}

	//Static method that accepts the object of class PairOfDice, and acts as a setter for face1 and face2
	public void roll() {
		face1=(int)(Math.random()*(6))+1;
		face2=(int)(Math.random()*(6))+1;
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


class BiasedDice extends PairOfDice {
	//Insert code for biased die which can be used by creating a constructor for it in the main
	//method of PairOfDice class.

	@Override
	public void roll() {
		face1=(int)(Math.random()*(3))+1;
		face2=(int)(Math.random()*(3))+1;
	}

}
