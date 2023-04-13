package t4_method;

import java.util.Scanner;

//	입력받는 값은 본봉과 초과시간을 입력받는다.
//	이때 초과시간당 초과수당은 50000원이다.
//	공제액은 전체 받는 금액의 10%이다.
//	실수령액을 구하시오(실수령액 = ((본종 + 초과수당) - 공제액)
//	다만, 라이브러리클래스(서비스캑체)의 메소드를 이용한다.
//	결과 출력(결과는 정수형으로 돌려받아서 main에서 출력한다. - 메소드명: netpay()
public class Test5_run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("본봉을 입력하시오 ");
		int bonbong = sc.nextInt();
		System.out.println("초과시간을 입력하시오 ");
		int chokwa =sc.nextInt();
		
//	 생성자를 이용한 방법
		Test5 test5 = new Test5(bonbong, chokwa);
		
//	결과값을 입력하세요
		int netpay = test5.netpay();
		System.out.println("본봉: " + bonbong + " 초과시간: " +chokwa+ " 실수령액: " +   netpay);
		sc.close();
	}
}
