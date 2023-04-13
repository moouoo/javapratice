package t3_test;

import java.util.Scanner;

// 입력된 값이 양수인지 음수인지 0인지를 판별하시오. 
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int su;
		String res;
		
		System.out.print("숫자를 입력하세요 ");
		su = scanner.nextInt();
		
		if(su > 0) res = "양수";
		else if(su < 0) res = "음수";
		else res = "0";
		
		System.out.println("입력하신 수 "+su+"는 "+res+"입니다.");

		
	scanner.close();
	}
}
