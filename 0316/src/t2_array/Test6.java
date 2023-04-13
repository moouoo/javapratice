package t2_array;

import java.util.Scanner;

//	2차원배열예제
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] jum = new int[3];
		int tot = 0;
		
		for(int i=0; i<jum.length; i++) {
			System.out.print((i+1) + ".점수를 입력하시오. ");
			jum[i] = sc.nextInt();
			tot += jum[i];
		}
		double avg = (double)(tot / jum.length);
		
		for(int i=0; i<jum.length; i++) {
			System.out.print(jum[i] + " / ");			
		}
		System.out.printf("총점:%d , 평균:%.1f", tot, avg);
		
		sc.close();
	}
}
