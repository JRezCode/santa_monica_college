public class Zebra extends Animal {

	private Zebra(){
		this.setSpecies("zebra");		
	}
	public Zebra(String name) {
		this();						//call the private constructor
		this.setName(name);			
	}

	public int getFeedingInstructions() {
//		System.out.print("Each zebra will require $40 of vegetables to feed.");
		return 40;
	}

	public void feed() {
		if(this.getCurrentZoo().getBudget()>40)
			this.getCurrentZoo().setBudget(this.getCurrentZoo().getBudget()-40);
	}
	
	@Override
	public void setEnemy() {
		//Zebra's enemy is a Crocodile using the Singleton pattern
		this.enemy=Crocodile.getInstance();
	}

	
}
