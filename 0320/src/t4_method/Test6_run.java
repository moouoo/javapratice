package t4_method;

import java.util.Scanner;
public class Test6_run {
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			Test6 test6 = new Test6();
				
			System.out.println("연료량을 입력하세요? ");
//			int gas = scanner.nextInt();
//			test6.run(gas);
				
			test6.run(scanner.nextInt());
				
			scanner.close();
		
		
	}
}
