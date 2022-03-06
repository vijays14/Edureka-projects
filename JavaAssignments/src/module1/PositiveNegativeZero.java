package module1;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number = ");
		
		long testnum= sc.nextLong();
		
		if (testnum >=0)
		{
			if (testnum==0)
			{
				System.out.println("Entered number is a Zero." );
			}
			else {
			System.out.println("Entered number  " +testnum+" is a positive number." );
			}
		}
		else 
		{
			System.out.println("Entered number  " +testnum+" is a negative number.");

	}
		

}
}
