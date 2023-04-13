package t3_test;

import java.util.Scanner;

// 입력된 값이 홀수인지 짝수인지 판별하시오.
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int su;
		String res;
		
		System.out.print("숫자를 입력하세요 ");
		su = scanner.nextInt();
		
		if(su % 2 == 0) res = "짝수";
		else res = "홀수";
				
		System.out.println("입력하신 수 "+su+"는 "+res+"입니다.");
		
		scanner.close();
	}
}
