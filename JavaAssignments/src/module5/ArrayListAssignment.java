/**
 * 
 */
package module5;

import java.util.ArrayList;

/**
 * @author Sudha Vijayakumar
 *
 * Module 5  - Collections and Wrapper class Assignments
 * Write a program to insert 1 to 10 numbers in ArrayList and display them
 */
public class ArrayListAssignment {

	public static void main(String[] args) {
		
		try {
		
		ArrayList<Integer> SNo = new ArrayList<Integer>();
		int i = 1;
		while( i<=10)
		{
			SNo.add(i);
			i++;
		}
		
		System.out.println("Displaying the new ArrayList : " + SNo);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
