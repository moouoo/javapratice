package t1_array;

import java.util.Scanner;

//	우리반 학생은 총 10명이다.
//	이번에 시험을 본 학생은 5명이다.
//	5명의 시험점수를 입력받아서 배열에 저장시켜놓고, 총점과 평균을 출력하시오.
public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[10];
		int tot = 0;
		int stu_cnt = 0;
		double average = 0;
		
		
		for(int i=0; i<5; i++) {
			stu_cnt++;
			System.out.print(i+1+"번째 학생의 점수는?");
			score[i] = sc.nextInt();
			tot += score[i];
		}
		average = tot / stu_cnt;
		System.out.println("총점:"+tot+", 평균:"+average);
		
		
		sc.close();
	}
}
