package FinalStore;

import FinalStore.Customer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
 *
 * @author JR
 */
public abstract class Store {   
//    public static final int MAX_CAPACITY = 50;    
    public static java.util.ArrayList<ShoppingCart> carts = new java.util.ArrayList<>();

    //Main method for Store.class is to operate the menu and control flow
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String custID;      //a new variable declaration that is used throughout for Customer ID input
        System.out.println("Please enter the maximum number of customers your store will simulate...at the end you will see why this matters for viewing carts of each customer.");
        int maxCapac = input.nextInt();
        Customer[] customers = new Customer[maxCapac];             //array of objects should get null value

        while(true) {
        System.out.println("Menu:\n(1) Enter A New Customer (automated)\n(2) Help Customers \n(3) Quit");
        switch(input.nextInt()) {
            case(3):
                System.exit(0);
            case(1):
                System.out.println("Each new customer will be automatically tracked in a file according to their new customer ID");
                //Insert a check on file line count to see where to begin indexing for the array of new customers according to lines in file
                int i=getCustomerCount(customers);
                if(i==maxCapac) {
                    System.out.println("Your store has reached maximum capacity, assist to shop and checkout before attempting to enter more customers.");
                    break;
                }
                customers[i]=new Customer(CustomerID.generate());
//                customers[0].customerID = CustomerID.generate();
                System.out.println("Customer's First Name:");
                String name1=input.next();
                System.out.println("Customer's Last Name:");                
                String name2=input.next();
                customers[i].setName(name1, name2);
                System.out.println("Active Customer Count: " + getCustomerCount(customers));
                assignCartToCust(customers, i);

                //Next three lines doesn't work
//                System.out.println("Now enter any further information you would like to store about the customer:");
  //              String notes = input.nextLine();
    //            customers[0].storeInput = notes;             

                //Now write information to a file?
                break;
            case(2):
                do {
                System.out.println("Would you like to, (v)iew customers in store, (a)ssist a customer to shop, (c)heckout a customer, or (r) return to the previous menu");
                char selection = input.next().toLowerCase().charAt(0);
                if(selection=='v') {
                    System.out.println("Here are the customers in the store.");
                    showCustArray(customers);
                }
                else if(selection=='a') {
                    System.out.println("Which customer will you be assisting?\n If you need to return to the previous menu or you can " +
                            "\n once again display the list of customers by pressing (v) now");
                    String custAsst = input.next();
                    if(custAsst.charAt(0)=='v') {
                        showCustArray(customers, "o");       //write the correct method
                    }
                    else
//                    while(true) { 
                        
                        //Shopping methods go here
                        //1. Method for accessing or assigning the cart(s) to customer
                        //2. Method for adding items to that cart
                        //3. Method for removing items from the cart
                        //4. Method for displaying (toString)
                        //5. Method for finish and continue to checkout
                        
                        System.out.println("Will you be needing multiple carts?  1 is Probably enough for most needs but larger shopping may require more as a cart can fit a maximum number of items (25 items maximum in a cart).");
                System.out.println("Enter a customer ID to checkout.");
                //need to use a try/catch block here
                int arrayListIndex = getCustomerIndex(customers,input.next());
                showCustArray(customers);
                System.out.println("Please provide counts for item(s).  How many movies? books? cds?  " +                
                                "\n(Enter the number for each one with a space in between number, e.g. 1 4 2 to add 1 movie, 4 books and 2 cds)");
                /*//       String[] objectCount = input.nextLine().split(" ");

                try(BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in))){ 
        
                String[] words = bufferedReader.readLine().split(" ");
                int movieCount = Integer.parseInt(words[0]);
                int bookCount = Integer.parseInt(words[1]);
                int cdCount = Integer.parseInt(words[2]);

        
                //lookup the cart number for customer currently being helped (may help to have a generic method)
  
                //      showShoppingCart(customers,arrayListIndex);
        
                //go to the cart with the counts and add items to it.


                System.out.println("You were going to buy " + movieCount + "movies.  Is that right?" );
        
                System.out.println("And also books and cd's in the amounts of " + bookCount + ", and " + cdCount + "respectively.");
        
                System.out.println("If this is correct, then I can check you out now, or if you prefer to add/remove items then.  Please select o to checkout, a to add or r to remove.");
   
           */             
                    }
                if(selection=='r') {
                    break;
                }
                else if(selection=='c') {
                    System.out.println("Which customer will you be checking out?");
                    //Method for displaying only those customers with items in their carts
                    //Followed by a method for displaying a receipt and clearing all customer data "checkout"

                }
                } while(true);
                }
        }
        }
    public static void assignCartToCust(Customer[] cust, int i) {
        //Attempt to make it possible to assign more than one cart to a customer
        //either by returning two shopping carts, or else go back to where method call and process the request there.        
        //int cartCount = input.nextInt();
        //for(int i=0; i<cartCount;i++)
        carts.add(new ShoppingCart(i));
        String result=carts.get(i).toString();
        cust[i].setCartRef(i);
        System.out.println("The following cart, " + result + " has been added for customer " + cust[i].toString());
    }
    //Think more about this and what it will be able to do
    public static void customerCheckout(ShoppingCart[] s, String cartID) {    
    }
    
    public static void customerAdd(Customer[] customers, String id) {
        customers[getCustomerCount(customers)]=new Customer(id);
    }
    
    public static void customerAdd(Customer[] customers, String id, int num) {
        for(int i=0; i<num; i++) {
            String custID = CustomerID.generate();
            customerAdd(customers, custID);
        }
    }

        //An overvloaded method for customerArray to form a line or order listing of customer objects
    private static void showCustArray(Customer[] a, String id) {
        int index = getCustomerIndex(a, id);        
        for (int i =0; i<a.length; i++) {
//            if(a[i].getCart()==null) continue;
        }
    }

    protected static void showCustArray(Customer[] a) {
        //Convert to a GUI Maybe
        for (int i=1; i<=(a.length); i++) {
            //if(a[i]==null) continue;
            if(i%3!=0) {            
                System.out.print(a[i-1].getCustomerID()+"\t");
            }
            else if(i==getCustomerCount(a)-1) {
                System.out.println(a[i-1].getCustomerID() + ".");
            }
            else {
                System.out.println(a[i-1].getCustomerID() + "\t");
            }
        }    
        System.out.println();
    }

    private static void showShoppingCart(Customer[] a, int index) {
        System.out.println("You can now view the customer's cart summary informaton before returning to main menu");
        System.out.println(a[index].cartObjectReference.toString());
    }

    private static int getCartIndex(String cart) {
        //complete work to retreive index of cart in ArrayList and then pass that to the Customer method next for assigning the carts
    //    carts.
    return 0;
    }

    
  /*  
    protected static void assignCustomerCart(Customer[] array, String cust, String cart) {
        for (Customer array1 : array) {
            if (array1.customerID==cust)
                array1.getShoppingcart(carts.get()) {
                return array1;
            }
        }
           return null;
    }
*/
//If time to do a customer line for checkout/cashier for menu option 3 or 4 or whatever
    /*    private static void showCustomerLine(Customer[] a) {
        int lineCount = 1;
        System.out.println("Customers with carts form the line: ");
        for (int i =0; i<Store.customers.length; i++) {
            if(a[i].getCart()==null) continue;
            System.out.println("The order \"in line\" of customer " + a[i].getName() + " with ID " + a[i].getCustomerID() + " is " + lineCount++);
        }
    }
*/
    private static String getCustomerID(Customer[] cust, int i) {
        return cust[i].getCustomerID();
    }

    public String getCustomerID(Customer[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the customer ID again please to verify");
        int index = input.nextInt();
        return arr[index].customerID;
    }
    public Customer getCustomer(Customer[] arr, String id) {
        return arr[getCustomerIndex(arr,id)];
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

class ShoppingCart extends Store {
    //A shopping cart is what assists people in their shopping
    private static int cartCount;
    private String cartID;
    private int itemCount;
    java.util.ArrayList<Item> items = new java.util.ArrayList<>();

    public ShoppingCart() {
    }

    public ShoppingCart(int cartCount) {
        if(cartCount>=10) {
            this.cartID="Cart" + cartCount;
        }
        else {
        this.cartID = "Cart0" + cartCount;
        }
        cartCount++;
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
        System.out.println("Which of the " + getItemCount() + " items would you like to remove?");
        getItemsList();
    }

    public int getItemCount() {       
        return items.size();
    }    

    protected void getItemsList() {
        System.out.println(this.items.toString());
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
       return (cartID + " belongs to " + "SOMEONE" + "\nThe total count of items: " + getItemCount() + "\nThe total price of items: $" + getTotalPurchaseAmount());
    }    
}
