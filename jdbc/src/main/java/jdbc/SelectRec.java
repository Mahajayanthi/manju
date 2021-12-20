package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectRec {
	public static void main(String[] args) {
	try {
	
		Connection con=DriverManager.getConnection(conn.URL,conn.USER,conn.PASSWORD);
		Statement stmt=con.createStatement();
		{
		ResultSet rs=stmt.executeQuery("select* from student");
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String  address=rs.getString("address");
			String email=rs.getString("email");
			System.out.println(id+""+name+""+address+""+email);
			
		}
		}
	}
	
		catch(SQLException throwables)
		{
			throwables.printStackTrace();
		}
	}
}

	
	


