package t1_ifTest;

public class Test5 {
	public static void main(String[] args) {
		int a= 100, b= 200, c=300;
		int x = 0, y;
		
		if(a > b) {
			if(a > c) {
					x = a - b ;
			}
			else if(a > c) {
				x = a * b ;
			}
			else {
				x = a + b;
			}
		
			y = a / b;
				
			System.out.println("x="+ x +" , y=" + y);
		}
	}
}
