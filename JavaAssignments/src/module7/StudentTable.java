package module7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Sudha Vijayakumar
 *
 * Module 7  - JDBC Assignments -
 * programs to create/insert/update/delete/select student table in the db
 */
public class StudentTable {

	public static void main(String[] args) throws Exception {

		Connection connect = ConnectionFactories.getConnection();

		Statement stmt = connect.createStatement();

		String query = "Create Table StudentData(Student_id number(5),Name varchar(20),Class number(2),Marks number(3,1),primary key(Student_id))";



		try {


			System.out.println(" **** Creating Database table Student **** ");
			stmt.execute(query);
			System.out.println("Database Table 'StudentData' created!!");


			System.out.println();
			System.out.println(" **** Inserting Data into Table StudentData **** ");
			System.out.println(insql(stmt)+ "  records inserted");
			System.out.println();
			System.out.println(" **** Updating Data in Table StudentData **** ");

			int updatesql = stmt.executeUpdate("update StudentData set Marks = 96.6 where Name = 'John'");
			System.out.println(updatesql + " record(s) updated!!");
			System.out.println();
			System.out.println(" **** Querying Data from Table StudentData **** ");
			System.out.println("------------------------------------------------");
			selectsql(stmt);

			System.out.println(" **** Deleting Data from Table StudentData **** ");

			int delsql = stmt.executeUpdate("delete from StudentData where Class = 9");
			System.out.println(delsql + " record(s) deleted!!");
			System.out.println();

			System.out.println("***** Updated StudentData table *****");
			System.out.println("--------------------------------------");

			selectsql(stmt);			

		}
		catch (Exception ex)
		{

			System.out.println("Exception Occured - " +ex.getMessage());
		}
		finally
		{

			stmt.close();
			connect.close();
		}


	}
	private static int insql(Statement stmt) throws SQLException{
		int records = stmt.executeUpdate("INSERT ALL\r\n"
				+ "into StudentData(Student_id,Name,Class,Marks) values(24,'John',7,78.8)\r\n"
				+ "into StudentData(Student_id,Name,Class,Marks) values(28,'Nancy',8,98.8)\r\n"
				+ "into StudentData(Student_id,Name,Class,Marks) values(26,'Ben',9,99.5)\r\n"
				+ "into StudentData(Student_id,Name,Class,Marks) values(74,'Thomas',6,98.8)\r\n"
				+ "into StudentData(Student_id,Name,Class,Marks) values(89,'Waltz',8,97.4)\r\n"
				+ "into StudentData(Student_id,Name,Class,Marks) values(22,'Connor',9,88.8)\r\n"
				+ "into StudentData(Student_id,Name,Class,Marks) values(56,'Tina',7,95.8)\r\n"
				+ "select * from Dual");


		return records;
	}
	public static void selectsql(Statement stmt) throws SQLException, InterruptedException {

		ResultSet result = stmt.executeQuery("Select * from StudentData Order by Class");
		System.out.println("Student_id |" + "Student Name |" +"Class |"+"Marks|");
		System.out.println("---------------------------------------------");

		while (result.next())
		{


			System.out.println(result.getInt(1)+" | "+result.getString(2) +" | "+ result.getInt(3)+" | "+result.getDouble(4)+" | " );
			Thread.sleep(500);
		}
		result.close();
	}



}
