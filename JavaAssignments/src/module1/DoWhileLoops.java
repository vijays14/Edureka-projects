package module1;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		
		  System.out.println("Print Even and Odd numbers using Do while loop :");
		  doEvenOdd();
		  System.out.println("----------------------------------------------------");
		  System.out.println("Print Factorial of a number using Do while loop :");
		  doFactorialNum();
		  
		  System.out.println("----------------------------------------------------");
		  
		  System.out.println("Print Tables of 10 using Do while loop :");
		  
		  doTables10();
		  System.out.println("----------------------------------------------------");
		  
		  System.out.println("Print Sum of digits of a number using Do while loop :");
		  doAddDigits();
		  System.out.println("----------------------------------------------------");
		  
		
		  System.out.println("Print Reverse of digits of a number using Do while loop :");
		  doFlipDigits();
		  System.out.println("----------------------------------------------------");
		 
		System.out.println("Print Fibonacci series using Do while loop :");
		doFibonacci();
		System.out.println("----------------------------------------------------");
	}
	public static void doEvenOdd()
	{
		{
			int n=1;
			System.out.println("Even number: ");
			do
			{

				if ((n%2)==0)
				{

					if(n==20) {
						System.out.println(n+".");
					}
					else
					{
						System.out.print(n+",");
					}
				}
				n++;
			}while(n<=20);

			System.out.println("Odd number: ");
			n=1;
			do
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
			}while(n<=20);
		}
	}
	
	public static void doFactorialNum()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to find factorial = ");
		int x=1;
		long a=1;
		long b;
		long n =sc.nextLong();
		b = n;
		do
		{
			a =a*n;
			n--;
		}while(n>=x);
		System.out.println("Factorial of number " + b+ " is (using Do-While loop) = "+ a );
		
	}

	public static void doTables10()
	{
		int n = 10;
		int x,i =1;
		System.out.println("Generating tables of 10 (Do-While loop) :");
		while(i<=n)
		{
			x = n * i;
			System.out.println(n + "*" + i + " = " + x );
			i++;
		}
		
	}

	public static void doAddDigits()
	{
		long dgt,a;
		long sum =0;
		Scanner scans = new Scanner(System.in);
		System.out.print("Enter a number to add its digits = ");
		dgt = scans.nextLong();
		a= dgt;
		do
		{
			sum = sum+(dgt%10);
			dgt/=10;
		}while(dgt!= 0);
		System.out.println("Sum of the digits of number " + a + " is (using Do-while loop) = "+ sum);

	}

	public static void doFlipDigits()
	{
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter a number to reverse it = ");
		long rnum = scn.nextLong();
		long a=0;
		System.out.print("Reversed digits of number "+rnum+" with While loop = ");
		do
		{
			a=rnum%10;
			System.out.print(a);
			rnum/=10;
		}while (rnum!=0);
		
		 System.out.println("");
	}
	public static void doFibonacci()
	{

		int x = 0;
		int y = 1;
		int i=0,z = 0;
		System.out.println("The Fibonacci numbers:");
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
