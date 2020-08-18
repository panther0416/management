package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			// 加载MYSQL的JDBC驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Loading Mysql Driver Success!");
			// 连接数据库
			String url = "jdbc:mysql://127.0.0.1:3306/management?useUnicode=true&characterEncoding=utf-8&useSSL=false";
			conn = DriverManager.getConnection(url, "root", "");
			System.out.println("Connecting Mysql Driver Success!");
			return conn;
			// 构建数据库执行者
//			statement = connection.createStatement();
//			statement.close();
//			conn.close();
		} catch (Exception e) {
			System.out.print("Connecting Error!");
		}
		return conn;
	}
}
