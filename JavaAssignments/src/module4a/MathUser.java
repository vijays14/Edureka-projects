package module4a;

import java.util.Scanner;

import module4.MathFunction;

/**
 * @author Sudha Vijayakumar
 *
 */
public class MathUser {

	public static void main(String[] args) {
		
		MathFunction mf = new MathFunction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***** Enter two numbers to Subtract ***** ");
		
		System.out.print("First Number : ");
		int a = sc.nextInt();
		System.out.print("Second Number : ");
		int b = sc.nextInt();
		mf.subtract(a, b);
		
		System.out.println("*** Enter two numbers to Multiply and Divide *** ");
		
		System.out.print("First Number : ");
		int x =sc.nextInt();
		System.out.print("Second Number : ");
		int y = sc.nextInt();
		mf.multiply(x, y);
		mf.division(x, y);

		System.out.print("Enter a number to find Factorial : ");
		
		int fact = sc.nextInt();
		
		mf.factorial(fact);
		
		System.out.print("Enter a number to reverse its Digits : ");
		
		long num = sc.nextLong();
		
		mf.reverse(num);
		
	}

}
