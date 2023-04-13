package chap2_6;

import java.util.Scanner;

public class T3_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.증속 | 2. 감속 | 3. 중지");
			System.out.println("-------------------------");
			System.out.print("선택: ");
			
			String Num = sc.next();
			
			if(Num.equals("1")){
				speed++;
				System.out.println("현재 속도: " + speed);
			}
			else if(Num.equals("2")) {
				speed--;
				System.out.println("현재 속도: " + speed);
			}
			else if(Num.equals("3")) {
				run = false;
			}
		}
		System.out.println("종료");

		sc.close();

	}
}
