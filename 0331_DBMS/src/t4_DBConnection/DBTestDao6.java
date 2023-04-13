package t4_DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTestDao6 {
	Connection conn = null;

	public DBTestDao6() {
		try {
			// 1. 드라이버 검색
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("드라이버 검색 성공!!!");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:mysql://127.0.0.1:3306/javaweb";
			String user = "javaweb";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
			// System.out.println("데이터베이스 연결 성공!!!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패(JDBC) : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 검색 실패 : " + e.getMessage());
		}
	}
	
	public void dbTestMethod() {
		System.out.println("데이터베이스 연습중입니다.");
	}
	
	// conn객체 close
	public void connClose() {
		try {
			conn.close();
			System.out.println("데이터베이스가 닫혔습니다.");
		} catch (SQLException e) {}
	}

	// 전체검색..
	public void getList() {
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from test";
			ResultSet rs = stmt.executeQuery(sql); // rs객체생성
			
			System.out.println("\t\t** 주  소  록 **");
			System.out.println("=============================================");
			System.out.println("번호\t성명\t나이\t성별\t주소\t직업");
			System.out.println("---------------------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("idx") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("age") + "\t");
				System.out.print(rs.getString("gender") + "\t");
				System.out.print(rs.getString("address") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.println();
			}
			System.out.println("=============================================");
		} catch (SQLException e) {
			System.out.println("SQL오류 : " + e.getMessage());
		}
		
	}
}
