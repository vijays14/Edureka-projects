 
package module4; 
import java.util.Arrays;

//Write a program to demonstrate ArrayIndexOutOfBoundsException
/**
 * @author Sudha Vijayakumar
 *
 */
public class ArrayException {

	public static void main(String[] args) {
		
		try {
			
		int[] temperature_data = new int[] {78,79,80,83,86,81,76,90,77};
			Arrays.sort(temperature_data);
			//creating Arrayindexoutofbounds exception by calling the length of the array.
			for (int i=0;i<=temperature_data.length;i++)
			{
		System.out.println("Print Temperature of Day 10 : "+ temperature_data[temperature_data.length]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("Exception Thrown : " + e);
			System.out.println("\nMessage of the Exception : " + e.getMessage());
			System.out.println("Complete StackTrace of the Exception " + e.getStackTrace());
		}

	}

}
