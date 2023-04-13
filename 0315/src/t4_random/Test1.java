package t4_random;

public class Test1 {
	public static void main(String[] args) {
		
		int rand;
		double dbl_rand;
		
		dbl_rand = Math.random();
		System.out.println("dbl_rand = " + dbl_rand);
		
		//	1~10까지의 난수 생성하기
		
		//	1번: 생성난수에 곱하기 10을 한다.
		dbl_rand = Math.random()*10;
		System.out.println("1.dbl_rand = " + dbl_rand);
		
		//	2번: 1번결과를 정수화 시켜준다. 강제 castting한다.(int)
		rand = (int)(Math.random()*10);
		System.out.println("2.rand = " + rand);

		//	3번: 2번 결과에 +1 한다.
		rand = (int)(Math.random()*10) + 1;
		System.out.println("3.rand = " + rand);
		
		//	4번: 예) 1~45까지의 난수를 발생하시오.
		rand = (int)(Math.random()*45) + 1;
		System.out.println("4. 1~45까지의 난수 = " + rand);
		
		//	5번: 예) 50~100까지의 난수를 발생하시오.
		rand = (int)(Math.random()*(51)) + 50; // 51 + 50 =101 => 100까지 나온다 이렇게 해야지 = (100-49) + 50
		System.out.println("5. 50~100까지의 난수 = " + rand);
	}
}
