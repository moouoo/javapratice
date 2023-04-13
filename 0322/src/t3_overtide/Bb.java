package t3_overtide;

public class Bb extends Aa{
	private double pi = 3.14;
	private int r;
	
	public Bb(int r) {
		this.r = r;
	}
	
	// 원넓이
//	public void areaCircle(int r) {
	public void areaCircle() {
		double res = r * r * pi;
		System.out.println("원넓이(r="+r+") : " + res);
	}

	public void areaCircle(int r) {
		double res = r * r * pi;
		System.out.println("원넓이(r="+r+") : " + res);
	}


}
