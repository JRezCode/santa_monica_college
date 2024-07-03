/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JR
 */
public class CustomerID {
        //A class that generates a unique ID for each customer that goes into the store
       //For this random ID that is assigned to each Customer 
    //public String customerID;
    
    public static void main(String[] args) {
    }
    
    public static String generate() {
        int id = (int)(Math.random()*1000);
        return java.lang.String.format("%05d",id);
    }
}
