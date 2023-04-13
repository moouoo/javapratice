package t1_ifTest;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		// 선언부(변수의 선언과 초기값 할당)
		Scanner scanner = new Scanner(System.in);
				
		int a, b, c; 		// 입력을 위한 변수
		int x=0, y=0; 	// 결과 출력을 위한 변수
			
		// 입력부
		System.out.print("첫번째 수를 입력하세요? ");
		a = scanner.nextInt();
		System.out.print("두번째 수를 입력하세요? ");
		b = scanner.nextInt();
		System.out.print("세번째 수를 입력하세요? ");
		c = scanner.nextInt();

		// 처리부
		if(a > b) x = a - b;
		else if(a > c) x = a * b;
		else x = a + b;
		
		y = a / b;
		
		// 출력부
		System.out.println("x=" + x + ", y=" + y);	
		
		// 마무리(사용하지않는 객체(변수)를 메모리에서 제거시킨다.
		scanner.close();
		
	}
}
