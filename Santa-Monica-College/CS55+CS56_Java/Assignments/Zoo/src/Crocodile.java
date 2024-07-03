public class Crocodile extends Animal {

	//constructor
	private Crocodile() {
		this.setSpecies("crocodile");
	}
	
	public Crocodile(String name) {
		this();
		this.setName(name);
	}
	
	@Override
	public int getFeedingInstructions() {
//		System.out.print("Each crocodile will require $40 of meat.");
		return 40;
	}

	@Override
	public void feed() {
		if(this.getCurrentZoo().getBudget()>40)
			this.getCurrentZoo().setBudget(this.getCurrentZoo().getBudget()-40);
	}

	//The singleton design pattern is needed to make a single instance
	//of a crocodile that will be the enemy for all Zebras in the zoo.
	private static class CrocodileSingleton{
		private static final Crocodile INSTANCE = new Crocodile();
	}
	
	public static Crocodile getInstance() {
		return CrocodileSingleton.INSTANCE;
	}

}
