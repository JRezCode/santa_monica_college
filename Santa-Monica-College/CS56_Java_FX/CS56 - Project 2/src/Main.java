public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Zoo.  "
				+ "\nInstructions:  This program demonstrates the Zoo with custom exception handling "
				+ "\nfor WrongEnvironmentExcepts and EnemyEnclosureExcepts or InsufficientFundsExcepts "
				+ "\nas well like when trying place animals in the wrong biome, with wrong animals "
				+ "\nor feeding without money. \n\n\tEnjoy! \n\n");
		
		//Creating a new Zoo.
		Zoo laZoo = new Zoo("Los Angeles Zoo", "5333 Zoo Dr, Los Angeles, CA 90027", 133, 0);

		//Creating two different Enclosures.
		Enclosure firstEnclosure = new Enclosure("savanna");
		Enclosure secondEnclosure = new Enclosure("river");


		//Creating our animals.
		Animal zeb = new Zebra("Zebby");	
		Gazelle gaz = new Gazelle("Gaz");
		Crocodile croc = new Crocodile("Gena");
		Lion leo = new Lion("Leo");
				
		//Demonsrate toString and equals method for the Animals
		System.out.println("====Demonstrate string representation of animal====");
		System.out.println(croc);
		
		System.out.println("===Test of equals method====");
		System.out.println("This should be False: " + zeb.equals(new Zebra("Zabra")));
		System.out.println("This should be True: " + zeb.equals(new Zebra("Zebby")));
		
		
		
		System.out.println("\n=======Testing Exceptions Handling/Errors=======");
		//Trying to add croc to the firstEnclosure, but Crocodiles can't live in the Savannah, so it prints an error message.
		firstEnclosure.addAnimal(croc);
	
		//Adding leo to the first enclosure.
		firstEnclosure.addAnimal(leo);
	
		//Print the enclosure to show only lion was added so far
		System.out.println(firstEnclosure);
		
		//Adding croc to the second enclosure.
		secondEnclosure.addAnimal(croc);
		
		//Trying to add zeb to the secondEnclosure, but Crocodiles and Zebras are enemies, so it prints an error message.
		secondEnclosure.addAnimal(zeb);
		System.out.println(secondEnclosure);
		
		System.out.println("\n=======TESTING ENCLOSURE AND ZOO=============.");
		//Creating a new enclosure just for the herbivores.
		Enclosure thirdEnclosure = new Enclosure("Savanna");

		//Adding zeb and gaz to the third enclosure.
		thirdEnclosure.addAnimal(zeb);
		thirdEnclosure.addAnimal(gaz);
		
		//Add a bunch more gazelle and lion to the enclosure
		Gazelle gaz1 = new Gazelle("Gazelle1");
		Gazelle gaz2 = new Gazelle("Gazelle2");
		Gazelle gaz3 = new Gazelle("Gazelle3");
		Gazelle gaz4 = new Gazelle("Gazelle4");
		Gazelle gaz5 = new Gazelle("Gazelle5");
		Gazelle gaz6 = new Gazelle("Gazelle6");
		Gazelle gaz7 = new Gazelle("Gazelle7");
		thirdEnclosure.addAnimal(gaz1);
		thirdEnclosure.addAnimal(gaz2);
		thirdEnclosure.addAnimal(gaz3);
		thirdEnclosure.addAnimal(gaz4);
		thirdEnclosure.addAnimal(gaz5);
		thirdEnclosure.addAnimal(gaz6);
		thirdEnclosure.addAnimal(gaz7);
		
		Lion leo1 = new Lion("Lion1");
		Lion leo2 = new Lion("Lion2");
		Lion leo3 = new Lion("Lion3");
		Lion leo4 = new Lion("Lion4");
		Lion leo5 = new Lion("Lion5");
		thirdEnclosure.addAnimal(leo1);
		thirdEnclosure.addAnimal(leo2);
		thirdEnclosure.addAnimal(leo3);
		thirdEnclosure.addAnimal(leo4);
		thirdEnclosure.addAnimal(leo5);
		
		//Adding all three enclosures to the zoo.
		laZoo.addEnclosure(firstEnclosure);
		laZoo.addEnclosure(secondEnclosure);
		laZoo.addEnclosure(thirdEnclosure);
		System.out.println("Adding the enclosures to the zoo (OK).");
		
		//Printing the Zoo:
		System.out.println("\n"+laZoo+"\n");
		
		//Getting the feeding instructions for all the animals:
		System.out.println("============FEEDING ANIMAL TESTS============");
		laZoo.getFeedingInstructions();
		System.out.println();
		
		//Feeding the animals:
		laZoo.feed();
		
		//However, an error message is printed because the Zoo doesn't have enough money to feed all the animals
		//so we add more money to the Zoo.
		
		laZoo.setBudget(9999);

		//Successfully feeding the animals!
		laZoo.feed();
	}
}