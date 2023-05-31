import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Assignment 5(Final Project)
 * Name: Jonathan Reznik
 * ID: 1654919
 *
 * Description:
 *   This program uses OOP ideas (classes, instance methods, abstraction, and more) 
 *   for simulating a store.  The purpose is a little bit obscured by the layers of
 *   several menus to get into working with the cart objects and items.  However 
 *   it is really only a result of efforts to make an advanced interface, which
 *   could only be taken so far with customers and customer array until the 
 *   general concept of the shopping cart is maybe lost.
 *  
 *  Note:
 *   I attempted to make use of the overloaded method showCustArray as a way of planning
 *   ahead next time I would take some more time to build the simple parts of the interface
 *   before trying to add more functionality.  However these are the issues, which may exist
 *   and are mostly minor.  The one major issue is the problem of it being not intuititive.
 *   Errors I mostly handled but I really attempted to design a Sales System as much as
 *   possible.  To do this I came across some challenges.  I think it is a good project for
 *   continued efforts in the GUI class, which is started but is left unfinished.
 *
 *   Other maybe present issues: 
 *      1) Difficult to navigate and not intuitive interface (it could be worked on by a proper GUI)
 *      2) There are occassional bugs that will cause you to lose work
 *      3) When using the checkout or removing items it will removeItem is just the 1st in the cart (oops!)
*/
/**
 *
 * @author JR
 */
public class Store {   
    public static final int MAX_CAPACITY = 50;    
    static ShoppingCart[] carts;         //array of objects of type Shoppingcart
    static Customer[] customers;         //array of objects of type Customer
    
    //Declares and builds the arrays of objects it is called below in main method of Store class
    public static void createSampleStore(int countOf){
        carts = new ShoppingCart[countOf];
        for(int i = 0; i<carts.length; i++) {
            carts[i]= new ShoppingCart(i+10);
        }
        customers = new Customer[countOf];
        for(int i = 0; i<customers.length; i++) {
            customers[i] = new Customer(CustomerID.generate());
//            customers[i].assignCart();
        }

    }
      
    //Main method for Store.class is to operate the menu and control flow
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String custID;      //a new variable declaration that is used throughout for Customer ID input

        System.out.println("INSTRUCTIONS:");
        System.out.println("Welome to the sample store interface.  Using this system you can work with the provided customers and \n"+
                        "carts to help assist with Books, Music and DVDs purchases.  There is a capacity of shopping carts and \n" +
                        "customers that is set to 75 to accomodate the uses of a small outlet for these items.  Should you need \n" +
                        "increased system capacity to accomodate more carts or customers that must be done by a programmer.");
        createSampleStore(MAX_CAPACITY);
        
