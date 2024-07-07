package complex;
/**
 * This class represents a complex number
 * @author irma
 *
 */
public class Complex {
	
	private double re;
	private double im;
	
	 /**
     * Initializes a complex number from the specified real and imaginary parts.
     *
     * @param re the real part
     * @param im the imaginary part
     */
	public Complex(double re, double im)
	{
		this.re = re;
		this.im = im;
	}
	
	/**
     * Returns the sum of this complex number and the specified complex number.
     *
     * @param  n the other complex number
     * @return the complex number whose value is {@code (this + n)}
     */
	public Complex sum(Complex n)
	{
		return new Complex(n.re + this.re, n.im + this.im);
	}
	
	 /**
     * Returns the product of this complex number and the specified complex number.
     *
     * @param  n the other complex number
     * @return the complex number whose value is {@code (this * n)}
     */
	public Complex multiply(Complex n)
	{
		return new Complex(n.re * this.re - n.im * this.im, n.re * this.im + n.im * this.re);
	}
	
	 /**
     * Returns a string representation of this complex number.
     *
     * @return a string representation of this complex number,
     *         of the form 34 - 56i.
     */
	 public String toString() {
	        if (im == 0) return re + "";
	        if (re == 0) return im + "i";
	        if (im <  0) return re + " - " + (-im) + "i";
	        return re + " + " + im + "i";
	    }

	public double getRe() {
		return re;
	}

	public double getIm() {
		return im;
	}
	 
	 
	
	
	
}
