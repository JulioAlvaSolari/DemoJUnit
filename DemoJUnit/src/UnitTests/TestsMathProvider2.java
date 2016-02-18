package UnitTests;

import static org.junit.Assert.*;
import org.junit.Test;
import ApplicationUnderTest.*;

public class TestsMathProvider2 
{
	MathProvider provider;
	
	public TestsMathProvider2()
	{
		provider = new MathProvider();
	}
	
@Test
	public void addTest2()
	{
		System.out.println("Starting Test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		//assertEquals(firstNumber + secondNumber, provider.Add(firstNumber, secondNumber));
		System.out.println("Ending Test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}	

@Test
	public void SubtractTest2()
	{
		System.out.println("Starting Test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		//assertEquals(firstNumber - secondNumber, provider.Subtract(firstNumber, secondNumber));
		System.out.println("Ending Test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}	

@Test
	public void MultiplyTest2()
	{
		System.out.println("Starting Test " + new Object(){}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		//assertEquals(firstNumber * secondNumber, provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending Test " + new Object(){}.getClass().getEnclosingMethod().getName());
	}	

}
