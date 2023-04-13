package t4_polymorphism;

public class Run {
	public static void main(String[] args) {
		Bb b = new Bb();
		
		System.out.println("b.b : " + b.b);
		System.out.println("b.a : " + b.a);
		System.out.println();
		
		Aa ba = b;
		//System.out.println("ba.b : " + ba.b);
		System.out.println("ba.a : " + ba.a);
		
		// 부모 매소드를 자기걸로 사용하기 위해서 강제타이변환을 사용하지않고, 
		// 부모에게 자신에게 있는 사용하고자하는 매소드를 오버라이딩(재정의를)해서 사용
		ba.methodB();
		ba.methodA(); 
		
	}
}
