package stacks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleTestStack {

	@Test
	void testFull() {
		ArrayBoundedStack<Integer> s = new ArrayBoundedStack<Integer>(3);
		s.push(3);
		s.push(3);
		s.push(3);
		assertTrue(s.isFull());
	}

}
