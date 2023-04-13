package t3_DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {
	Connection conn = null;
	
	public DBTest() {
		try {
			// 1. 드라이버 검색
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("드라이버 검색 성공!");
			// 2. DB 연결
			String url = "jdbc:mysql://localhost:3306/javaweb";
			String user = "javaweb";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println("DB연결 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패(JDBC)" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB연결실패!" + e.getMessage());
		}
	}
	
	public void dbTestMethod() {
		System.out.println("DB 연습중입니다.");
	}
	
	// conn객체 close
	public void connClose() {
		try {
			conn.close();
			System.out.println("DB가 닫혔습니다.");
		} catch (SQLException e) {}
	}
}
