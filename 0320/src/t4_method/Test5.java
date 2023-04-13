package t4_method;

public class Test5 {
	
	int bonbong;
	int chokwa;

	public Test5(int bonbong, int chokwa) {
		this.bonbong = bonbong;
		this.chokwa = chokwa;
	}

	public int netpay() {
		int hap = bonbong + (chokwa * 50000);
		int gong = (int) (hap * 0.1);
		return bonbong + (chokwa * 50000) - gong;
	}
	
	
}
