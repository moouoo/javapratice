package t4_method;

public class Test1_run {
	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		
		System.out.println("Test1.su1 = " + test1.su1);
		System.out.println("Test1.su2 = " + test1.su2);
		System.out.println();
		
		test1.mbc();
		System.out.println("Test1.su1 = " + test1.su1);
		System.out.println("Test1.su2 = " + test1.su2);
		System.out.println();
		
		test1.mbc(3, 1);
		System.out.println("Test1.su1 = " + test1.su1);
		System.out.println("Test1.su2 = " + test1.su2);
		System.out.println();
		
		test1.kbs(5, 10);
		System.out.println("Test1.su1 = " + test1.su1);
		System.out.println("Test1.su2 = " + test1.su2);
		System.out.println();
		
	}
}
