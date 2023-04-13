package t1_System;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~100까지의 숫자를 입력하시오. ");
		int su = scanner.nextInt();
		
		int tot = 0;
		
		for(int i = 1; i <=100; i++) {
			tot += i;
			if(su == i) {
				//break;
				System.exit(0);
			}
		}
		System.out.println("1~"+su+"까지의 합 : " + tot);

		scanner.close();
	}
}
