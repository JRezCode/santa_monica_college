package complex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestComplex {

	@Test
	void testComplex() {
		Complex c1 = new Complex(3, 4);
		assert(c1.getRe() == 3);
		assert(c1.getIm() == 4);		
	}

	@Test
	void testSum() {
		Complex c1 = new Complex(3, 4);
		Complex c2 = new Complex(1, 2);
		Complex c3 = c1.sum(c2);
		assert(c3.getRe() == 4);
		assert(c3.getIm() == 6);
	}

	@Test
	void testMultiply() {
		Complex c1 = new Complex(3, 4);
		Complex c2 = new Complex(1, 2);
		Complex c3 = c1.multiply(c2);
		System.out.println(c3);
		assert(c3.getRe() == -5);
		assert(c3.getIm() == 10);
	}


}
