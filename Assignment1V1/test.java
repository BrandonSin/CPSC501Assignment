package files;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

//13 tests, 8 should pass and 5 should fail

public class Test {
	Calculator calc = new Calculator();
	Subtraction test_sub = new Subtraction();
	Addition test_add = new Addition();
	Multiplication test_mul = new Multiplication();
	Division test_div = new Division();
	QuadraticFormula test_qf = new QuadraticFormula();
	AverageSpeed test_avgs = new AverageSpeed();
	Average test_avg = new Average();
	
	ArrayList<Double> list = new ArrayList<Double>();
	
	@org.junit.Test
	public void testAdditionValidInput() { //Succeed
		String input = "1 2 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_add.userInput();
		assertEquals(6.0, test_add.sum, 0.1);
	}
	
	@org.junit.Test
	public void testAdditionInvalidInput() { //Failure
		String input = "1 2 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_add.userInput();
		assertEquals(3.0, test_add.sum, 0.1);
		
	}
	@org.junit.Test
	public void testSubtractionInvalidInput() { //Failure
		String input = "1 2 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_sub.doSubtraction();
		assertEquals(0.0, test_sub.difference, 0.1);
		
	}
	@org.junit.Test
	public void testSubtractionValidInput() { //Success
		String input = "1 2 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_sub.doSubtraction();
		assertEquals(-4.0, test_sub.difference, 0.1);
		
	}
	
	@org.junit.Test
	public void testMultiplicationValidInput() { //Success
		String input = "4 2 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_mul.doMultiplication();
		assertEquals(24.0, test_mul.product, 0.1);
		
	}
	
	@org.junit.Test
	public void testMultiplicationInvalidInput() { //Failure
		String input = "4 2 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_mul.doMultiplication();
		assertEquals(7.0, test_mul.product, 0.1);
		
	}
	@org.junit.Test
	public void testDivsionValidInput() { //Success
		String input = "1 2 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_div.doDivision();
		assertEquals(0.16666666, test_div.quotient, 0.1);
		
	}
	@org.junit.Test
	public void testDivsionInvalidInput() { //Failure
		String input = "1 2 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_div.doDivision();
		assertEquals(0.00000, test_div.quotient, 0.1);
		
	}
	@org.junit.Test
	public void testQuadraticValidInput() { //Success
		String input = "1 3 2";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_qf.doQuadraticFormula();
		assertEquals(-1, test_qf.ansPositive, 0.1);
		assertEquals(-2.0, test_qf.ansNegative, 0.1);
		
	}
	@org.junit.Test
	public void testQuadraticNegtiveSqroot() { //Success
		String input = "5 1 5";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_qf.doQuadraticFormula();
		assertEquals(0.0, test_qf.ansPositive, 0.1);
		assertEquals(0.0, test_qf.ansNegative, 0.1);
		
	}
	
	@org.junit.Test
	public void testAverageSpeedValid() { //Success
		String input = "3 3 3 3 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_avgs.calcDistance();
		input = "1 2 3";
		in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_avgs.calcTime();
		assertEquals(2.5, test_avgs.data.avgSpeed, .1);
		
	}
	@org.junit.Test
	public void testAverageSpeedInvalid() { //Failure
		String input = "3 3 3 3 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_avgs.calcDistance();
		input = "1 2 3";
		in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_avgs.calcTime();
		assertEquals(0.0, test_avgs.data.avgSpeed, .1);
		
	}
	
	@org.junit.Test
	public void testAverageValid() { //Success
		String input = "3 3 3 3 3";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		test_avg.doAverage();
		assertEquals(3.0, test_avg.data.avg, .1);
		
	}
	
	
		
		
		
	

}
