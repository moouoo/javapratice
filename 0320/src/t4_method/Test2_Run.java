package t4_method;

public class Test2_Run {
	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		
		test2.mbc(50, 100);
		int res = test2.add();
		System.out.println("su1 + su2 = " + res);
		
		res = test2.sub();
		System.out.println("su1 - su2 = " + res);
		System.out.println();
		
		res = test2.hap(150, 200);
		System.out.println("res = " + res);
		
		res = test2.cha(150, 200);
		System.out.println("두수의 차 = " + res);
		
		
	}
}
