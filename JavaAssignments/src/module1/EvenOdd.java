package module1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a whole number = ");
		
		long x = sc.nextLong();
							
		if ((x % 2)==0)
		{
			System.out.println("Entered number "+x+" is an Even number.");
		}
		else
		{
			System.out.println("Entered number "+x+" is an Odd number.");

	}

}
}
