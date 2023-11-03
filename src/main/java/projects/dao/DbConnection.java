package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projects.exception.DbException;

public class DbConnection {
private static String HOST = "localhost";
private static String PASSWORD = "Newpassword1";
private static String USER = "projects";
private static String SCHEMA = "projects";
private static int PORT = 3306;


public static Connection getConnection() {
	String URI = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s", HOST, PORT, SCHEMA, USER, PASSWORD);
			
	Connection connection = null;
	try {
		connection = DriverManager.getConnection(URI);
		System.out.println("success");
		return connection;

	} catch (SQLException e) {
		System.out.println("failed");
		throw new DbException("UNABLE TO GET CONNECTION AT" + URI);
	}
}
}