        //A loop for the main menu
        while(true) {
        System.out.println("\nSTORE MENU");
        System.out.print("(1) Assist Customers (e.g. add/remove items to cart)\n(2) View customer cart \n(3) Add more customers (is rarely needed)\n(4) Use checkout counter\n(5) Show all customers \n(6) Show active shopping carts \n(7) Shopping cart interface (preview...not functional)");    
        
        //The switch statement provides navigation each case relying on object and instant methods
        switch(input.next()) {
            case("7"):
                //Menu option for cart interface (TBD for later)
                System.out.println("\nCART TRACKER:");
                System.out.println("\n\nThis is just preview sample of an interface for carts (to add to later).");
                showCartArray(carts);
                //break statement is left out in order to proceed to the list of active shopping carts
            case("6"):
                //Menu option for the viewing only of filled shopping carts
                try {
                showCustArray(customers, "shopping", "cart"); }
                catch (Exception e ) {break;}
                break;
            case("5"):
                //
                showCustArray(customers);
                break;
            case("4"):
                showCustArray(customers, "line");
                try {
                System.out.println("Enter custID to checkout.");
                custID = input.next();
                Customer cu = assignToCustomer(customers, custID);
                cu.removeCart();
                customers[getCustomerIndex(customers, custID)] = new Customer(CustomerID.generate());
                System.out.println("A customer has exited the store following checkout.");
                showCustArray(customers);
                }
              catch (Exception e)
            {
                    break;}
                break;
            case("3"):
                System.out.println("STORE MENU: CUSTOMER ADD");
                int cust = getCustomerCount(customers);
                System.out.println("There are currently "+ cust + " shoppers in the store, and " + (carts.length - cust) + " carts available.");
                System.out.println("Would you like to add 1 additional customer? (y/n)");
                if(input.next().toUpperCase().matches("Y"))
                {
                    int i = getLastCustomerIndex(customers);
                    System.out.println("Press yes again to auto assign a unique id");                    
                    customers[i]= new Customer(CustomerID.generate());
                    //customers[i].assignCart();
                }
                break;
            case ("2"):
                try {
                System.out.println("Customer listing");
                showCustArray(customers,"with","carts");
                System.out.println("STORE MENU: PURCHASE TRACKER");
                System.out.println("Enter a Customer ID: ");
                custID = input.next();
                showCustArray(customers, custID);
//                showCustArray(customers, getCustomerIndex(customers, custID));                
                }
              catch (Exception e)
            {
                    break;}
                break;
            case("1"):
                System.out.println("\nSTORE MENU: CUSTOMER TRACKER");                
                showCustArray(customers,"with","CutsomerID's","only");
                System.out.println("Enter a Customer ID from above (must enter ALL 5 digits): ");
                System.out.println("(You may recall 75 customers have already been generated automatically.)");
                custID = input.next();                
                //user input is used to search the array of objects
                try { 
                Customer obj = assignToCustomer(customers, custID);                
                if(obj.getCart()==null) obj.assignCart();
                //ensures the selected customer has been assigned a cart
                System.out.println("This customer is using " + obj.getCustomerCartID());                
                System.out.println("\n\nSTORE MENU: CUSTOMER CART " + obj.getCustomerCartID().substring(4));
                ShoppingCart active = obj.getCart();
                System.out.println("(1) add/remove items\n(2) view items in the cart\n(3) return to last menu\nPlease make your selection?");
                switch(input.nextInt()) {
                    case(1):
                        boolean shopping = true;
                        do {
                            System.out.println("Which kind of item would you like to add? (b) Book, (m) Movie, or (c) CD?\n You can add prefix - to remove these items so, -b, -m, -c are valid as well");
                            System.out.println("Additionally since items are avaialable in discounted prices (books and cds only, no discounted movies for sale), use bD or cD  are also valid");
                            String type = input.next();
                        if(type.equals("b")) obj.getCart().addItem(new Book());
                        if(type.equals("m")) obj.getCart().addItem(new Movie());
                        if(type.equals("c")) obj.getCart().addItem(new CD());                   
                        if(type.equals("cD")) obj.getCart().addItem(new CD("dis"));                   
                        if(type.equals("bD")) obj.getCart().addItem(new Book("dis"));                   

                        //Use the override of toString method to show which items are available for removal by removeItem
                        if(type.equals("-b")) obj.getCart().removeItem();
                        if(type.equals("-m")) obj.getCart().removeItem();
                        if(type.equals("-c")) obj.getCart().removeItem();                   

                        showCustArray(customers, getCustomerIndex(customers,obj.getCustomerID()));
                        System.out.print("Would you like to (1) checkout, or (2) continue shopping");
                        if(input.nextInt()==1)
                            shopping=false;
                        } while (shopping);
                        System.out.println("Customer " + obj.getCustomerID() + ", " + obj.getName() + " is ready for check out, his total is " + obj.getCart().getTotalPurchaseAmount());
                        System.out.println("This means that the customer and cart should be made free afterwards.");
                        obj.removeCart();
                        customers[getCustomerIndex(customers,obj.getCustomerID())] = new Customer(CustomerID.generate());
                        break;                
                    case(2):
                        showCustArray(customers, getCustomerIndex(customers,obj.getCustomerID()));
                        break;
                    default:
                        break;
                }
                }
                catch (Exception e) 
                {
                    break;
                }
                default:
                StoreGUI.help();
        }  
        }
        //System.exit(0);                   

    }

    //Could make this method into a good GUI method for creating a window/frame with carts
    //as the carts are taken or in use then overlaying a graphical element such as a "X" to show them unavailable
    private static void showCartArray(ShoppingCart[] a) {
        //Convert to a GUI
        int r = a.length % 10;
        for (int i = 0; i < a.length/10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++)
                System.out.print(a[i*10+j].getCartID()+"\t");
        }
        for (int i = r; i > 0; i--) {
            System.out.print(a[a.length-i].getCartID()+"\t");
        }
        System.out.println();
    }
    
    
    private static void showCustomerLine(Customer[] a) {
        int lineCount = 1;
        System.out.println("Customers with carts form the line: ");
        for (int i =0; i<Store.customers.length; i++) {
            if(a[i].getCart()==null) continue;
            System.out.println("The order \"in line\" of customer " + a[i].getName() + " with ID " + a[i].getCustomerID() + " is " + lineCount++);
        }
    }

    //The following number of methods are all overloaded methods of varying similarity/difference
    //They do all accept at least the same single object array for references to object-type from Customer class
    
    //The most general method for showing customers
    private static void showCustArray(Customer[] a) {
        for (int i =0; i<Store.customers.length; i++) {
            if(a[i]==null) continue;
            System.out.print("SHOPPER #" + (i+1) + ":\n\t\t " + a[i].toString() + "\n");
//            System.out.print(", " + a[i].customerID);
        }
    }

    //An overvloaded method for customerArray to form a line or order listing of customer objects
    private static void showCustArray(Customer[] a, String id) {
        int index = getCustomerIndex(a, id);        
        for (int i =0; i<Store.customers.length; i++) {
            if(a[i].getCart()==null) continue;
        }
    }

    //Another overvloading of showCust to show the specific cart ID with the customer
    private static void showCustArray(Customer[] a, String m, String n) {
        int count = 0;
        for (int i =0; i<Store.customers.length; i++) {
            if(a[i].getCart()!=null) {
                count++;
                System.out.println("The pairing of customer " + a[i].getName() + " with ID " + a[i].getCustomerID() + " is with " + a[i].getCustomerCartID());                
            }
        }
        if(count == 0) {
            System.out.println("There are no customers assigned shopping carts at this time.");
        }
    }

    //Another overloaded method for customerArray for menu
    protected static void showCustArray(Customer[] a, String j, String k, String l) {
        //Convert to a GUI Maybe
        for (int i=1; i<=(Store.customers.length); i++) {
            //if(a[i]==null) continue;
            if(i%10!=0) {            
                System.out.print(a[i-1].getCustomerID()+",");
                continue;
            }
            else if(i==Store.customers.length) {
                System.out.println(a[i-1].getCustomerID() + ".");
            }
            else {
                System.out.println(a[i-1].getCustomerID() + ",");
            }
        }    
        System.out.println();
    }
    
    //A very useful way of accessing the carts of customers through the overloaded method
    private static void showCustArray(Customer[] a, int index) {
        System.out.println("You can now view the customer's cart summary informaton before returning to main menu");

        for(int i = 0; i<a[index].getCart().getItemCount(); i++) {
            System.out.println(a[index].getCart().items.get(i).toString());
        }
        System.out.println("The total count of items: " + a[index].getCart().getItemCount());
        System.out.println("The total price of items: $" + a[index].getCart().getTotalPurchaseAmount());
        
    }
