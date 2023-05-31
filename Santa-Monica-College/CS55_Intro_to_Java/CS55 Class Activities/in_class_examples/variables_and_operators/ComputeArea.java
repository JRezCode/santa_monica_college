package variables_and_operators;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jon
 */
import java.util.Scanner; // Scanner is in the java.util package

public class ComputeArea {
public static void main(String[] args) {
// Create a Scanner object
Scanner input = new Scanner(System.in);

// Prompt the user to enter a radius
System.out.print("Enter a number for radius: ");
double radius = input.nextDouble();

// Compute area
double area = radius * radius * 3.14159;

// Display result
System.out.println("The area for the circle of radius " +
radius + " is " + area);
input.close();
} 
}