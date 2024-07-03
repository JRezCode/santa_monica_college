package MyStore;
//import ShoppingCart.Customer.Item;

/*
 * 
 * public class DynamicBindingDemo {
  public static void main(String[] args) {
	Object o = new GraduateStudent(); // implicit casting
	
	Object o1 = new Object();
	
	if (o1 instanceof GraduateStudent) {
	  System.out.println("Never got here");
	  GraduateStudent gs = (GraduateStudent)o1; // explicit casting
	}
	
    m(o);
    m(new Student());
    m(new Person());
    m(new Object());
  }

  public static void m(Object x) {
    System.out.println(x.toString());
  }
}

class GraduateStudent extends Student {
}

class Student extends Person {
  public String toString() {
    return "Student";
  }
}

class Person extends Object {
  public String toString() {
    return "Person";
  }
}

 * 
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;


public class Store {
	
	protected static int custCount = 0;		//variable for tracking # of transactions
	protected static ArrayList<Item> cart;		//cart is reference to arraylist
	
	public static void main(String[] args) {	
		
		//the cart 
		cart = new ArrayList<Item>();
		Scanner input = new Scanner(System.in);			//A scanner for user input

		//A welcome message
		System.out.println("Welcome to store. (continue)");		

		//this while loop for processing customers (more)
		while(true){
			custCount++;		//increases transaction count each time
			System.out.print("\n\nCustomer Counter: " + custCount + "\nEnter a name for " +
					"this customer: ");
			
			//enter name
			String name = input.next();		
			//automatically assigned ID using the customer class to store it
			Customer cust = new Customer((int)(Math.random()*((99999-10000)+1))+10000); 
			System.out.println(cust);

			System.out.println("You may now use this console to assist " + name + ".");	

			//NOTE: the boolean variable below tracks a session of the cart for a single customer 
			//until checkout is reached when it becomes false so that a new customer can be assigned
			//to the interface of shopping (recall while loop allows multiple customers)
			boolean shopping = true;					
			while(shopping==true) {		
				System.out.println("Select from the following:\n1)Fill cart (add)\n2)Edit cart(remove)\n3)View cart\n4)Proceed to checkout");
				//user input for menu choice
				int select = input.nextInt();			
				switch(select) 
				{
				case(1):		//add item case
					System.out.print("Case1 - Which item would you like to add?  [B]ook, [M]ovie or C[D]?");
					addItem(cart, input.next().toUpperCase().charAt(0));	
					break;

				case(2):		//remove item case
					System.out.print("Case2 - In order to remove an item you will need to specify which type of item [M\\B\\C]");
					removeItem(cart, input.next().toUpperCase().charAt(0));
					break;
				
				case(3):		//view cart case
					System.out.println("Case3 - The cart contains the following list of items given here"); 
					displayCart(cart);
					break;
				
				case(4):			//checkout case
					System.out.print("Case4 - The total cost of cart is: $" + getTotal(cart) + ".  \nREMINDER: Thank you please have a nice day!\n");
					//at checkout boolean value switches to terminate inner while loop
					cart.clear();
					shopping=false;	
				}	}

			//query the user for a new customer or quit
			System.out.println("Would you like to assist another customer or quit? (press any to continue, or q to quit)");
			char sel = input.next().charAt(0);
			if(sel!='q'){ continue; }	//will begin at top if anything other than 'q' is selected
			else { System.out.println("Thank you for choosing to use the system.  You completed orders for " + custCount + " customers."); System.exit(0); }
			input.close();
		}	
	}
	
	//getTotal returns the total dollar amount of items in the Arraylist cart (parameter)
	public static float getTotal(ArrayList<Item> cart){
		//initialize the return var
		float total=0;
		//traverse the cart and keep running total
		for(int i = 0; i<cart.size(); i++) {
			total+=cart.get(i).getPrice();			
		}
		return total;
	}
	

	//displayCart returns void accepting cart Arraylist as parameter
	//each item is printed to the console with detail.
	public static void displayCart(ArrayList<Item> cart){
		//check if the cart is empty for different message
		if(!cart.isEmpty()){
			//traverse the items in the cart and display 
			for(int i = 0; i<cart.size();i++){
				System.out.println(cart.get(i));
				}
			}
		else
			System.out.print("Your cart is empty.......".toUpperCase());
		}

	//addItem returns void while accepting two args a letter/character for the type of item
	//and the cart reference...the letter is assumed to be either M,B,C or some other default case.
	public static void addItem(ArrayList<Item> cart,char i) {
		switch(i) {
		case('M'): cart.add(new Movie()); break;
		case('D'): cart.add(new CD()); break;
		case('B'): cart.add(new Book()); break;
		}
		//message shows the last item added to the cart
		System.out.println("You have added, " + cart.get(cart.size()-1));		
	}
	
	//removeItem is a void method that accepts the character and shopping cart to remove an
	//item that is either movie, book or cd. A scanner object is used to validate and verify
	//the item to be removed.
	public static void removeItem(ArrayList<Item> cart,char i) {	
		Scanner confirm = new Scanner (System.in);

		//traverse list getting class names of objects and checking it against the #2 args
		for(int j = 0; j<cart.size(); j++) {
			char itemType = cart.get(j).getClass().getSimpleName().charAt(0);
			if(itemType==i) {
				System.out.println("Item to be removed: " + cart.get(j));

				//Now verify with input validation request
				System.out.println("Please confirm this is the item you would like to remove? (press y/n)");
				if(confirm.next().toLowerCase().charAt(0)=='y') {
					cart.remove(j);
					break;
					}
				else {
					continue;
					}
				}
			//specifying if no item is to be removed
			else { 
				System.out.println("Could not remove any item from the cart! Please select again.");				
			}
			}
		confirm.close();
		} 
	}


class Customer {
	protected String id;		//customer ID
			
	//2 constructors for customer provided (for ID using int or String)
	public Customer(int args) {
		this.id = Integer.toString(args);
	}

	public Customer(String args) {		
		this.id = args;
	}

	public String toString() {
		return "Customer object created, with ID#" + this.id;
	}
}

abstract class Item {
	protected String name;			//all items have these 5 variables
	protected String description;
	protected String type;
	protected float price;
	protected String prodID;
	
	//Constructor assigns the product ID
	public Item(int args) {
		this.prodID = Integer.toString(args);
	}

	//Setters for name and description and price
	public void setName(String nm) {
		this.name=nm;
	}

	public void setDesc(String desc) {
		this.description=desc;
	}

	
	public void setPrice(float p){
		//TODO need to work out the rounding of two decimal places here for accuracy
		this.price=p;
	}
	
	//Getter for price, and toString method
	public float getPrice(){
		return this.price;
	}
	
	@Override
	public String toString(){
		return "Item with product ID " + prodID + " and price $" + price;
	}
	
/*	@Override
 * public boolean equals(Object other) {
		if (other == null){
			return false;
		}		
		if (this.getClass() != other.getClass())
		{
			return false;
		}
		if (this.prodID != ((Item)other).prodID)
		{
			return false;
		}
		return true;
	} */
}	

