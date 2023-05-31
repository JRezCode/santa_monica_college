import java.util.Scanner;
/**
 *
 * @author JR
 */
public class Store {   
    /**
     * @param args the command line arguments
     */
    private static int MAX_CAPACITY = 40;
    static ShoppingCart[] carts;
    private static Item[] customerCarts;

    //Builds a collection of shopping cart objects in an array and assigns them each a unique cartID
    public static void createCarts(int cartCount){
        carts = new ShoppingCart[cartCount];
        for(int i = 0; i<carts.length; i++) {
            carts[i]= new ShoppingCart(i+11);
        }        
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
        System.out.print("Enter the number of shopping carts for your store");
        int cartCount = input.nextInt();
        createCarts(cartCount);
        showCartArray(carts);
        Customer[] customers = new Customer[MAX_CAPACITY];

        //Demonstration of filling an array of shopping carts with unique id's

        //Demonstration of adding customers all named Joe Smith who will be shopping for items
        System.out.println("Now let's add some new customers to our active shoppers list, \n For this part you may enter the number of customers you wish to include up to 40.");    
        int custCount = input.nextInt();
        addCustomers(customers,custCount);
        showCustArray(customers);
        
        //Using the shopping cart 1 custome at a time
//        StoreGUI.main(args);
        }
    }
    
    public static void showCartArray(ShoppingCart[] a) {
        System.out.println("Cart Tracker");
        
        int r = a.length % 10;
        for (int i = 0; i < a.length/10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(a[i*10+j].getCartID()+"\t");
            System.out.println();
        }
        for (int i = r; i > 0; i--) {
            System.out.print(a[a.length-i].getCartID()+"\t");
        }
        System.out.println();
    }
        
    //The general method 
    public static void showCustArray(Customer[] a) {
        System.out.print("ACTIVE SHOPPERS...\n");
        for (int i =0; i<Store.MAX_CAPACITY; i++) {
            if(a[i]==null) continue;
            System.out.println(a[i].customerID);
        }
    }

    //A help menu driven mapping for the customer array to the unique customer ID
    public static void showCustArray(Customer[] a, String help) {
        System.out.println("You have selected the help option to show you which of the customers in the array are currently assigned which" +
                "index in the customer list, please refer to the following mapping: ");
        for (int i =0; i<Store.MAX_CAPACITY; i++) {
            if(a[i]==null) continue;
            System.out.println("The order of customer ID" + a[i].customerID + "\"in line\" is " + (i+1));
        }
    }


    public static void addCustomers (Customer[] array, int num) {
        int count = num;
        for (int i = 0; i<Store.MAX_CAPACITY; i++) {
            while (count>0) {
                if(array[i]==null) {
                    int id = (int)(Math.random()*1000);
                    array[i]= new Customer(Integer.toString(id));
                    array[i].chooseCart();
                    count--;}
                else break;
            }
        }
        System.out.println("Your store has just added " + num + " additional cusotmers.");
    }
    
    public static int getCustomerCount (Customer[] array) {
        int count = 0;
        for (int i =0; i<array.length; i++) {
            if(array[i]!=null)
                count++;
            else continue;
        }
        return count;
    }
}

class Item {
    private String title;
    private String description;
    private double price;
//    private boolean inStock;
    
    //Generic constructor for the Item superclass that will extend movies, books, cds
    public Item() {

    }
    
    //The getters and setters for the superclass Item
    public double getPrice() {
        return price;
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
    private int itemID;
    private int pageCount;
    //private String publisher;
    //private String genre;    

    public Book() {
    super.setPrice(50);
    }
}

class Movie extends Item{
    private int length;
//    private String movieName;
    public Movie() {
        super.setPrice(25.00);
        System.out.println("A movie item costing" + super.getPrice());
    }
}

class CD extends Item{
    private int trackCount;
    private String artistName;
    private String genre;
    public CD() {
        super.setPrice(10.99);
        System.out.println("is a cd");
    }
    public CD(String d) {
        super.setPrice(1.99);
        System.out.println("is at a discount.");
    }
}


class Customer {
    public String customerID;
    public String fName;
    public String lName;
    public String cartObjectRef;          //a pointer to the index within array of shopping cart objects 

    public Customer() {
    }

    public Customer(String s) {
        this.customerID = "Cust"+s;
        this.fName = "Joe";
        this.lName = "Smith";
    }    
    
    //a mutator method in the customer class to reference one of the shopping carts in store 
    public void chooseCart() {
        for(int i = 0; i<Store.carts.length; i++) {
            if (Store.carts[i].isInUse()==false) {
                this.cartObjectRef = Store.carts[i].getCartID();
            }
            else
                System.out.println("There are no more shopping carts.");
            }
        }

    @Override
    public String toString() {
        return "Customer: " + fName + lName + "\nCustomerID: " + customerID + "\nShoppingcartID: " + cartObjectRef + "\nItem Total: ";
    }
}
    
class ShoppingCart {
    //A shopping cart is what assists people in their shopping
    private String cartID;
    private static int cartCount;
    private int itemCount;
    private boolean inUse;

    public ShoppingCart() {
    }
    public ShoppingCart(int cartCount) {
        this.cartID = "Cart0" + cartCount;
        this.inUse = false;
        cartCount++;
    }
    public boolean isInUse() {
        return this.inUse;
    }
    public String getCartID() {
        return this.cartID;
    }
    public void addItem(Item i) {
        
    }        
    public void removeItem(int index) {

    }
    public int getTotalItems() {       
        return 0;
    }    
    @Override
    public String toString(){
       return ("ID: "+cartID);
    }
}