//consider to make this class abstract
public abstract class Animal implements Feedable{
	private String name;
	private String genus;
	private String species;
	private Zoo currentZoo;
	protected Animal enemy;
	private String prefferedBiome;

	//single no arg constructor =
	protected Animal() {
		//also initializes Crocodile's red biome to river
		if(this instanceof Crocodile)
			this.setPrefferedBiome("river");  			
	}


	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getGenus() {
		return genus;
	}
	public void setGenus(String genus) {
		this.genus = genus;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public Zoo getCurrentZoo() {
		return currentZoo;
	}
	public void setCurrentZoo(Zoo currentZoo) {
		this.currentZoo = currentZoo;
	}
	
	public Animal getEnemy() {
		return this.enemy;
	}

	//setEnemy is overriden in the Zebra subclass as expected
	public void setEnemy() {
		this.enemy=null;
	}
	
	public String getPrefferedBiome() {
		return prefferedBiome;
	}
	public void setPrefferedBiome(String prefferedBiome) {
		this.prefferedBiome = prefferedBiome;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if (obj == null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;		//create a Animal and case object to it
		if (!name.equals(other.name))
			return false;
		if (!species.equals(other.species))
			return false;
		return true;
		}

	@Override
	public String toString() {
		return "\nANIMAL\nGenus=" + genus + ", Species=" + species + "\nName: " + name + ", "+ ", Residence: " + currentZoo
				+ ", Biome: " + prefferedBiome +"\n\n";
	}	
	
}