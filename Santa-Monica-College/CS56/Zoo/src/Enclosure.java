import java.util.*;

public class Enclosure {
	private String biome;
	private ArrayList<Animal> animals;

	//constructor
	public Enclosure(String biome) {
		this.biome=biome;
		animals= new ArrayList<Animal>();
	}

	//getters and setters for biome and animals
	public String getBiome() {
		return biome;
	}
	public void setBiome(String biome) {
		this.biome = biome;
	}
	public List<Animal> getAnimals() {		
		return animals;
	}

	//nested classes are included for exception handling purposes
	@SuppressWarnings("serial")
	class WrongEnvironmentException extends Exception{
		public WrongEnvironmentException(String message) {
			super(message);
		}
	}	
	@SuppressWarnings("serial")
	class EnemyEnclosureException extends Exception{
		public EnemyEnclosureException(String message) {
			super(message);
		}
	}

	public void checkBiome(String biome) throws WrongEnvironmentException {
		if(biome!=null && !biome.equalsIgnoreCase(this.getBiome())) {
			String message = "When trying to add animal to " + this.getBiome() + ", this is the incorrect biome for that animal.";
			throw new WrongEnvironmentException(message);
		}
	}

	public void addAnimal(Animal newAnimal)
	{
		newAnimal.setEnemy();  //setEnemy method is used now
		try{
			//Checks preferred biome
			this.checkBiome(newAnimal.getPrefferedBiome());

			//Now iterate and check if enemy of animal is in the enclosure
			for(Animal animal: animals)
			{
				if((animal instanceof Zebra && newAnimal instanceof Crocodile)||(animal instanceof Crocodile && newAnimal instanceof Zebra))
					throw new EnemyEnclosureException("Can't place " + newAnimal.getName() + " into the same enclosure as " + animal.getName()+".");
			}
			animals.add(newAnimal);		//safe to add the animal to container now
		}
		catch(WrongEnvironmentException|EnemyEnclosureException e)
		//catch clause for both custom exceptions
		{
			System.out.println(); e.printStackTrace();
			System.out.println();
		} 
	}


	@Override
	public String toString() {
		return "\nEnclosure [Biome:"+ biome + ", Animal count:" + (animals.size()+"]");
	}

}
