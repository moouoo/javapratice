package hw;

import java.util.Scanner;

public class Hw1 {
	
	// 문장을 입력받아서 공백의 개수와 공백의 위치를 출력하시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
//		while(true) {
		System.out.println("------------------------");
		System.out.println("문장을 입력하시오 (종료는 -1) > ");
		System.out.print("------------------------");	
		String input = sc.nextLine();
		if(input.equals("-1")) {
			System.out.println("종료");
		}
		else {
			String[] inputArr = input.split(" ");
			for(int i = 0; i < inputArr.length; i++) {
					cnt++;
			}
			System.out.println("공백의 갯수: " + (int)(cnt-1));
			
			int index = input.indexOf(" ");
			
			while(index != -1) {
				System.out.println("공백의 위치: " + index);
				index = input.indexOf(" ", index + 1);
			}
		}
		sc.close();
	}
}
