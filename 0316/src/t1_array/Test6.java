package t1_array;

public class Test6 {
	public static void main(String[] args) {
		
//		int[] intvar;
//		intvar = new int[5];
		
//		int atom;
//		System.out.println("atom : "+atom); - 기본값없어서 오류 y. int는 기본타입이라
		
		int[] intvar = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("intvar["+i+"] = " + intvar[i]);
		}
		
		for(int i=0; i<intvar.length; i++) {
			System.out.println("intvar["+i+"] = " + intvar[i]);
		}
		
	}
}
