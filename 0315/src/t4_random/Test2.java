package t4_random;

//	두 개의 주사위를 던져서 합을 구하는 프로그램
public class Test2 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
		int rand = (int)(Math.random()*6) + 1;
		int rand2 = (int)(Math.random()*6) + 1;
		
		System.out.println("두 개 주사위 합? " + (rand + rand2));
		}
		
	}
}
