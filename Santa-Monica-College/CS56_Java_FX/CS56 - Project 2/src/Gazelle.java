
public class Gazelle extends Animal {

	private Gazelle(){
		this.setSpecies("gazelle");	//sets species for animal
	}

	public Gazelle(String name) {
		this();
		this.setName(name);
	}	

	@Override
	public int getFeedingInstructions() {
//		System.out.print("Each gazelles will require $30 of grass feed.");
		return 30;
	}

	@Override
	public void feed() {
		if(this.getCurrentZoo().getBudget()>30)
			this.getCurrentZoo().setBudget(this.getCurrentZoo().getBudget()-30);
	}
}