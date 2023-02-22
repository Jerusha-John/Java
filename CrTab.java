package JDBCprgms;

import java.sql.*;

public class CrTab {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","mca","mca");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Project");
			while(rs.next()) {
				System.out.println(rs.getString(1));
				
				
			}
			con.close();
		}
		catch(Exception e) {System.out.println(e);}

	}

}
