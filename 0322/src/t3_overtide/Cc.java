package t3_overtide;

public class Cc extends Bb{

	public Cc(int r) {
		super(r);
	}
	
	//사용자정의 메소드(원넓이)
	public void areaCircle2(int r) {
		double res = r * r * Math.PI;
		System.out.println("원넓이(r="+r+") : " + res);
	}
	
	public void areaCircle(int r) {
		double res = r * r * Math.PI;
		System.out.println("원넓이(r="+r+") : " + res);
	}
	
	
	public void areaCircle3(double r) {
		double res = r * r * Math.PI;
		System.out.println("원넓이(r="+r+") : " + res);
	}
	
	@Override
	public void areaCircle() {
		// TODO Auto-generated method stub
		super.areaCircle();
	}

	@Override
	public void areaRec(int x, int y) {
		// TODO Auto-generated method stub
		super.areaRec(x, y);
	}
	
	
	
}
