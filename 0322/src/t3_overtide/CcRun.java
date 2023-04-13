package t3_overtide;

public class CcRun {
	public static void main(String[] args) {
		
		System.out.println("--------CcRun클래스-------------");
		
		Cc cc = new Cc(10);
		
		System.out.println("원넓이(r=10)");
		cc.areaCircle();
		
		cc.areaCircle(5);
		cc.areaCircle2(5);
	}
}
