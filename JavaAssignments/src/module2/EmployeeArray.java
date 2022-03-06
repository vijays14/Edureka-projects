/*
 * Author :Sudha Vijayakumar
 * 2nd Assignment
 * 06/02/2021
 */
package module2;
import java.util.Scanner;

public class EmployeeArray {

	public static void main(String[] args) {
		
		String[] empname = new String[5];
		String[] empid = new String[5];
		int[] empsalary = new int[5];
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id, Name and Salary : ");
		System.out.println("------------------------------------ ");

		for (int i=0; i<empid.length; i++)
		{
			
			System.out.print("Enter Employee Id : ");
			empid[i] = sc.next();
			System.out.print("Enter Employee Name : ");
			empname[i] = sc.next();
			System.out.print("Enter Employee Salary : ");
			empsalary[i]= sc.nextInt();
			
		}
	display(empid,empname,empsalary);
	System.out.println("------------------------------------ ");
	display(empid,empname);
	System.out.println("------------------------------------ ");
		System.out.print("Enter Employee Name to search : ");
		String name = sc.next();
		display(name,empid,empname,empsalary);
		}

	
	public static void display(String[] empid,String[] empname, int[] empsalary)
	
	{
		System.out.println("  ID   |"+"   Name     |"+"    Salary    ");
		System.out.println("--------"+"-------------"+"--------------");
		for(int x =0; x<empid.length;x++)
		{
			System.out.println("  "+empid[x]+"  |"+"   "+empname[x]+"    |"+"   "+empsalary[x]);
		}
	}

	public static void display(String[] empid,String[] empname)
	
	{
		System.out.println("  ID   |"+"   Name     ");
		System.out.println("--------"+"------------");
		for(int x =0; x<empid.length;x++)
		{
			System.out.println("  "+empid[x]+"  |"+"   "+empname[x]+"    ");
		}
	}
   public static void display(String name,String[] empid,String[] empname, int[] empsalary)
	
	{
	   for(int i=0;i<empid.length;i++)
	   {
		   
		   if(name.equalsIgnoreCase(empname[i]))
		   {
			   System.out.println("  ID   |"+"   Name     |"+"    Salary    ");
				System.out.println("--------"+"-------------"+"--------------");
			   System.out.println("  "+empid[i]+"  |"+"   "+empname[i]+"    |"+"   "+empsalary[i]);
		   }
		   			   
	   }
	   
	}

	
}
