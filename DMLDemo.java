package Unit_4;

import java.sql.*;
import java.util.Scanner;

public class DMLDemo {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException c1){
			System.out.println(c1);
		}

		String url = "jdbc:mysql://localhost:3306/university";
		String user = "root";
		String password = "1Chinu2jinu";

		Connection con  = null;
		ResultSet rs = null;
		Statement stmt = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your prn, name and dept");
		int prn = sc.nextInt();
		String name = sc.next();
		String dept = sc.next();

		try {
			con = DriverManager.getConnection(url , user, password);
			System.out.println("Connection Established");

			stmt = con.createStatement();

			rs = stmt.executeQuery("select * from student");

			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}
		catch(SQLException s) {
			System.out.println(s);
		}
		finally {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}
	}
}
