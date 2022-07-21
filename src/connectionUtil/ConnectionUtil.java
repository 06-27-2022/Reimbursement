package connectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtil {
	
	public static Connection getNewConnection() throws SQLException {
		
		try {
		Connection conn = DriverManager.getConnection(
				System.getenv("db_url"),
				System.getenv("db_user"),
				System.getenv("db_password")
				);
//		return conn;
		
		Statement stmt = conn.createStatement();
		ResultSet set = stmt.executeQuery("select * from employees");
			while(set.next()) {
				int id =set.getInt(1);
				String username = set.getString(2);
				String password = set.getString(3);
				
				System.out.println(id + ", " + username + ", " + password);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			}
		return null;
		
				
	}
	
}

	