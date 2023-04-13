package t2_array;

import java.util.Scanner;

//	2차원배열예제
public class Test8 {
	public static void main(String[] args) {
		//선언부
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[][] jum = new int[3][4];
		String[] title = {"성명","국어","영어","수학","총점","평균"};
		
		//입력부
		for(int i=0; i<name.length; i++) {
			System.out.print("성명을 입력하세요 ");
			name[i] = sc.next();
			for(int j=0; j<jum[0].length-1; j++){
				System.out.print(title[j+1] + "점수를 입력하시오. ");
				jum[i][j] = sc.nextInt();
				jum[i][3] += jum[i][j];				
			}
		}
		
		//출력부
		System.out.println("\t\t* 성 적 표 *");
		System.out.println("=============================");
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println("\n=============================");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j=0; j<jum[0].length; j++) {
				System.out.print(jum[i][j] + "\t");
			}
			System.out.printf("%.1f.",(jum[i][3]/3.0));
			System.out.println();
		}		
		System.out.println("=============================");
		
		sc.close();
	}
}
