package ApplicationUnderTest;

public class MathProvider 
{
private double firstNumber, secondNumber;

public void setFirstNumber(double firstNumber)
{
  this.firstNumber = firstNumber;	
}

public void setSecondNumber(double secondNumber)
{
	//comment
  this.secondNumber = secondNumber;	
}

public double Subtract()
	{
		return (firstNumber - secondNumber);
	}

public double Add()
{
	return (firstNumber + secondNumber);
}

public double Multiply()
{
	return (firstNumber * secondNumber);
}


}
