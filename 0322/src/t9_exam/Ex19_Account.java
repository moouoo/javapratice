package t9_exam;

public class Ex19_Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance >= Ex19_Account.MIN_BALANCE && balance <= Ex19_Account.MAX_BALANCE) {
			this.balance = balance;
		}
	}
}