class Book extends Item {
	private int pageCount;
	public Book() {
		super((int)(Math.random()*((999999-100000)+1))+100000);
		super.setName("Title");
		super.setDesc("Book Item");		
		super.setPrice(15);
		this.pageCount=(int)(Math.random()*(999-100+1)+100);
		if(Math.random()<0.25) {
			this.type="Hardcover";
		}
		else {
		this.type="Paperback";
		}
	}	

	@Override
	public String toString() {
		return "$" + this.getPrice() + " " + type + ", " + this.pageCount + " pgs  (Product ID#" + this.prodID + ")";		
	}
	
}
	
class Movie extends Item {
//	private String type;		//type Blu-ray, HD or VHS
	
	public Movie() {
		super((int)(Math.random()*((999999-100000)+1))+100000);
		super.setName("Title");
		super.setDesc("Movie Item");
		if(Math.random()<0.5){
			super.setPrice(40);
			this.type="HD Movie (DVD)";
		}
		else if (Math.random()>=0.9) {
			super.setPrice(45);
			this.type="Blu-ray Disc (DVD)";
		}
		else {
			super.setPrice(14);
			this.type="Tape (VHS)";
		}
	}

	@Override
	public String toString() {
		return "$" + this.getPrice() + " " + type + ", " + " (Product ID#" + this.prodID + ")";		
	}
	
	
}

class CD extends Item {	
	private int length;			//length of CD in minutes
	private int year;		//year of CD release
//	private String type;		//further classification of music genre

	public CD(){
		super((int)(Math.random()*((999999-100000)+1))+100000);
		super.setName("Title");
		super.setDesc("Music CD Item");
		super.setPrice(10);
		this.length=(int)(Math.random()*((90-30))+30);
		this.year=(int)(Math.random()*(100)+1919);
		this.type="Audio CD";
	}
	
	@Override
	public String toString() {
		return "$" + this.getPrice() + " " + type + ", " + this.length + " minutes, with release date of " + year + "(Product ID#" + this.prodID + ")";		
	}
	

}
