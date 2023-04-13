package t5_protected;

import t5_protected.mbc.Bb;

public class Run {
	public static void main(String[] args) {
		
		Bb b = new Bb();
		System.out.println("b.b : " +  b.b);
		System.out.println("b.a : " +  b.a);
		b.methodB();
		b.methodA();
//		System.out.println("b.c :" + b.c); //디폴트는 같은 패키지 끼리만
//		System.out.println("b.d :" + b.d); // 프라이빗 접근 불가능. getter setter로만 가능 
//		System.out.println("b.e :" + b.e); // 상속받는 객체에서만 사용가능하다(protected)
		
	}
}
