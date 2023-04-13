package t2_switchCase;

import java.util.Scanner;

// 입력된 값이 A이면 1등급, B면 2등급, C이면 3등급, D면 4등급, E면 5등급, 나머지는 0등급 처리
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gr;
		
		System.out.print("등급을 입력하세요 ");
		char grade = scanner.next().charAt(0);
		
		switch(grade) {
			case 'A':
			case 'a':
				gr = 1;
				break;
			case 'B':
			case 'b':
				gr = 2;
				break;
			case 'C':
			case 'c':
				gr = 3;
				break;
			case 'D':
			case 'd':
				gr = 4;
				break;
			case 'E':
			case 'e':
				gr = 5;
				break;
			default:
				gr=0;
				// break;
	}
				
		System.out.println("입력하신 등급 "+grade+"은 "+gr+"등급입니다.");
		
		scanner.close();
	}
}
