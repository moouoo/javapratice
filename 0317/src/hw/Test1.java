package hw;

import java.util.Scanner;

//	학생 수와 각 학생들의 점수를 입력받아서 최고점수 및 평균점수를 구하여라
//  실행결과를 보고 알맞게 작성하시오
public class Test1 {
	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("전체 학생수를 입니디");
				studentNum = sc.nextInt();
				if(studentNum > 4) {
					System.out.println("전체 학생수 보다 큰 수 입니다.");
					continue;
				}
				System.out.println("학생 수: " + studentNum);
				
			}
			else if(selectNo == 2) {
				scores = new int[studentNum];
				for(int i = 0; i < scores.length; i++) {
					scores[i] = sc.nextInt();
					System.out.println(i+1 + "번의 학생의 점수: "+ scores[i]);
				}
			}
			else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
					System.out.println(i+1 + "번의 학생의 점수: "+ scores[i]);
				}
			}
			else if(selectNo == 4 ) {
				int max = 0;
				for(int i = 0; i < scores.length; i++) {
					if(scores[i] > max) max = scores[i];
				}
				int tot = 0;
				int avg;
				for(int i = 0; i < scores.length; i++) {
					tot += scores[i];
				}
				avg = tot / scores.length;
				
				System.out.println("최고 점수는 " + max);
				System.out.println("평균 점수는 " + avg);
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
		
	}
}
