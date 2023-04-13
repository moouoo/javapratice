package t1_ifTest;

import java.util.Scanner;

// 점수를 입력받아서 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 60점 이상은 D, 나머지는 F처리하시오.) 
public class Test7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int jum;
		char grade;
		//System.out.println("입력된 점수__는 __학점입니다.");
		System.out.print("점수를 입력하세요? ");
		jum = scanner.nextInt();
		
		if(jum >= 90) {
			
			grade = 'A';
		}
		else if(jum >= 80) {
			grade = 'B';
		}
		else if(jum >= 70) {
			grade = 'C';
		}
		else if(jum >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("입력된 점수"+jum+"는 "+grade+"학점입니다.");
		scanner.close();
	}
}
