package t5_access;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("1.t1 = " + t1.t1);
		t1.t1 = 123;
		System.out.println("2.t1 = " + t1.t1);
		t1.t2 = 222;
		System.out.println("22.t2 = " + t1.t2);
		//t1.t3 = 222;
		
		t5_access.exam.Test1 tt1 = new t5_access.exam.Test1();
		System.out.println("3.tt1 = " + tt1.t1);
		tt1.t1 = 321;
		System.out.println("4.tt1 = " + tt1.t1);
		//tt1.t2 = 333;
	}
}
