package practice;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		char sign = 0;
		int result = 0;
		
		System.out.print("숫자를 입력해주세요. ");
		a = sc.nextInt();
		System.out.print("연산를 입력해주세요. ");
		sign = sc.next().charAt(sign);
		System.out.print("숫자를 입력해주세요. ");
		b = sc.nextInt();
		
		sc.close();
		
		switch (sign) {
			case '+':
				result = a + b;
				break;
			case '-':
				result = a - b;
				break;
			case '/':
				result = a / b;
				break;
			case '*':
				result = a * b;
				break;
			case '%':
				result = a % b;
				break;
			default:
				System.out.println("등록되지않은 연산자입니다.");
				break;
		}
	
		System.out.println(a + " " + sign + " " + b + "는 " + result + "입니다.");
		
	}
}
