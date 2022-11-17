package mysql_connection_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicConnectionToMysql_main {

	public static void main(String[] args) {
		try {
//			step1:add the drive
			Class.forName("com.mysql.cj.jdbc.Driver");
//			step2:add connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "0000");
//			step3:create statements and query
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from city");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5));
			}
//			step4:close the connection
			con.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}