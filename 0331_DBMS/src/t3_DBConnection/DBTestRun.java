package t3_DBConnection;

public class DBTestRun {

	public static void main(String[] args) {
		
		System.out.println("DB 연동 시작!");
		DBTest dbTest = new DBTest();
		
		System.out.println("DB 연결 작업 중입니다.");
		dbTest.dbTestMethod();
		
		System.out.println("DB 연결 종료!");
		dbTest.connClose();
	}

}
