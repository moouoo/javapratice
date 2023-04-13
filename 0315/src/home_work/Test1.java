package home_work;

import java.util.Scanner;

// 밑에 그림을 만들되, 중간별의 개수(홀수)를 입력받아서 별을 완성하시오
// 만약 별의 개수를 짝수로 입력할시는 큰 홀수값의 별로 완성하시오
/*
   *
  ***
 *****
*******
 *****
  ***
   *
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int su;
		int point = 1;
		int space;
		
		System.out.print("원하시는 크기의 마름모 중간 길이를 입력하십시오.");
		su = sc.nextInt();
		space = su -1;
		
		if(su % 2 == 0) {
			System.out.print("짝수를 입력하여 홀수로 자동변형시킵니다. ");
			System.out.println(su);
			su = su + 1;
			
			for( int i = 1; i <= su; i++) {
				for(int j = 1; j <= space; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j <= su; j++) {
					System.out.print("*");
				}
				for(int j = 1; j <= su; j++) {
					System.out.print(" ");
				}
				if( i < su) {
					point += 2;
					space -= 1;
				}
				else {
					point -= 2;
					space += 1;
				}
				System.out.println();
			}
		}
		else {
			for( int i = 1; i <= su; i++) {
				for(int j = 1; j <= space; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j <= point; j++) {
					System.out.print("*");
				}
				for(int j = 1; j <= space; j++) {
					System.out.print(" ");
				}
				if( i < su) {
					point += 2;
					space -= 1;
				}
				else {
					point -= 2;
					space += 1;
				}
				System.out.println();
			}
		}
		
		sc.close();
		
	}
}
