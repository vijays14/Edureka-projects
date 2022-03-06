package module4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Sudha Vijayakumar
 *
 */
public class QueImplClass implements Queue {

	static Scanner sc = new Scanner(System.in);
	ArrayList <String> cities = new ArrayList<>();
	@Override
	public void insert() {
				
		System.out.println("Enter 5 Cities names: ");
		
		for( int i= 1; i<=5; i++)
		{
			System.out.print("Name of the City " + i +":");
		cities.add(sc.next());
		}
	}
	
	public void display()
	{
		System.out.print
		("List of Cities :" );
		for(String city:cities)
				
		 System.out.print(city + "|");
		System.out.println();
		
	}

	@Override
	public void delete(String X) {
		
		if (cities.contains(X)==true )
		{
			
		cities.remove(X);
		System.out.println("The City " + X + " has been removed from the list successfully. ");
		}
		else
		{
			System.out.println("No Matching found.");
		}
		
		System.out.println("Remaining number of Cities in the List: ");
		display();
			
		
	}

	public static void main(String[] args) {
		QueImplClass QI = new QueImplClass();

		QI.insert();
		QI.display();
		
		System.out.print("Enter a City name to remove from list : ");
		String CityName = sc.next();
		QI.delete(CityName);
		

		
	}

}
