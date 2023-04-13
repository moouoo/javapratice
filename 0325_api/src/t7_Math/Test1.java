package t7_Math;

import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		
		int su1 = 100;
		int su2 = -100;
		
		// 절대값 : abs()
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		System.out.println("Math.abs(su1) : " + Math.abs(su1));
		System.out.println("Math.abs(su2) : " + Math.abs(su2));
		System.out.println();
		
		double d1 = 1234.56;
		double d2 = -1234.56;
		
		// 반올림 : round()
		System.out.println("d1 : " + d1);
		System.out.println("d1(소수 첫째 반올림) : " + (int)(d1 + 0.5));
		// 1234.56 + 0.05 = 1234.61 * 10 = (int)12346.1 = 12346 / 10 = 1234.6
		System.out.println("정수형반올림 : " + Math.round(d1));
		System.out.println("소수이하둘째반올림(소수첫째자리까지기술) : " + Math.round(d1*10) / 10.0);
		
		// 올림 : ceil()
		System.out.println("무조건 올림(ceil) : " + Math.ceil(d1));
		System.out.println("무조건 올림(ceil) : " + Math.ceil(d1*10)/10);
		
		// 내림 : floor()
		System.out.println("무조건 내림(floor) : " + Math.floor(d1));
		System.out.println("무조건 내림(floor) : " + Math.floor(d1*10)/10);
		System.out.println("무조건 내림(floor) : " + Math.floor(d1*0.1)/0.1);
		
		// 최대값 : max()
		System.out.println("d1과 d2의 최대값? " + Math.max(d1, d2));
		
		// 최소값 : min()
		System.out.println("d1과 d2의 최소값? " + Math.min(d1, d2));
		
		// Math.random()
		System.out.println("1~100사이의 난수 : " + ((int)(Math.random()*100) + 1));
		System.out.println("10~100사이의 난수 : " + ((int)(Math.random()*91) + 10));
		
		// random 클래스를 이용한 난수 발생
		Random random = new Random();
		System.out.println("0~9 : " + random.nextInt(10));
		System.out.println("1~10 : " + (random.nextInt(10)+1));
		System.out.println("5~10 : " + (random.nextInt(6)+5));	// (최종-시작+1) + 시작
		System.out.println("20~30 : " + (random.nextInt(11)+20));
	}

}
