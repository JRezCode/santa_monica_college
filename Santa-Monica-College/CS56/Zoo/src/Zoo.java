import java.util.*;
public class Zoo {
	private String name;
	private String address; 
	private ArrayList<Enclosure> enclosures;
	private int area;
	private double budget;

	//Constructor for a zoo
	public Zoo(String name, String address, int area, double budget) {
		this.name=name;
		this.address=address;
		this.area=area;
		this.budget=budget;
		enclosures=new ArrayList<Enclosure>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Enclosure> getEnclosures() {
		return enclosures;
	}

	public void addEnclosure(Enclosure enclosure) {
		enclosures.add(enclosure);	//adds enclosure to list

		//sets property of this zoo for the animals inside
		for(Animal a: enclosure.getAnimals())
			a.setCurrentZoo(this);
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		//set budget is used to make changes +/- to the Zoo's funds amount
		if(budget>this.budget)
			System.out.println("\nYou've added "+ (budget - this.budget) +" dollars to the zoo");
		this.budget = budget;
	}

	public void getFeedingInstructions() {
		//nested loops access each animal in each enclosure
		for(Enclosure enc: enclosures)
			for(Animal an: enc.getAnimals())
				an.getFeedingInstructions();
	}

	@SuppressWarnings("serial")
	//another nested exceptions class for insufficient funds
	class InsufficientFundsException extends Exception{
		public InsufficientFundsException(String message) {
			super(message);
		}
	}	

	//the feed method feeds all the animal in the zoo
	public void feed() {
		boolean messageShown=false;		//variable used in out of funds message
		for(Enclosure enclosure: enclosures)
			for(Animal animal: enclosure.getAnimals())
				//inside second loop is a try/catch
				try {
					//feed the animal or else throws an exception
					if(this.getBudget()-animal.getFeedingInstructions()<=0)
						throw new InsufficientFundsException("Add $$ to the zoo");
					animal.feed();
				}
		catch(InsufficientFundsException ee) {
			if(messageShown==false)
			{System.out.println(ee.getMessage());}
			messageShown=true;		//the shown message is suppressed

			//uncomment line below to see why suppressing message is important
			//System.out.println(ee.getMessage());
		}

		if(this.getBudget()>0)
			System.out.println("\nCongratulations, you have successfully fed all the animals in the zoo.  Zoo's budget balance is: $" + this.getBudget());
	}

	@Override
	public String toString() {
		return "\n"+name + "(up to "+area+" enclosures)\n" + address+"\nCurrent Encloures:"+enclosures;
	}

}
