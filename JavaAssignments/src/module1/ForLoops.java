package module1;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {

		System.out.println("Method to Print Even and Odd numbers : ");
		evenOdd();

		System.out.println("------------------------------------------------------");
		
		System.out.println("Method to Print Factorial of given number : ");
		factorial(); 
		
		System.out.println("------------------------------------------------------");
		System.out.println("Method to Print Table of 10 : ");
		tables10(); 
		
		System.out.println("------------------------------------------------------");
		System.out.println("Method to Print add digits of a number : ");
		addDigits();	
		
		System.out.println("------------------------------------------------------");
		System.out.println("Method to Print Reverse digits of a number : ");
		reverseDigits();
		
		System.out.println("------------------------------------------------------");
		System.out.println("Method to Print 10 Fibonacci numbers : ");
		fibonacci();
		
		System.out.println("------------------------------------------------------");

	}

	public static void evenOdd()
	{
		int n=20;
		System.out.println("First 10 even numbers are" );
		for (int i=1;i<=n;i++)
		{
			if((i%2)==0)
			{

				if(i==n)
				{
					System.out.println(i);
				}
				else {
					System.out.print(i);
					System.out.print(",");
				}
			}
		}
		System.out.println("First 10 Odd numbers are" );
		for (int i=1;i<=n;i++)
		{
			if((i%2)!=0)
			{
				if(i==(n-1))
				{
					System.out.println(i);
				}
				else {
					System.out.print(i);
					System.out.print(",");
				}
			}

		}

	}

	public static void factorial()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to find factorial = ");

		int n =sc.nextInt();
		long x= 1;

		for(int i=n;i>0;i--)
		{
			x = x*i;
		}

		System.out.println("Factorial of given number " + n +" is = "+ x );
	}

	public static void tables10()
	{
		int n = 10;
		int x,i =1;
		System.out.println("Generating tables of 10 :");
		for (i =1; i<=n; i++ )
		{
			x = n * i;
			System.out.println(n + "*" + i + " = " + x );

		}

	}

	public static void addDigits()
	{
		long a,sum;
		Scanner scans = new Scanner(System.in);
		System.out.print("Enter a number to add = ");
		a = scans.nextLong();

		for (sum = 0; a!=0;a /=10)
		{
			sum = sum+(a%10);
		}
		System.out.println("Sum of the digits of given number is = "+ sum);

	}

	public static void reverseDigits()
	{
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter a number to reverse it = ");
		long rnum = scn.nextLong();
		long a;
		System.out.print("Reversed digit of "+rnum+" is = ");
		for (a=0;rnum!=0;rnum/=10)
		{
			a=rnum%10;
			System.out.print(a);
		}

		System.out.println("");
	}

	public static void fibonacci()
	{

		int x = 0;
		int y = 1;
		int z = 0,i;
		System.out.println("The Fibonacci numbers :");
		for(i=0;i<=9;i++)
		{
			if (i==9) {
				System.out.print(x);
			}
			else
			{
				System.out.print(x);
				System.out.print(",");
			}
			z = x+y;
			x = y;
			y = z;

		}
		System.out.println("");
	}
}