//            System.out.println(cus.[index].toString());
//    }

    //This method is so that new customers do not replace existing customers in the array of customer objects
    private static int getLastCustomerIndex (Customer[] array) {
        for (int i = 0; i<Store.customers.length; i++) {
            if(array[i]==null)
                return i;
        }
        return Store.customers.length;
    }

//    private static String getCustomerID(Customer[] array, int i) {
  //      return array[i].getCustomerID();
    //}

    private static Customer assignToCustomer(Customer[] array, String id) {
        for (Customer array1 : array) {
            if (array1.getCustomerID().equals(id)) {
                return array1;
            }
        }
           return null;
    }
    
    private static int getLinePlacement(Customer[] a, Customer cust) {
        int lineCount = 1;
        System.out.println("Customers with carts form the line: ");
        for (int i =0; i<Store.customers.length; i++)
        {
            if(a[i].getCart()==null) continue;
            lineCount++;
            if(a[i]!=cust) {
            }
        }
     return lineCount;
        }   

    private static int getCustomerIndex(Customer[] array, String id) {
    //TODO Replace the method for get customer index with parameters array and object instead of array and string
        for(int i=0; i<array.length; i++) {
            if (array[i].getCustomerID().equals(id))
                return i;
        }
        return -1;
    }
    
    private static int getCustomerCount (Customer[] array) {
        int count = 0;
        for (Customer array1 : array) {
            if (array1 != null) {
                count++;
            } else {
            }
        }
        return count;
    }
}

