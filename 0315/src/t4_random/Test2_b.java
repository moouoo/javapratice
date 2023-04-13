package t4_random;

//	두 개의 주사위를 던져서 합을 구하는 프로그램
public class Test2_b {
	public static void main(String[] args) {
		
		int max = 0;
		int tot;
		
		for(int i=1; i<=5; i++) {
		int rand = (int)(Math.random()*6) + 1;
		int rand2 = (int)(Math.random()*6) + 1;
		
		tot = rand + rand2;
		System.out.println("두 개 주사위 합? " + tot);
		
		if(tot > max) {
			max = tot;
		}
		}
		System.out.println("5회 시도한 두 개 주사위의 최대 합 : "+ max);
		
	}
}
