package kontakty.ConnectionUtils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionUtils {
	
	public static Connection dajPolaczenieMySQL() {
		
		String hostname="localhost";
		String dbName ="kontakty";
		String userName = "root";
		String rootPassword = "haslo1243"; // albo puste 
		String connectionURL = "jdbc:mysql://"+hostname+":3306/"+dbName;
		
		Connection conn = null;
		
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		
		
		
		
		 conn = DriverManager.getConnection(connectionURL,userName,rootPassword);
		
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	
	
	

}
