package t9_exam;

public class Ex22_AccountVO {
	private String ano;		// 계좌번호
	private String owner;	// 계좌 소유주
	private int balance;	// 저금되어 있는 금액
	
	public Ex22_AccountVO(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Ex22_AccountVO [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
}
