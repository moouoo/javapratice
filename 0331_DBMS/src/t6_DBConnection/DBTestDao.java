package t6_DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTestDao {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String sql = "";

	public DBTestDao() {
		try {
			// 1. 드라이버 검색
			Class.forName("com.mysql.jdbc.Driver");
			// System.out.println("드라이버 검색 성공!!!");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:mysql://localhost:3306/javaweb";
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

	// rs객체 close
	public void rsClose() {
		if(rs != null) {
			try {
				rs.close();
				stmtClose();
			} catch (SQLException e) {}
		}
	}
	
	// stmt객체 close
	public void stmtClose() {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {}
		}
	}
	
	// conn객체 close
	public void connClose() {
		try {
			conn.close();
			System.out.println("작업 종료...");
		} catch (SQLException e) {}
	}
	
	// 전체검색..
	public void getList() {
		try {
			stmt = conn.createStatement();
			sql = "select * from test";
			rs = stmt.executeQuery(sql);
			
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
		} finally {
			rsClose();
		}
		
	}

	// 개별검색
	public int getSearch(String name) {
		int res = 0;
		try {
			stmt = conn.createStatement();
			sql = "select * from test where name='"+name+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				System.out.println("======================");
				System.out.println("고유번호 : " + rs.getInt("idx"));
				System.out.println("성명 : " + rs.getString("name"));
				System.out.println("나이 : " + rs.getInt("age"));
				System.out.println("성별 : " + rs.getString("gender"));
				System.out.println("주소 : " + rs.getString("address"));
				System.out.println("직업 : " + rs.getString("job"));
				System.out.println("======================");
				res = 1;
			}
			else {
				System.out.println("======================");
				System.out.println(name + "님은 없습니다.");
				System.out.println("======================");
				res = 0;
			}
		} catch (SQLException e) {
			System.out.println("SQL오류 : " + e.getMessage());
		} finally {
			rsClose();
		}
		return res;
	}

	// 자료 입력(추가) - 동명2인은 추가할수 없도록 처리.
	public int setInsert(DBTestVo vo) {
		int res = 0;
		try {
			
			// 동명2인 검색하기
			stmt = conn.createStatement();
		  // System.out.println("vo : " + vo);
			sql = "select * from test where name = '"+vo.getName()+"'";
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				rs.close();
				return 0;
			}
			
			sql = "insert into test values (default,'"+vo.getName()+"',"+vo.getAge()+",'"+vo.getGender()+"','"+vo.getAddress()+"','"+vo.getJob()+"')";
			stmt.executeUpdate(sql);
			res = 1;
		} catch (SQLException e) {
			System.out.println("SQL오류 : " + e.getMessage());
		} finally {
			stmtClose();
		}
		return res;
	}

	// 자료 삭제처리
	public int setDelete(String name) {
		int res = 0;
		try {
			stmt = conn.createStatement();
			
			sql = "select * from test where name = '"+name+"'";
			rs = stmt.executeQuery(sql);
			if(!rs.next()) {
				rs.close();
				res = 0;
			}
			else {			
				sql = "delete from test where name = '"+name+"'";
				stmt.executeUpdate(sql);
				res = 1;
			}
		} catch (SQLException e) {
			System.out.println("SQL오류 : " + e.getMessage());
		} finally {
			stmtClose();
		}
		return res;
	}

	// 자료 수정
	public void getUpdate(int no, String temp, String name) {
		try {
			stmt = conn.createStatement();
			if(no == 1)	sql = "update test set age = "+ Integer.parseInt(temp)+" where name = '"+name+"'";
			else if(no == 2)	sql = "update test set gender = '"+ temp+"' where name = '"+name+"'";
			else if(no == 3)	sql = "update test set address = '"+ temp+"' where name = '"+name+"'";
			else if(no == 4)	sql = "update test set job = '"+ temp+"' where name = '"+name+"'";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("SQL오류 : " + e.getMessage());
		} finally {
			stmtClose();
		}
		
	}
}
