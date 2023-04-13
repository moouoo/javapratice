package t1_ifTest;

public class Test1 {
	public static void main(String[] args) {
	
		int a= 100, b= 200;
		int x = 0, y;
	// 한줄일때만 생략가능, 위에 쓸수도 있음
		if(a > b) x = a + b;
		
		y = a / b; 
			
		System.out.println("x="+ x +" , y=" + y);
	}
}
