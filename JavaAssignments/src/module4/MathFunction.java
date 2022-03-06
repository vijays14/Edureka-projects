package module4;

/* Write a program to define functions for subtract, multiply, divide, 
factorial and reversing the digits of a number in a package, import this class
in another package and use all the methods defined in the primary package*/


/**
 * @author Sudha Vijayakumar
 *
 */
public class MathFunction {

	public void  subtract(int a, int b)
	{
		if (a>b)
		{
			int subtract = a - b;
			
			System.out.println("Subtraction of "+a + "-" + b +" = "+subtract);
		}
		else
		{
			int subtract = b-a;
			System.out.println("Subtraction of "+b + "-" + a +" = "+subtract);
		}
		
	}
	
	public void multiply(int a, int b)
	{
		int multiply = a*b;
	
		System.out.println("Product of "+a + "*" + b +" = "+multiply);
	}
	
	public void division(int a, int b)
	{
		if (b!=0)
		{
			double divide = a/b;
			System.out.println("Division of "+a + "/" + b +" = "+ divide);
		}
		else
		{
			System.out.println("Divisor " + b+ "is zero.Hence the resultant will be infinity.");
		}
	}
	
	
	  public void reverse(long num) { 
		  
		  long digit = num;
		   boolean isnegative = num <0 ? true:false;
		   
		   if (isnegative)
		   {
			   num = num * -1;
		   }
		   
		   long reverse = 0;
		   		  
	  while (num != 0)
	  {
		  reverse = reverse*10 + num%10;
		  num = num /10;
	  }
	  
	  System.out.println("The reverse of given digit " + digit + " = " + reverse);
	  
	  }
	 	 
	  public void factorial(int n) { 
		  long factorial = 1;
		  
		  if (n<=14)
		  {
		  
		  for(int i=1; i<= n; i++)
		  {
			  factorial = i * factorial;
		  }
	  
		   System.out.println("The Factorial for the given number " + n + " = " + factorial);
		  }
		  else 
		  {
			  System.out.println("The Factorial for the given number is too long to display.");
		  }
	   }
	 
}
