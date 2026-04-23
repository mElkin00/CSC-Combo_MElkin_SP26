import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Calculator_Test {
	private Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Addition test")
	void testAdd() {
		int result = calculator.add(5, 3);
		assertEquals("\n~Add is not working properly~\n", result, 8);
		
	}
	
	@Test
	@DisplayName("Multiplication test")
	void testMultiply() {
		int result = calculator.multiply(2, 3);
		assertEquals(result, 6, "\n~Mutiplier not working properly~\n");
	}
	
	@Test
	@DisplayName("Division test")
	void testDivide() {
		double result = calculator.divide(4, 2);
		assertEquals(result, 2, "\n~Divisior not working properly~\n");
		
	}

}
