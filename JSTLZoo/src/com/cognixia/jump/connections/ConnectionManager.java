package com.cognixia.jump.connections;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static Connection conn; // starts as null
	
	private static String URL = "jdbc:mysql://localhost:3306/zoo";
	private static String USERNAME = "root";
	private static String PASSWORD = "root";
	
	private static void makeConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Registered Driver");

			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("Connected.");

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static Connection getConnection() {
		

		if (conn == null) {
			makeConnection();
		}

		return conn;
		
	}
}
