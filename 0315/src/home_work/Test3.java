package home_work;
// while문과 Math.random()매소드를 이용해서 두 개으 주사위를 던졌을때 나오는 눈 (눈1, 눈2)로 표시
// 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈춰

public class Test3 {
	public static void main(String[] args) {
		
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			if(num + num2 !=5) {
				System.out.println(num + ", "+ num2);
			}
			else {
				System.out.println(num + ", "+ num2);
				break;
			}
		}
		
	}
	
}
