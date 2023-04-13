package t1_ifTest;
//복합 논리 if문
public class Test8 {
	public static void main(String[] args) {
		// a가 b보다 크고, a가 c보다 크면 x=a+b 
		// a가 b보다 크지 않으면 x=a-b
		// a가 b보다 크고 a가 c보다 크지 않으면 x=a*b
		
		int a=10, b=20, c=30;
		int x, y;
		
		if(a > b && a > c) {
			x = a + b;
		}
		else {
			if(a <= b) {
				x = a - b;
			}
			else {
				x = a * b;
			}
		}
		y = a / b;
		System.out.println("x="+x+" , y="+y);
	}
}
