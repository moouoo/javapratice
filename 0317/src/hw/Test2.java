package hw;

import java.util.Scanner;

//	성명, 국어, 영어, 수학 점수를 받아서 총점, 평균, 학점, 순위를 구하는 프로그램
/*
 			* 성 적 표 *
	=============================
	성명 국어 영어 수학 총점 평균 학점 순위
	-----------------------------
	홍길동 100 80 60 240 80.0 B  2
	길말숙 100 90 80 270 90.0 A  1
	이기자 80  60 50 190 63.3 D  3
	=============================
 */
public class Test2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] title = {" 성명","국어","영어","수학","총점"," 평균","학점","순위"};
		String[] name = {"홍길동", "김말숙", "이기자"};
		int[][] num = new int[3][4];
		double[] avg = new double[num.length];
		String[] grade = new String[3];
		int[] rank = new int[num.length];
		
		//	국어, 영어, 수학 성적 받기
		for(int i = 0; i < num.length; i++) {
			for( int j = 0; j < 3; j++) {
			System.out.print(name[i] + "의 " + title[j+1] + "점수: ");
			num[i][j] = sc.nextInt();
			}
		}
		
		//총점
		for(int i = 0; i < num.length; i++) {
			num[i][3] = num[i][0] + num[i][1] + num[i][2];
		}
		
		//	평균
		for(int i = 0; i < num.length; i++) {
			avg[i] = num[i][3] / 3;
		}
		
		// 학점
		for(int i = 0; i < avg.length; i++) {
			if(avg[i] >= 90) grade[i] = "A";
			else if(avg[i] >= 80) grade[i] = "B";
			else if(avg[i] >= 70) grade[i] = "C";
			else if(avg[i] >= 60) grade[i] = "D";
			else grade[i] = "F";
		}
		
		//순위
		for(int i = 0; i < num.length; i++) rank[i] = 1;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
				if(num[i][3] < num[j][3]) rank[i]++;
//				else if(num[i][3] > num[j][3]) rank[j]++;
			}
		}
		
		System.out.println("* 성 적 표 *");
		System.out.println("================================");
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(name[i] + " ");
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "  ");
			}
			System.out.print(avg[i] + " " + grade[i] + "   " +rank[i]);
			System.out.println();
//			System.out.print(grade[i] + " ");
//			System.out.print(rank[i]);
					
		}
		sc.close();
	}
}
