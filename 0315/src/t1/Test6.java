package t1;

import java.util.Scanner;

// 미완
public class Test6 {
	public static void main(String[] args) {
		
		int su;
		int max = -99;
		int min = 99;
		int sw = 0;
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("숫자를 입력해주세요 (종료버튼: 999) ");
			su = sc.nextInt();
			if(su == 999) break;
			
			if(su > max) {
				max = su;
				if(sw == 0) {
					sw = 1;
					if(su < min) min = su;
				}
			}
			else if (su < min) min = su;
		}
		
		if(max != 0) {
			System.out.println("최대값 : "+max);
			System.out.println("최소값 : "+min);
		}
		
		System.out.println("작업끝!!");
		sc.close();
	}
}
