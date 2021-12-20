package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class insertvalues {

	public static void main(String[] args) {
		try
		{
			Connection con=DriverManager.getConnection(conn.URL,conn.USER,conn.PASSWORD);
			java.sql.Statement stmt=con.createStatement();
		
		//class.forname("com.mysql.cj.jdbc.driver");
		stmt.executeUpdate("insert into student values(2,'krishna','thiruvallur','hari02@gmail.com')");
	}
	catch(SQLException throwables)
	{
		throwables.getStackTrace();

	}

}
}

