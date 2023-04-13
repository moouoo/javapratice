package t4_DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTestDao5 {
	Connection conn = null;

	public DBTestDao5() {
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

	// 전체검색..(VO객체 활용하기)
		public void getList() {
			DBTestVo vo = new DBTestVo();
			try {
				Statement stmt = conn.createStatement();
				String sql = "select * from test";
				ResultSet rs = stmt.executeQuery(sql);
				
				System.out.println("\t\t** 주  소  록 **");
				System.out.println("=============================================");
				System.out.println("번호\t성명\t나이\t성별\t주소\t직업");
				System.out.println("---------------------------------------------");
				while(rs.next()) {
					vo.setIdx(rs.getInt("idx"));
					vo.setName(rs.getString("name"));
					vo.setAge(rs.getInt("age"));
					vo.setGender(rs.getString("gender"));
					vo.setAddress(rs.getString("address"));
					vo.setJob(rs.getString("job"));
					
					System.out.print(vo.getIdx() + "\t");
					System.out.print(vo.getName() + "\t");
					System.out.print(vo.getAge() + "\t");
					System.out.print(vo.getGender() + "\t");
					System.out.print(vo.getAddress() + "\t");
					System.out.print(vo.getJob());
					System.out.println();
				}
			System.out.println("=============================================");
		} catch (SQLException e) {
			System.out.println("SQL오류 : " + e.getMessage());
		}
		
	}
}
