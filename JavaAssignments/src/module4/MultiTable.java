package module4;

/**
 * @author Sudha Vijayakumar
 *
 */
public class MultiTable {
	
	synchronized void printTable(int n)
	{
		System.out.println("Printing Multiplication table of "+n);
		for (int i = 1 ; i<=20;i++)
			
		{
			System.out.println(i +" * "+n+" = "+ i*n);
		}
		System.out.println("****** End of Table ********");
	}

	
}
