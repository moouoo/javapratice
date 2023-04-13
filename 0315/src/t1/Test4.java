package t1;

import java.util.Scanner;


// 최솟값 출력
public class Test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su;
		int min = 999;
		
//		while 언제까지 반복할줄 모르니 무한 반복
		while(true) {
			System.out.print("수를 입력하세요?(종료:999) ");
			su = sc.nextInt();
			if(su == 999) break;
			
			if(su < min) min = su;
		}
		if(min != 0) System.out.println("최솟값 : " + min);
		
		System.out.println("작업끝!!");
		
		sc.close();
	}
}
