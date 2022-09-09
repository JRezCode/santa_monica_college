import ShoppingCart.Customer.Item;

class Store {
		private ShoppingCart[] cartArray;
		System.out.println(cartArray);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name and the system will auto-assign an ID for your cart");

		boolean shopping = true;
		while(shopping==true) {
			//Check the current time and every 10 seconds to let in another new customer
			//Eg.  if(System.time.seconds.endsWith(10s)) newCustomer
			getArray();
			getAction();
			setArrayMethod1();
			setArrayMethod2();
			setArrayMethod3();
		}
				
		System.out.println("Now to fill that cart with items: ");
		
	}
}
class Customer {
	
}

class ShoppingCart {
	private cartID;
	
	public ShoppingCart() {
		System.out.println("This shopping cart is now prepared for a customer of the store.");
	}

	public static void main(String[] args) {
		assignCustomerID();
	}
	}
	
	public static void setCustomerArraySize(
}

class Employee {
	//The employee of a store has just one of three jobs: Checkout, Stocker, or a Greeter
	//Employees are there to guide the customer through the shopping process by asking them
	//what they would like, and helping them to find it, before getting them processed for
	//purchases and also greeting them and seeing them out.
	//Some ways this could work...a greeter asks to see the customers shopping list...
	//points out the various Stockers who will be able to retreive items for the customer.
	//Once all items are accounted for the customer is told by the last stocker, "is that all?" Y, so "in that case please proceed to check"
	
}
class Customer {
	//In this example of a store, the customer is treated like sheep in a herd and must be
	//guided 100% of the time through the process.  The basic difference between customers
	//entering the store are their shopping lists, which must also take into account what if
	//the store doesn't have some of that stuff.	
	public String customerID;
	
	public Customer() {
		
	}

	
	public static String customerAction() {
		if(Math.random()<.8) {
			System.out.println("A customer has left without buying anything");
			else return newCustomer();
		}
}

class ShoppingList {
	//A shopping list allows people to know ahead of time what items they will be purchasing.
	//And when at the store they will fill a shopping cart with these items.
	//At the end of shopping all items (i.e. not in the cart) are still there for the customer.
	//The store may take a different view of the customer's shopping list which is due to not knowing what each customer has
	//written in their shopping list, so would have to ask customers how they are finding things...
	//In this case a good procedure to include would be to have a store employee asking customers, and then
	//have the customers ask about a specific item, book or movie.  From there the employee may say "yes we have it" or "no we do not carry it".
	//That would make the job of finding the items in the shopping list more efficient and easier on everyone.
	//In the case that a store employee is involved then that gets very complicated.
	
}

class ShoppingCart {
//A shopping cart is a store fixture that assists people in their shopping
	private String cartID;

	public ShoppingCart() {
		
	}
	public void setCartID(int id) {
		cartID = id;
	}
}

class Item {
	private String name;
	private String description;
	private float price;
	

}
class Book extends Item {
	private int pageCount;
	private String publisher;
	private String genre;
	
}
class Movie {
	
	
}
class CD {
	
}