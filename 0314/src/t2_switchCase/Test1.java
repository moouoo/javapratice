package t2_switchCase;

import java.util.Scanner;

// 입력된 값이 A이면 1등급, B면 2등급, C이면 3등급, D면 4등급, E면 5등급, 나머지는 0등급 처리
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요 ");
		char grade = scanner.next().charAt(0);
		
		if(grade == 'A') grade = '1';
		else if(grade == 'B') grade = '2';
		else if(grade == 'C') grade = '3';
		else if(grade == 'D') grade = '4';
		else if(grade == 'E') grade = '5';
		else grade = 0;
				
		System.out.println("입력하신 등급은 "+grade+"등급입니다.");
		
		scanner.close();
	}
}
