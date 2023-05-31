
public class Lion extends Animal {
	
	//the class constructors include a no arg private constructor
	//and a public constructor with single String argument overload
	private Lion(){
		this.setSpecies("lion");		
	}
	
	//overloaded constructor
	public Lion(String name) {
		this();
		this.setName(name);
	}

	//methods for feed
	public int getFeedingInstructions() {
//		System.out.print("Each of the Lions will require $100 of meat.");
		return 100;
	}
	
	public void feed() {
		if(this.getCurrentZoo().getBudget()>100)
			this.getCurrentZoo().setBudget(this.getCurrentZoo().getBudget()-100);
	}
}
