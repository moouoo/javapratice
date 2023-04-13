package t1_inheritance;

public class BRun {
	public static void main(String[] args) {
		B b = new B();
			
		System.out.println("su1 : " + b.su1);
		System.out.println("item1 : " + b.item1);
		System.out.println("item2 : " + b.item2);
		System.out.print("사각형의 넓이(10. 20) : ");
		b.areaRec(10, 20);
		
		System.out.println("mbc : " + b.mbc);
		System.out.println("method() : " + b.methodD(5, 10));
		System.out.println();
		
		System.out.print("method() : ");
		b.methoB2();
	}
}
