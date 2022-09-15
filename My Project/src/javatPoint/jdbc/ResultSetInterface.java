package javatPoint.jdbc;
import java.sql.*;
public class ResultSetInterface {
	
	public static void main(String args[])throws Exception{  
		  
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/tempdb","root","Root@123");
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from login"); 
		  
		//getting the record of 3rd row  
//		rs.absolute(3);  
//		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
		  
//		con.close();  
		}

}
