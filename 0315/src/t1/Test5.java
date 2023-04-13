package t1;

import java.util.Scanner;

// 최댓값 출력
public class Test5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int su;
		int max = 0;
		
//		while 언제까지 반복할줄 모르니 무한 반복
		while(true) {
			System.out.print("수를 입력하세요?(종료:999) ");
			su = sc.nextInt();
			if(su == 999) break;
			
			if(su > max) max = su;
		}
//		if(max != 0)을 넣어주는 이유는 처음부터 999를 입력하면 최댓값이 0으로 표기하기 때문에
//		y. max값에 0을 적었기 때문에
		if(max != 0) System.out.println("최댓값 : " + max);
		
		System.out.println("작업끝!!");
		
		sc.close();
	}
}
