package t7_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SungjukDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String sql = "";
	
	
	public SungjukDAO() {
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

	// 전체조회
	public void getList() {
		try {
			stmt = conn.createStatement();
			sql = "select * from sungjuk";
			rs = stmt.executeQuery(sql);
			
			System.out.println("전체성적");
			System.out.println("==========================================");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
			System.out.println("------------------------------------------");
			while(rs.next()) {
				System.out.println(rs.getInt("idx") + "\t");
				System.out.println(rs.getString("name") + "\t");
				System.out.println(rs.getInt("kor") + "\t");
				System.out.println(rs.getInt("eng") + "\t");
				System.out.println(rs.getInt("mat") + "\t");
				System.out.println(rs.getInt("tot") + "\t");
				System.out.println(rs.getDouble("avg") + "\t");
				System.out.println(rs.getString("grade"));
				System.out.println();
				System.out.println("=======================================");
				
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			rsClose();
		}
	}

	// 개별조회
	public int getSearch(String name) {
		int res = 0;
		try {
			stmt = conn.createStatement();
			sql = "select * from sungjuk where name = '"+name+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				System.out.println("===========");
				System.out.println("번호 : " + rs.getInt("idx"));
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("국어 : " + rs.getInt("kor"));
				System.out.println("영어 : " + rs.getInt("eng"));
				System.out.println("수학 : " + rs.getInt("mat"));
				System.out.println("총점 : " + rs.getInt("tot"));
				System.out.println("평균 : " + rs.getDouble("avg"));
				System.out.println("등급 : " + rs.getString("grade"));
				res = 1;
			}
			else {
				System.out.println("=====================");
				System.out.println(name + "님은 없습니다.");
				System.out.println("=====================");
				res = 0;
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			rsClose();
		}
		return res;
	}

	// 성적입력
	public void setInsert(SungjukVO vo) {
		try {
			stmt = conn.createStatement();
			sql = "insert into Sungjuk values(default, '"+vo.getName()+"', '"+vo.getKor()+"', '"+vo.getEng()+"', '"+vo.getMat()+"', '"+vo.getTot()+"', '"+vo.getAvg()+"', '"+vo.getGrade()+"')";
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			stmtClose();
		}
	}
}
