package t2_final;

public class Test1_Run {
	public static void main(String[] args) {
		
		System.out.println("국적은? " + Test1.NATION);
		System.out.println();
		
		Test1 t1 = new Test1("123456-1234567");
		System.out.println("국적은? " + Test1.NATION);
		System.out.println("주민번호는? " + t1.jumin);
		System.out.println();
		
		Test1 t2 = new Test1("123456-1234567", "홍길동");
		System.out.println("국적은? " + Test1.NATION);
		System.out.println("주민번호는? " + t2.jumin);
		System.out.println("성명은? " + t2.name);
		System.out.println();
		
		Test1 t2_1 = new Test1("111111-1111111", "홍길동");
		System.out.println("국적은? " + Test1.NATION);
		System.out.println("주민번호는? " + t2_1.jumin);
		System.out.println("성명은? " + t2_1.name);
		System.out.println();
		// 설계도는 같지만 객체는 다르다, 그래서 오류x
		
		t2_1 = new Test1("222222-2222222", "홍길동");
		System.out.println("국적은? " + Test1.NATION);
		System.out.println("주민번호는? " + t2_1.jumin);
		System.out.println("성명은? " + t2_1.name);
		System.out.println();
		// new를 통해서 객체를 새로 생성했다, 그래서 오류x
		// 타입은 위에 같은 변수의 이름으로 선언이 되었기 때문에 메모리에 남겨져 있어
		// 그러므로 타입을 따로 적지 않아도 Test1타입을 가지고 있다
		// ex> int a = 10;
		//			a = 20; => 결과: a는 20이다
		
		Test1 t3 = new Test1("USA","223456-2234567", "김말숙");
		System.out.println("국적은? " + Test1.NATION);
		System.out.println("주민번호는? " + t3.jumin);
		System.out.println("성명은? " + t3.name);
		System.out.println();
		// 설계도가 다르다 그래서 오류x
	}
}
