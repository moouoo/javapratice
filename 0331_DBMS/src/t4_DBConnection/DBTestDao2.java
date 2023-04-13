package t4_DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTestDao2 {
	Connection conn = null;
	
	public DBTestDao2() {
		
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

	// 전체검색..
	public void getlist() {
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from test";
			ResultSet rs = stmt.executeQuery(sql);
			//rs.next();
			
			System.out.println("\t\t** 주 소 록 **");
			System.out.println("===========================================");
			System.out.println("번호\t성명\t나이\t성별\t주소\t직업");
			System.out.println("-------------------------------------------");
			int idx;
			String name;
			int age;
			String gender;
			String address;
			String job;
			
		while(rs.next()) {
			idx = rs.getInt("idx");
			name = rs.getString("name");
			age = rs.getInt("age");
			gender = rs.getString("gender");
			address = rs.getString("address");
			job = rs.getString("job");
			
			System.out.print(idx + "\t");
			System.out.print(name + "\t");
			System.out.print(age + "\t");
			System.out.print(gender + "\t");
			System.out.print(address + "\t");
			System.out.print(job + "\t");
			System.out.println();
			}
			System.out.println("===========================================");
			
		} catch (SQLException e) {
			System.out.println("sql오류: " + e.getMessage());
		}
	}
}
