package t2_DBConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public DBConnection() {
		try {
			// 1. JDBC 드라이버 검색
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 검색 성공!!");
			
			// 2. DB 연결하기
			//DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb", "javaweb", "1234");
			String url = "jdbc:mysql://localhost:3306/javaweb";
			String user = "javaweb";
			String password = "1234";
			DriverManager.getConnection(url, user, password);
			System.out.println("DB연결 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!!" + e.getMessage());
			//e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB연결 실패" + e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("작업 끝!");
	}
}
