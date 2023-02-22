package JDBCprgms;
import java.sql.*;
public class delSQL {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","mca","mca");
			Statement stmt=con.createStatement();
			String q="delete from Emp_Proj where EmpNo='E0010'";
			stmt.executeUpdate(q);
			System.out.println("value deleted");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
