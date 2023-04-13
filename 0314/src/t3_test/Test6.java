package t3_test;

import java.util.Scanner;

// 계산기 만들기
// 입력되는 값은 2개의 정수와 1개의 연산자를 입력받는다.
// 예: su1 = 10, su2 = 20, op='+'(char) "+"(String-equals)로 비교
// 이 때의 결과는 10+20 = 30으로 출력
// 입력받는 연산자는? + , - , *, / , %로 하고 다른 연산자는 프로그램 종료한다. 
public class Test6 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		char cal;
	  int res = 0;
		
		System.out.print("숫자를 입력하세요");
		a = scanner.nextInt();
		System.out.print("숫자를 입력하세요");
		b = scanner.nextInt();
		System.out.print("연산자를 입력하세요");
		cal = scanner.next().charAt(res);
		
//		if(cal == "+") res = a+b;
//		else if(cal == "-") res = a-b;
//		else if(cal == "*") res = a*b;
//		else if(cal == "/") res = a/b;
//		else if(cal == "%") res = a%b;
//		else System.out.println("프로그램 종료");
	scanner.close();
		switch(cal) {
			case '+':
				res = a+b;
				break;
			case '-':
				res = a-b;
				break;
			case '*':
				res = a*b;
				break;
			case '/':
				res = a/b;
				break;
			case '%':
				res = a%b;
				break;
			default :
				res = 'X';
		}
		
		System.out.println(a + cal + b + "=" + res);
		
	}
}
