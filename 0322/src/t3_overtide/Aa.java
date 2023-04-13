package t3_overtide;

public class Aa {
	public int x, y, z;
	
	public Aa() {
		System.out.println("이곳은 A클래스 입니다.");
	}

	public void areaRec(int x, int y) {
		this.x = x;
		this.y = y;
		int area = x * y;
		System.out.println("사각형의 면적("+x+","+y+") : " + area);
	}
	
}
