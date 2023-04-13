package t1_test;

import java.util.Scanner;

//	입력되는 값은 '번호'과 '점수(0~100점)'가 입력된다.(입력의 종료는 번호가 999)
//	최대점수와 최소점수를 구하되, 배열을 사용하시오.(최대인원은 10명 이내 이다)
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] person = new int[10][2];
		int no, su, cnt=0;
		
		while(true) {
			//	입력받기
			System.out.print("번호를 입력하세요. (종료시는 999입력) ");
			no = sc.nextInt();
			if(no == 999) break;
			
			//	 점수를 입력
			while(true) {
				System.out.println("점수를 입력하시오. ");
				su = sc.nextInt();
				if(su >= 0 && su <= 100) break;
			}
			//	입력받은 자료를 person배열에 기억시킨다.
			person[cnt][0] = no;
			person[cnt][1] = su;
			cnt++;
			if(cnt == 10) break;
		}

		String[] title = {"번호(최대값)","최대값","번호(최소값)","최소값"};
		
//		int no_max, max, no_min, min;
		int[] temp = new int[4];
		
		//temp[1] = 0; -> 기본값 0 을 줌으로 굳이 안써도 상관없다.
		temp[3] = 100;
		
		//	최대 / 최소 점수 구하기
		for(int i =0; i<cnt; i++) {
			if(person[i][1] > temp[1]) {
				temp[0] = person[i][0];
				temp[1] = person[i][1]; 
			}
			if(person[i][1] < temp[3]) {
				temp[2] = person[i][0];
				temp[3] = person[i][1]; 
			}
			
		}
		
		//	출력하기
		System.out.println("번호\t점수");
		System.out.println("========================");
		for(int i =0; i<cnt; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(person[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("===================");
		System.out.println();
		
		
		//	최대값 / 최소값 출력하기
		for( int i=0; i<title.length; i++) {
		System.out.print(title[i] + "\t");
		}
		System.out.println();
		for( int i=0; i<temp.length; i++) {
			System.out.print(temp[i] + "\t");
		}
		System.out.println();
		System.out.println("=================");
		sc.close();
		
	}
}
