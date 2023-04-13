package t3_constructor;

public class Test_Run {
	public static void main(String[] args) {
		
//		Test1 t1 = new Test1();
//		System.out.println("t1.name = " + t1.name);

		Test1 t22 = new Test1("김말숙");
		System.out.println("t22.name = " + t22.name);
		
		Test1 t33 = new Test1("이기자");
		System.out.println("t33.name = " + t33.name);
		
//		Test1 t11 = new Test1("홍길동");
//		System.out.println("t11.name = " + t11.name);
		
		Test1 t111 = new Test1();	
		System.out.println("t111.name = " + t111.name);
		
	}
}
