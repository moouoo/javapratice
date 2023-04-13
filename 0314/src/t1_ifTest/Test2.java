package t1_ifTest;

public class Test2 {
	public static void main(String[] args) {
	
		int a= 100, b= 200;
		int x = 0, y;
		
		if(a > b) {
			x = a + b;
		}
		else {
			x = a - b;
		}
		y = a / b;
				
		System.out.println("x="+ x +" , y=" + y);
	}
}
