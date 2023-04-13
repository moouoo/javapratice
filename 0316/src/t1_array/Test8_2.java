package t1_array;

import java.util.Scanner;

//	우리반 학생은 총 10명이다.
//	이번에 시험을 본 학생은 5명이다.
//	5명의 시험점수를 입력받아서 배열에 저장시켜놓고, 총점과 평균을 출력하시오.
public class Test8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[10];
		int tot = 0;
		int stu_cnt = 0;
		double average = 0;
		
		
		for(int i=0; i<score.length; i++) {
			System.out.print(i+1+"번째 학생의 점수는?(종료:-1)");
			score[i] = sc.nextInt();
			if(score[i] == -1) break;
			tot += score[i];
			stu_cnt++;
		}
		average = tot / stu_cnt;
		
		for(int i=0; i<stu_cnt; i++) {
			System.out.println("점수["+i+"] : " + score[i]);
		}
		
		System.out.println("총점:"+tot+", 평균:"+average);
		
		
		sc.close();
	}
}
