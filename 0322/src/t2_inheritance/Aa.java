package t2_inheritance;

public class Aa {
	public int item1 = 500;
	public int item2 = 600;
	public String name;
	
	public Aa(String name) {
		super();
		this.name = name;
		System.out.println("name = " + name);
	}
	
	public Aa(String id, String pwd) {
		System.out.println("id = "+id+" , pwd= "+ pwd);
	}
	
	//사각형의 면적
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적("+x+" , "+y+") = " + area);
	}	
}
