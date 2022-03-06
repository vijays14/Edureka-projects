package module1;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		evenOddNum();
		System.out.println("----------------------------------------------------");
		factorialNum();
		System.out.println("----------------------------------------------------");
		tables10();
		System.out.println("----------------------------------------------------");
		addDigits();
		System.out.println("----------------------------------------------------");
		flipDigits();
		System.out.println("----------------------------------------------------");
		fibonacci();
		System.out.println("----------------------------------------------------");
	}

	public static void evenOddNum()
	{
		int n=1;
		System.out.println("Even number: ");
		while(n<=20)

		{

			if ((n%2)==0)
			{

				if(n==18) {
					System.out.println(n+".");
				}
				else
				{
					System.out.print(n+",");
				}
			}
			n++;
		}

		System.out.println("Odd number: ");
		n=1;
		while(n<=20)
		{
			if((n%2)!=0)
			{
				if(n==19)
				{
					System.out.println(n+".");
				}
				else 
				{
					System.out.print(n+",");


				}
			}
			n++;
		}
	}

	public static void factorialNum()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to find factorial = ");
		int x=1;
		long a=1;
		long b;
		long n =sc.nextLong();
		b = n;
		while(n>=x)
		{
			a =a*n;
			n--;
		}
		System.out.println("Factorial of number " + b+ " is (with While loop) = "+ a );
		
	}

	public static void tables10()
	{
		int n = 10;
		int x,i =1;
		System.out.println("Generating tables of 10 (using While loop) :");
		while(i<=n)
		{
			x = n * i;
			System.out.println(n + "*" + i + " = " + x );
			i++;
		}
		
	}

	public static void addDigits()
	{
		long dgt,a;
		long sum =0;
		Scanner scans = new Scanner(System.in);
		System.out.print("Enter a number to add its digits = ");
		dgt = scans.nextLong();
		a= dgt;
		while(dgt!= 0)
		{
			sum = sum+(dgt%10);
			dgt/=10;
		}
		System.out.println("Sum of the digits of number " + a + " is (using while loop) = "+ sum);

	}

	public static void flipDigits()
	{
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter a number to reverse it = ");
		long rnum = scn.nextLong();
		long a=0;
		System.out.print("Reversed digits of number "+rnum+" with While loop = ");
		while (rnum!=0)
		{
			a=rnum%10;
			System.out.print(a);
			rnum/=10;
		}
		System.out.println("");
	}
	
	public static void fibonacci()
	{

		int x = 0;
		int y = 1;
		int i=0,z = 0;
		System.out.println("The Fibonacci numbers with While Loop :");
		while(i<=9)
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
			i++;
		}
		System.out.println("");
	}

}


