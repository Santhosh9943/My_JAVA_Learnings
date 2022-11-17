 package mysql_connection_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProperConnectionToMysql_main {
// JDBC driver name and database URL

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/world";

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;

//STEP 2: Register JDBC driver

		Class.forName(JDBC_DRIVER);

//STEP 3: Open a connection

		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(DB_URL, "root", "0000");

//STEP 4: Execute a query

		System.out.println("Creating statement...");
		stmt = conn.createStatement();
		String sql = "SELECT ID, Name, Population FROM city";
		ResultSet rs = stmt.executeQuery(sql);

//STEP 5: Extract data from result set
		while (rs.next()) {
//Retrieve by column name
			int id = rs.getInt("ID");
			String cname = rs.getString("Name");
			int population = rs.getInt("Population");

//Display values
			System.out.print("ID: " + id+"\t\t\t");
			System.out.print("Name: " + cname+"\t\t\t\t\t");
			System.out.println("population: " + population);
		}
//STEP 6: Clean-up environment
		rs.close();
		stmt.close();
		conn.close();
	}
}