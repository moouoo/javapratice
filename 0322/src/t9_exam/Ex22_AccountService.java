package t9_exam;

import java.util.Scanner;

public class Ex22_AccountService {
	
	public Scanner scanner = new Scanner(System.in);
	
	// 계좌생성하기
	public void createAccount() {
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		int res = findAccount(ano);	// 중복 계좌 검색하기
		
		if(res != 100) {
			Ex22_AccountVO account = new Ex22_AccountVO(ano, owner, balance);
			Ex22_AccountRun.accountVoArray[res] = account;
		}
		else {
			System.out.println("중복된 계좌번호가 있습니다.(계좌생성실패!!");
		}
	}

	// 계좌 검색하기
	private int findAccount(String ano) {
		for(int i=0; i<Ex22_AccountRun.accountVoArray.length; i++) {
			if(Ex22_AccountRun.accountVoArray[i] != null) {
				String aNo = Ex22_AccountRun.accountVoArray[i].getAno();
				if(aNo.equals(ano)) {
					return i;	// 같은 계좌번호를 찾았다.
				}
			}
			else {
				return i;  // 같은 계좌번호를 찾지 못했다.
			}
		}
		return 100;	// 같은 계좌번호를 찾지 못했다.
	}

	// 계좌 목록 조회하기
	public void accountList() {
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
		
		for(int i=0; i<Ex22_AccountRun.accountVoArray.length; i++) {
			Ex22_AccountVO account = Ex22_AccountRun.accountVoArray[i];
			if(account != null) {
				System.out.print(account.getAno() + "\t");
				System.out.print(account.getOwner() + "\t");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	// 계좌 예금(입금) 하기
	public void deposit() {
		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int money = scanner.nextInt();
		
		int res = findAccount(ano);	// 계좌 검색 메소드 호출
		
		if(res == 100) {
			System.out.println("결과: 계좌가 없습니다.");
		}
		else {
			Ex22_AccountRun.accountVoArray[res].setBalance(Ex22_AccountRun.accountVoArray[res].getBalance() + money);
			System.out.println("결과: 입금이 성공되었습니다.");
		}
	}

  // 계좌 출금 하기
	public void withdraw() {
		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int money = scanner.nextInt();
		
		int res = findAccount(ano);	// 계좌 검색 메소드 호출
		
		if(res == 100) {
			System.out.println("결과: 계좌가 없습니다.");
		}
		else {
			Ex22_AccountRun.accountVoArray[res].setBalance(Ex22_AccountRun.accountVoArray[res].getBalance() - money);
			System.out.println("결과: 출금이 성공되었습니다.");
		}
	}

}
