package t3_nested;

import t3_nested.Aa.Bb;

public class Run {

	public static void main(String[] args) {
		
		Aa aa = new Aa();
		System.out.println("a객체의 suA : " + aa.suA);
		aa.methodAa();
		System.out.println();
		
		
		//Bb bb = new Bb();
		//Aa.Bb bb = aa.new Bb();
		
		Aa.Bb bb = new Aa.Bb(); //메소드메모리로 들어갔기 때문에? 클래스 명으로 사용 가능하다.
		System.out.println("B객체의 suB : " + bb.suB);
		bb.methodBb();
		bb.methodB2(); // 에러아니지만 메모리를 비효율적으로 사용하는 형태이다.
		Bb.methodB2();
		
		
	}

}
