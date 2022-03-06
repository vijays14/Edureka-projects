package module1;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number = ");
		
		long x = sc.nextLong();
		
		System.out.print("Enter second number = ");
		
		long y= sc.nextLong();
		
			
		if (x > y)
		{
			System.out.println("Entered first number  " +x+" is greater than second number "+y );
		}
		else
		{
			System.out.println("Entered second number  " +y+" is greater than first number "+x);

	}

}
}
