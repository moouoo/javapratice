package practice;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int salary = 0;
		String rank = "";
		char grade = 0;
		int over_times = 0;
		
		System.out.print("직급코드를 입력해주세요 ");
		grade = sc.next().charAt(grade);
		System.out.print("추가 근무시간을 입력하세요 ");
		over_times = sc.nextInt();
		
		switch (grade) {
			case 'b': case 'B':
				rank = "부장";
				salary = 3500000;
				break;
			case 'k': case 'K':
				rank = "과장";
				salary = 3000000;
				break;
			case 'd': case 'D':
				rank = "대리";
				salary = 2500000;
				break;
			case 's': case 'S':
				rank = "사원";
				salary = 2000000;
				break;
			default:
				System.out.println("본회사의 직원이 아닙니다");
				break;
		}
		
		sc.close();
		
		int extra_wages = over_times * 50000;
		int deduction = (int) (salary * 0.1);	// 공제액 10%
												// 0.1을 곱하니 실수형 사용 경고가 나와 정수형으로 강제변환 시켰습니다.
		int total_salary = salary + extra_wages - deduction;
		
		System.out.println(rank+"의 이번 달 실수령액은 "+total_salary+"원 입니다.");
		
	}
}
