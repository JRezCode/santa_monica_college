package logic_gates;

/**
 * 
 */
/**
 * @author jon
 *
 */


public class ComplexCalc {
	protected int re;
	protected int im;
	
	public ComplexCalc(int imag, int real) {
		this.re = real;
		this.im = imag;
	}
	
	public static void main(String[] args) {	
		System.out.println("Complex number calculator\n");
		
		System.out.println("Creating two complex numbers to work with... ");
		System.out.print("C1:  ");
		ComplexCalc a = new ComplexCalc(1,1);
		System.out.println(a+" (ai + b)");

		System.out.print("C2:  ");		
		ComplexCalc b = new ComplexCalc(5,1);
		System.out.println(b+" (ci + d)\n");

		System.out.println("\nNow using the formulas below to Add/Subtract/Multiply/Divide");
		System.out.println("NOTE: Java's integer division may produce incorrect results.\n"); 		
		System.out.println("C1 + C2 = "+a.add(b)+"\t(a + c)i + (b + d)");
		System.out.println("C2 - C1 = "+b.subtract(a)+"\t(a - c)i + (b - d)");		
		System.out.println("C1 * C2 = "+a.multiply(b)+"\t(ad + bc)i + (bd - ac)");
		System.out.println("C2 / C1 = "+b.divide(a)+"\t((-bc + ad)i + (ac + bd))/(c*c*d*d)");
	}
	
	public String toString() {
		return this.im + "i + " + this.re;
	}

	public ComplexCalc add(ComplexCalc c){
		return new ComplexCalc(this.im+c.im,this.re+c.re);
	}
	
	public ComplexCalc subtract(ComplexCalc c) {
		return new ComplexCalc(this.im-c.im,this.re-c.re);
	}

	public ComplexCalc multiply(ComplexCalc c) {
		return new ComplexCalc(this.im*c.re+c.im*this.re,this.re*c.re-this.im*c.im);
	}
	
	public ComplexCalc divide(ComplexCalc c) {
		//Need to correct this on account of integer division being not great for this purpose.
		return new ComplexCalc((-this.re*c.im+c.re*this.im)/(c.im*c.im+c.re*c.re),(this.re*c.re+this.im*c.im)/(c.im*c.im+c.re*c.re));
	}
		
	
}
