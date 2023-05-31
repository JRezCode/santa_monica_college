package FinalStore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JR
 */

public class Customer {
    public String customerID;
    public String storeInput;
    private String fName;
    private String lName;
    protected ShoppingCart cartObjectReference;          //a pointer to the index within array of shopping cart objects 
    
    public Customer(String s) {
        this.customerID = s;
        this.fName = "Joe";
        this.lName = "Smith";
    }    

    public void setCartRef(int i) {
        this.cartObjectReference=Store.carts.get(i);
    }

    public void setName(String a, String b) {
        System.out.println("Customer's name was entered as " + a + " " + b);
        this.fName=a;
        this.lName=b;
    }
    
    public String getName() {
        return this.fName + " " + this.lName;
    }
    
    public String getCustomerID() {
        return this.customerID;
    }

/*
    This is probably not going to work
    public String getCustomerCartID() {
        return this.cartObjectRef.toString();
    } 
*/    
    public void getShoppingcart(ShoppingCart c) {
        this.cartObjectReference=c;
    }
    

/*for(int i =0; i<Store.carts.size(); i++) {
            if (Store.carts.get(i).getCartID()==null)
                continue;
            else if (Store.carts.get(i).equals(this.customerID))
                    return Store.carts.get(i);      
    }                  return null;
    }*/
    
    @Override
    public String toString() {
        return fName + " " + lName + ", ID#" + customerID + " and has a cart " + cartObjectReference.toString().substring(0,6);
    }
}