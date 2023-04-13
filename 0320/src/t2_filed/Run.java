package t2_filed;

//	같은 패키지안에서 사용하는 경우
public class Run {
	public static void main(String[] args) {
		System.out.println("이곳은 TestRun클래스 입니다.");
		
		Test1 t1 = new Test1();
		System.out.println("t1.su1 = " + t1.su1);
		System.out.println("t1.su2 = " + t1.su2);

		Test1 t2 = new Test1();
		System.out.println("t2.su1 = " + t2.su1);
		System.out.println("t2.su2 = " + t2.su2);
		
		t2.su2 += 50;
		System.out.println("t2.su2 = " + t2.su2);
		System.out.println();
		
		Test2 t11 = new Test2();
		System.out.println("t11 : " + t11.name);
		
		Test2 t22 = new Test2();
		System.out.println("t22 : " + t22.name);
		t22.name = "이말숙";
		System.out.println("t22 : " + t22.name);
	}
}
