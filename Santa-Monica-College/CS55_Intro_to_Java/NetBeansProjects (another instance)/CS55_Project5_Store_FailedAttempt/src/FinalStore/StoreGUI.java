package FinalStore;

import FinalStore.ShoppingCart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JR
 */
public class StoreGUI {
        
    public static void main(String[] args) {        
        System.out.println("Sample Store Interface");
        //Do a rectangle and oval shaped representation of each of the objects, including carts, items and customers
        
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

    
    public static void help() {
        //Insert some code for a GUI help dialogue
        //press (h) at any point for the help dialogue that will display some instructions
  
        String selection = "h";
        switch (selection) {
            case("h"):
                //Store.showCustArray(Store.customers, selection);
        System.out.println("For customer ID's be sure to enter them exactly as given in the listing and keep in mind that items may" +
                    "only be added to customers that already exist (cannot be placed in an empty list node.");
                break;
            default:
                System.out.println("Please enter the customer ID exactly as seen in the Cust ID listing, keeping in mind that an item may" +
                        "only be added to customers already existing (cannot be placed in an empty list node.");
                try {
//                    Store.showCustArray(Store.customers, "help", "with", "this");
//                    Store.showCustArray(Store.customers, "help", "with", "this");
                }
                catch(Exception e) {
                    System.out.println("Oops you can't do that there.");
                }
                break;
        }
    
    }
    
}