
public class CalculatorMain
{

	public static void main(String[] args) 
	{
		//this is how we create an object
		//new --> is a java keyword which creates an object
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 6));
		
		System.out.println("The difference of 19 and 8 is " + calc.subtract(19,8));
		
	}

}
