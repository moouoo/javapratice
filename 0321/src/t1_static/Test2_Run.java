package t1_static;

public class Test2_Run {
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		double area;
		
		System.out.println("1.test2.pi : " + t2.pi2);	// 올바른 예
		System.out.println("1.test2.pi : " + t2.pi);	// 바람직하지 않는 예
		area = t2.circleArea(10);						// 바람직하지 않는 예
		System.out.println("1.반지름 10인 원넓이는? " + area);
		System.out.println();
		
		System.out.println("2.test2.pi : " + Test2.pi);
		area = Test2.circleArea(10);
		System.out.println("2.반지름 10인 원넓이는? " + area);
	}
}
