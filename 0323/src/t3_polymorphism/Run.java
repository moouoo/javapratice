package t3_polymorphism;

public class Run {
	public static void main(String[] args) {
		Aa ba = new Bb();
		Bb db = new Dd();
		Aa da = new Dd();
		System.out.println("ba.a : " + ba.a);
		//System.out.println("ba.b : " + ba.b);
		
		// 상속강제형태변환
		 Bb bb = (Bb)ba;
		 System.out.println("bb.a : " + bb.a);
		 System.out.println("bb.b : " + bb.b);
		 
		Aa ea = new Ee();
		Cc cc = (Cc)ea;
		Ee ee = (Ee)ea;
	}
}
