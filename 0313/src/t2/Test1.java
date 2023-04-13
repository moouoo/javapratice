package t2;

//자동타입변환
public class Test1 {
	
	public static void main(String[] args) {
		int su1 = 100;
		double su2 = 3.14;
		
//		su1 = su1 + su2;
		su2 = su1 + su2;
		System.out.println("su1 + su2 = " + (su1 + su2));
		System.out.println("su1 + su2 = " + su2);
		
		int mbc1=10, kbs1=20;
		double mbc2=1.1, kbs2=2.2;
		
		kbs1 = kbs1 + mbc1 + 100;
		System.out.println("kbs1 : " + kbs1);
		
		kbs2 = mbc2 + 100;
		System.out.println("kbs2 : " + kbs2);

//		short ss1 = 10, ss2=20, ss3;
//		int atom;
		
//		atom = ss1 + ss2;
//		System.out.println("atom : " + atom);
		
//		ss3 = atom;
		
//		char cc1 = 'A', cc2;
//		cc2 = cc1 + 1;
		int cc3 = 'A', cc4;
		cc4 = cc3 + 1;
		System.out.println("cc4 : " + cc4);
		
	}
	
}
