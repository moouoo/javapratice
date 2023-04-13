package t10_VO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SungjukDAO {
	Connection conn = null;
	// Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String sql = "";
	
	SungjukVO vo = null;
	
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
				pstmtClose();
			} catch (SQLException e) {}
		}
	}
	
	// stmt객체 close
	public void pstmtClose() {
		if(pstmt != null) {
			try {
				pstmt.close();
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

	// 이름으로 개별검색하기
	public SungjukVO getSearch(String name) {
		vo = new SungjukVO();
		try {
			// stmt = conn.createStatement();
			// sql = "select * from sungjuk where name = '"+name+"'";
			// rs = stmt.executeQuery(sql);
			
			sql = "select * from sungjuk where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setName(name);
				// vo.setName(rs.getString("name"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMat(rs.getInt("mat"));
				vo.setTot(rs.getInt("tot"));
				vo.setAvg(rs.getDouble("avg"));
				vo.setGrade(rs.getString("grade"));
				
				SungjukService service = new SungjukService();
				vo.setAverage(service.getAverage(vo.getGrade()));
				
				// int cnt = getCount();	// 전체 자료 건수구하는 메소드
				// vo.setCnt(cnt);
				vo.setCnt(getCount());
				
			}
			else vo = null;
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			rsClose();
		}
		return vo;
	}

	// 전체 건수를 구하는 메소드
	private int getCount() {
		int cnt = 0;
		try {
			sql = "select count(*) as cnt from sungjuk";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			rsClose();
		}
		return cnt;
	}

	// 신규자료 등록하기
	public int setInput(SungjukVO vo) {
		int res = 0;
		try {
			sql = "insert into sungjuk values (default,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getKor());
			pstmt.setInt(3, vo.getEng());
			pstmt.setInt(4, vo.getMat());
			pstmt.setInt(5, vo.getTot());
			pstmt.setDouble(6, vo.getAvg());
			pstmt.setString(7, vo.getGrade());
			pstmt.executeUpdate();
			res = 1;
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}

	// 전체 자료 조회
	public ArrayList<SungjukVO> getList() {
		ArrayList<SungjukVO> vos = new ArrayList<>();
		try {
			sql = "select * from sungjuk";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new SungjukVO();
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setKor(rs.getInt("kor"));
				vo.setEng(rs.getInt("eng"));
				vo.setMat(rs.getInt("mat"));
				vo.setTot(rs.getInt("tot"));
				vo.setAvg(rs.getDouble("avg"));
				vo.setGrade(rs.getString("grade"));
				
				vos.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			rsClose();
		}
		return vos;
	}

	// 자료 삭제하기
	public int setDelete(String name) {
		int res = 0;
		try {
			sql = "delete from sungjuk where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			res = 1;
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}

	// 자료 수정처리
	public int setUpdate(SungjukVO vo) {
		int res = 0;
		try {
			sql = "update sungjuk set kor=?,eng=?,mat=?,tot=?,avg=?,grade=? where name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getKor());
			pstmt.setInt(2, vo.getEng());
			pstmt.setInt(3, vo.getMat());
			pstmt.setInt(4, vo.getTot());
			pstmt.setDouble(5, vo.getAvg());
			pstmt.setString(6, vo.getGrade());
			pstmt.setString(7, vo.getName());
			pstmt.executeUpdate();
			res = 1;
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}
	
}
