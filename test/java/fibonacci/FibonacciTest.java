package fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
	private Fibonacci fibonacci;
	
	@BeforeEach
	public void setup() {
		fibonacci = new Fibonacci();
	}
	
	@Test
	public void paraN1K1return1() {
		long expectedValue = 1;
		long obtainedValue = fibonacci.compute(1,1);
		
		assertEquals(expectedValue, obtainedValue);
	}
	
	@Test
	public void paraN2K1return1() {
		long expectedValue = 1;
		long obtainedValue = fibonacci.compute(2,1);
		
		assertEquals(expectedValue, obtainedValue);
	}
	
	@Test
	public void paraN3K1return2() {
		long expectedValue = 2;
		long obtainedValue = fibonacci.compute(3,1);
		
		assertEquals(expectedValue, obtainedValue);
	}
	
	@Test
	public void paraN5K3return19() {
		long expectedValue = 19;
		long obtainedValue = fibonacci.compute(5,3);
		
		assertEquals(expectedValue, obtainedValue);
	}
}
