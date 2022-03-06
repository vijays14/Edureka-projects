package module7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import module5.StudentData;

/**
 * @author Sudha Vijayakumar
 *
 * Module 7  - JDBC Assignments - Batch processing and Transactions
 */
public class BatchAndTransaction {

	public static void main(String[] args) throws Exception{

		Connection connect = ConnectionFactories.getConnection();
		Statement st = connect.createStatement();

		connect.setAutoCommit(false);

		st.addBatch("insert into StudentData values(11,'Mary',8,93.9)");
		st.addBatch("insert into StudentData values(12,'Natosha',4,95.9)");
		st.addBatch("insert into StudentData values(13,'Gloria',5,98.9)");
		st.addBatch("insert into StudentData values(14,'Annie',6,97.9)");
		st.addBatch("insert into StudentData values(17,'Stephen',2,98.9)");
		st.addBatch("update StudentData set Class = 8 where Marks > 98.5");

		

		try
		{
			int [] rows = st.executeBatch();
			for(int row :rows)
			{
				System.out.println("No of Rows affected : " +row);
			}

			connect.commit();
			
			System.out.println("******************************");
			StudentTable.selectsql(st);

		}
		catch(Exception ex)
		{
			System.out.println("Error occured :" + ex.getMessage());
			ex.printStackTrace();

			connect.rollback();
		}
		finally
		{
			
			st.close();
			connect.close();

		}
	}

}
