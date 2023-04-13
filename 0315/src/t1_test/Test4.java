package t1_test;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 '단'을 입력하세요 ");
		int dan =sc.nextInt();
		
		//출력하고자 하는 단을 입력 받아서 구구단 구하기
		System.out.println("*"+dan+"단*");
		for(int i = 1; i<=9; i++) {
			System.out.println(dan + " * "+i+" = " + (dan*i));			
		}
		
		sc.close();
		
	}
}
