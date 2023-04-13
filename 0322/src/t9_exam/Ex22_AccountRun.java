package t9_exam;

import java.util.Scanner;

public class Ex22_AccountRun {
	public static Ex22_AccountVO[] accountVoArray = new Ex22_AccountVO[100];

	public static void main(String[] args) {
		Ex22_AccountService accountService = new Ex22_AccountService();
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				accountService.createAccount();
			}
			else if(selectNo == 2) {
				accountService.accountList();
			}
			else if(selectNo == 3) {
				accountService.deposit();
			}
			else if(selectNo == 4) {
				accountService.withdraw();
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("작업끝~~~");
		
		scanner.close();
	}
	
}
