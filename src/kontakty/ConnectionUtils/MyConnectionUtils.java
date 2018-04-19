package kontakty.ConnectionUtils;

import java.sql.Connection;

public class MyConnectionUtils {
	
	public static Connection getMyConnection() {
		
		
		return MySqlConnectionUtils.dajPolaczenieMySQL();
	}
	
	public static void closeMyConnection(Connection conn)
	{
		try {
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void myRollback(Connection conn) {
		
		try {
			conn.rollback();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args)
	{
		
	}
	
	
	

}
