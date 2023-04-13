package t3_test;

import java.util.Scanner;

// 수를 입력받아서 입력받은 수가 2 or 3 or 5의 배수인지를 출력하시오.
// 2와 3과 5의 배수인 수는 전부 나오게 만든
public class Test3 {
	public static void main(String[] args) {
	
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. ");
		num = sc.nextInt();

		if(num % 2 ==0 && num % 3 == 0 && num % 5 == 0) {
			System.out.println("2와 3과 5의 배수입니다. ");
		}
		else if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("3과 5의 배수입니다. ");
		}
		else if(num % 2 == 0 && num % 5 == 0) {
			System.out.println("2와 5의 배수입니다. ");
		}
		else if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3의 배수입니다. ");
		}
		else if(num % 2 == 0) {
			System.out.println("2의 배수입니다. ");
		}
		else if(num % 3 == 0) {
			System.out.println("3의 배수입니다. ");
		}
		else if(num % 5 == 0) {
			System.out.println("5의 배수입니다. ");
		}
		else {
			System.out.println("2와 3과 5의 배수가 아닙니다. ");
		}
		
		sc.close();
		
		}
		
	}


