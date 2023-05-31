/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author JR
 */
public class Complex {
    double re;
    double im;
    
    public Complex(double real, double imaginary) 
    {
        re=real;
        im=imaginary;
    }
    
    public String toString(){
        return this.re + " + " + this.im + "j";
    }

    public static void main(String[] args) 
    {

        Complex n1 = new Complex(2,3);
        Complex n2 = new Complex(1,2);
        Complex n3 = 
        System.out.println(n);
        
    }
    
}
