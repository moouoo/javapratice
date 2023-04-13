package t1;

public class Test1 {
	public static void main(String[] args) {
		byte bb;
		bb = 100;
		
		System.out.println("bb : " + bb);
		
//		byte bb2 = 128;
//		byte bb2 = -129;
		byte bb2 = -128;

		System.out.println("bb2 : " + bb2);
		
		short ss1 = 129;
		System.out.println("ss1 : " + ss1);
		
//		short ss2 = 3500;
		int ss2 = 3500;
		System.out.println("ss2 : " + ss2);
		
		int ii2 = 012; //8진수
		System.out.println("ii2 : " + ii2);
		
		int ii3 = 0xA; //16진수
		System.out.println("ii3 : " + ii3);
		
//		int ll1 = 2300000000;
		long ll1 = 2300000000L;
		System.out.println("ll1 : " + ll1);
		
	}
}
