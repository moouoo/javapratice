package t1_exception;

public class T9_throw {
	public static void main(String[] args) {
		
		try {
			findMethod();
			System.out.println("클래스파일이 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스파일이 존재하지않습니다.");
			System.out.println("오류 : " + e.getMessage());
		} finally {
			System.out.println("클래스작업 끝..");
		}
		
		System.out.println("작업종료!!");
	}

	static void findMethod() throws ClassNotFoundException {
		Class.forName("java.lang.String");
		System.out.println("findMethod() 안입니다.");
	}
	
}
