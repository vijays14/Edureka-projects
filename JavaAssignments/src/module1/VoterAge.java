package module1;

import java.util.Scanner;

public class VoterAge {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Candidate's age = ");
		
		int age= sc.nextInt();
		
		if (age >=18)
		{
			System.out.println("Candidate with age -"+ age +"- is eligible to Vote.");
		}
		else
		{
			System.out.println("Candidate with age -"+age+"- is not eligible to Vote.");

	}

}
}
