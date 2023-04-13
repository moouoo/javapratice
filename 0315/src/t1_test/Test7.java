package t1_test;

import java.util.Scanner;

//	출력할 구구단의 첫단을 입력하여 원하는 끝단까지 출력하시오
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 단을 입력하세요 ");
		int num = sc.nextInt();
		System.out.print("끝단을 입력");
		int num2 = sc.nextInt();
		
		int s_dan, e_dan;
		if(num < num2) {
			s_dan = num;
			e_dan = num2;
		}
		else {
			s_dan = num2;
			e_dan = num;
		}
		
		for(int dan=s_dan; dan<=e_dan; dan++) {
			System.out.println("*"+dan+"단*");
			for(int i = 1; i<=9; i++) {
				System.out.println(dan+" * "+i+" = " + (dan*i));
			}
			System.out.println();
		}
		System.out.println("작업끝");
		sc.close();
	}
}
