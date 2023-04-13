package t1_exception;

public class T6_ClassNotfound {

	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("java.lang.String클래스가 없습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("클래스 작업 완료!");
		}
		System.out.println("작업끝ㄴ"); // 오류가 나와도 끝까지 진행된다.
	}

}
