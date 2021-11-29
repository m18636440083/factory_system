package com.factory.util;

import java.sql.*;

public class DBUtil {

	private static final String url = "jdbc:mysql://localhost:3306/factory_db?useSSL=false&serverTimezone=UTC";
	private static final String user = "root";
	private static final String password = "123456";
	private static final String jdbc1 = "com.mysql.jdbc.Driver";
	static {
		try {
			Class.forName(jdbc1);
			System.out.println("¼ÓÔØ£¨×¢²á£©Êý¾Ý¿â Ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,user,password);
			System.out.println("ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	public static void close(PreparedStatement ps, ResultSet rs, Connection conn) {
		if (ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
