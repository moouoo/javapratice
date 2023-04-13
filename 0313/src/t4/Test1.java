package t4;

import java.util.Scanner;

// Scanner 객체
public class Test1 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		String name;
		int su;
		
		System.out.print("성명을 입력하세요? ");
		name = scanner.next();
		System.out.print("점수을 입력하세요? ");
		su = scanner.nextInt();
		
		
		System.out.println("입력하신 이름은? " + name);
		System.out.println("입력하신 점수은? " + su);
		
		// 입력받은 점수가 60이상은 "합격", 미만은 "불합격" 시키시오.
		String res;
		
		res = su >= 60 ? "합격" : "불합격";
		System.out.println("당신은 "+res+"입니다.");
		
		scanner.close();
	}
}
