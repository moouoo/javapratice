package t2_nested;

public class Run {

	public static void main(String[] args) {
		
		Aa aa = new Aa();
		
		System.out.println("Aa의 suA : " + aa.suA);
		aa.methodAa();
		System.out.println();
		
		//Bb bb = new Bb(); // 독립적으로 생성할수없음
		Aa.Bb bb = aa.new Bb();
		System.out.println("Bb의 suB : " + bb.suB);
		bb.methodBb();
		
	}

}
