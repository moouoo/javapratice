package t4;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int eng_score;
		int kor_score;
		int math_score;
		
		System.out.print("성명을 입력하세요 ");
		name = sc.next();
		System.out.print("국어점수를 입력하세요 ");
		kor_score = sc.nextInt();
		System.out.print("영어점수를 입력하세요 ");
		eng_score = sc.nextInt();
		System.out.print("수학점수를 입력하세요 ");
		math_score = sc.nextInt();
		
		int total_score = kor_score + eng_score + math_score;
		int average = total_score / 3;
		System.out.println("총점 : " + total_score);
		System.out.println("평균 : " + average);
		
		char grades;
		grades = average >= 90 ? 'A' : average >= 80 ? 'B' : average >= 70 ? 'C' : average >= 60 ? 'D' : 'F';
		System.out.println(""+name+"의 학점은 " +grades+ " 입니다.");
		
		sc.close();
	}
}
