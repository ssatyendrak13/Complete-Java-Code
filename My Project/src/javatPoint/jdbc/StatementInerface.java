package javatPoint.jdbc;
import java.sql.*;
public class StatementInerface {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/tempdb","root","Root@123");
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select id from login");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
					
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
