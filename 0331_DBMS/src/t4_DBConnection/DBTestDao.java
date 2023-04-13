package t4_DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTestDao {
	Connection conn = null;
	
	public DBTestDao() {
		
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
			
			System.out.println("======================");
			System.out.println("고유번호 : " + idx);
			System.out.println("성명 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("성별 : " + gender);
			System.out.println("주소 : " + address);
			System.out.println("직업 : " + job);
			System.out.println("======================");
			}
			
		} catch (SQLException e) {
			System.out.println("sql오류: " + e.getMessage());
		}
	}
}
