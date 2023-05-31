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
                    Store.showCustArray(Store.customers, "help", "with", "this");
//                    Store.showCustArray(Store.customers, "help", "with", "this");
                }
                catch(Exception e) {
                    System.out.println("Oops you can't do that there.");
                }
                break;
        }
    
    }
    
}