abstract class Item {
    private String title;
    private String description;
    private double price;
//    private boolean inStock;
    
    //Generic constructor for the Item superclass that will provide for title and description
    //In future iterations of the program this protected constructor in the abstract class
    //would likely be overloaded to allow for entry of inventory beforehand.
    protected Item() {
        this.title = "TITLE HERE";
        this.description = "DESCRIPTION HERE.";
    }
    //The getters and setters for the superclass Item
    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;    
}
    public void setTitle(String t) {
        this.title = t;    
    }
    public void setDescription(String d) {
        this.description = d;    
    } 
    //The toString override for helpful output about the superclass Item
    @Override
    public String toString() {
        return "The parent class is of type Item";
    }
}    

class Book extends Item {
//    private int itemID;
    private String author = "Nero";
    private String genre = "Philosophy";    

    public Book() {
    super.setPrice(50);
    }
    public Book(String disc) {
    super.setPrice(11);
    }
    @Override
    public String toString() {
        return "$" + super.getPrice() + ", Book about " + genre + " by author, " + author;
    }

}

class Movie extends Item{
    private int length;
    private String title;
    
    public Movie() {
        super.setPrice(25.00);
        System.out.println("A movie for $" + super.getPrice());
    }
    @Override
    public String toString() {
        return "$" + super.getPrice() + ", " + super.getTitle() + ", " + super.getDescription();
    }
}

class CD extends Item{
    private int trackCount;
    private String artistName;
    private String genre;
    private boolean discount;

    public CD() {
        super.setPrice(10.99);
        System.out.println("You are adding a cd, with a purchase price of $" + super.getPrice());
    }
    public CD(String d) {
        this.discount = true;
        super.setPrice(1.99);
        System.out.println("You are adding a discount cd, with a purchase price of $" + super.getPrice());
    }
    
    @Override
    public String toString() {
        return "$" + super.getPrice() + ", music CD by artist, " + artistName;
    }
}

class Customer {
    private String customerID;
    private String fName;
    private String lName;
    private ShoppingCart cartObjectRef;          //a pointer to the index within array of shopping cart objects 

    public Customer() {
    }

    public Customer(String s) {
        this.customerID = s;
        this.fName = "Joe";
        this.lName = "Smith";
    }    

    public String getName() {
        return this.fName + " " + this.lName;
    }
    
    public String getCustomerID() {
        return this.customerID;
    }

    public String getCustomerCartID() {
        return this.cartObjectRef.toString();
    } 
    
    public ShoppingCart getCart() {
        return this.cartObjectRef;
    }

    public void removeCart() {
        this.cartObjectRef=null;
//        getCart().isNotInUse();
    }
    //a mutator method in the customer class to reference one of the shopping carts in store 
    public void assignCart() {
        for (ShoppingCart cart : Store.carts) {
            if (cart.isCartAvailable() == false) {
                this.cartObjectRef = cart;
                cart.isInUse();
                break;
            } else {
                System.out.println("There are no more shopping carts.");
            }
        }
        }

    @Override
    public String toString() {
        return fName + " " + lName + ", ID#" + customerID + ", " + cartObjectRef + ", ";
    }
}
    
class ShoppingCart {
    //A shopping cart is what assists people in their shopping
    private String cartID;
    private static int cartCount;
    private int itemCount;
    private boolean inUse;
    java.util.ArrayList<Item> items = new java.util.ArrayList<>();
    
    public ShoppingCart() {
    }
    public ShoppingCart(int cartCount) {
        this.cartID = "Cart" + cartCount;
        this.inUse = false;
        cartCount++;
    }
    public boolean isCartAvailable() {
        return this.inUse;
    }
    public void isNotInUse() {
        this.inUse=false;
    }
    public void isInUse() {
        this.inUse=true;
        //return this.inUse;
    }
    public String getCartID() {
        return this.cartID;
    }
    public void addItem(Item i) {
        items.add(i);
    }        

    public void removeItem() {
//        items.remove((int)Math.random()*this.itemCount);
        items.remove(0);
    }

    public int getItemCount() {       
        return items.size();
    }    

    public int getTotalPurchaseAmount() {
        int total = 0;
        for (int i = 0; i < items.size(); i++) {
            total+=items.get(i).getPrice();
        }
        return total;
    }
    @Override
    public String toString(){
       return (cartID);
    }


}