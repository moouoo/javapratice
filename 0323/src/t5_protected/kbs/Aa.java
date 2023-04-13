package t5_protected.kbs;

public class Aa {
	public int a = 10;
	int c = 30;
	private int d = 40;
	protected int e = 50;
	
	public void methodA() {
		System.out.println("이곳은 Aa클래스의 methodA");
	}
	
	protected void methodA1() {
		System.out.println("이곳은 Aa클래스의 methodA");
	}
}
