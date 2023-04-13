package t1_static;

public class Test1_Run {
	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		double area;
		
		System.out.println("pi : " + test1.pi);
		
		area = test1.circleArea(10);
		System.out.println("반지름 10인 원넓이는? " + area);
		
	}
}
