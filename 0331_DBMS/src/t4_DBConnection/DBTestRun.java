package t4_DBConnection;

public class DBTestRun {

	public static void main(String[] args) {
		
		DBTestDao2 dao = new DBTestDao2();
		
		// DB검색(전체검색)
		dao.getlist();

		dao.connClose();
	}

}
