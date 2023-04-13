package t2;

public class Test2 {
	
	public static void main(String[] args) {
		short ss1 = 10, ss2, ss3;
		int ii1 = 100, ii2, ii3 = 1000000;
		
		ii2 = ss1 + 200;
		System.out.println("ii2 : " + ii2);
		
//		ss2 = ii1;
		ss2 = (short) ii1;
		System.out.println("ss2 : " + ss2);
		
		ss3 = (short) ii3;
		System.out.println("ss3 : " + ss3);
		
	}
	
}
