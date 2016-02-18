package UnitTests;

import static org.junit.Assert.*;
import org.junit.Test;
import ApplicationUnderTest.*;

public class TestsMathProvider 
{
	MathProvider provider;
	
	public TestsMathProvider()
	{
		provider = new MathProvider();
	}
	
@Test
	public void addTest()
	{
		System.out.println("Starting Test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
//		assertEquals(firstNumber + secondNumber, provider.Add(firstNumber, secondNumber));
		System.out.println("Ending Test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}	

@Test
	public void SubtractTest()
	{
		System.out.println("Starting Test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
//		assertEquals(firstNumber - secondNumber, provider.Subtract(firstNumber, secondNumber));
		System.out.println("Ending Test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}	

@Test
	public void MultiplyTest()
	{
		System.out.println("Starting Test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
//		assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending Test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}	

}
