package t7_test;

import java.util.Scanner;

//점수를 입력받아서 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 60점 이상은 D, 나머지는 F처리하시오.) 
// switch~ case문을 사용하여 작성하시오.
// 점수가 999가 입력되면 작업을 종료한다.
public class Test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int jum;
		char gr;
		
		while(true) {
			System.out.print("점수를 입력하세요?(종료시 999입력) ");
			jum = scanner.nextInt();
					
			if(jum == 999) break;
			
			switch(jum/10) { // 정수 정수 연산이라 정수로 나옴!!
				case 10:
				case 9:
					gr = 'A';
					break;
				case 8:
					gr = 'B';
					break;
				case 7:
					gr = 'C';
					break;
				case 6:
					gr = 'B';
					break;
				default:
					gr = 'F';
			}
			
			System.out.println("입력된 점수 "+jum+"는 "+gr+"학점 입니다.");
		}
		
		System.out.println("작업끝!");
		
		scanner.close();
	}
}
