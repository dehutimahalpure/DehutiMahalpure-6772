package JDBC;
import java.sql.*;
public class Demo
{

	public static void main(String[] args) throws SQLException
	{
		try
		{
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///student","root","12345");
			Statement st=con.createStatement();
			
			String s="create table Employee(Eid int ,Ename varchar(20),Address varchar(20))";
			 st.executeUpdate(s);
			
			
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			
		}

	}
}

