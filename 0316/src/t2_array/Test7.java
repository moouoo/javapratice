package t2_array;

import java.util.Scanner;

//	2차원배열예제
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] title = {"국어", "영어", "수학"};
		int[] jum = new int[3];
		int tot = 0;
		
		for(int i=0; i<jum.length; i++) {
			System.out.print(title[i] + "점수를 입력하시오. ");
			jum[i] = sc.nextInt();
			tot += jum[i];
		}
		double avg = (double)(tot / jum.length);
		
		System.out.println("        ** 성적표 **");
		System.out.println("=============================");
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println("\n=============================");
		for(int i=0; i<jum.length; i++) {
			System.out.print(jum[i] +"\t");			
		}
		System.out.println("\n------------------------------");
		System.out.printf("총점:%d , 평균:%.1f\n", tot, avg);
		System.out.println("\n=============================");
		
		sc.close();
	}
}
