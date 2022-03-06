package module7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactories {

	private static Connection connectionobj = null;

	public static Connection getConnection() throws Exception {
		if (connectionobj == null)
			try {
				ResourceBundle rbundle = ResourceBundle.getBundle("module7/dbConfiguration");
				
				String url = 	rbundle.getString("url");
				String username= rbundle.getString("username");
				String password = rbundle.getString("password");

				
				connectionobj = DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		return connectionobj;
	}

}
