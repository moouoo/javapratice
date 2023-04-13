package t3;

// 증가(++), 감소(--)연산자
public class Test3 {
	
	public static void main(String[] args) {
		int su = 0, res = 0;
		
		res = su + 1;
		System.out.println("1.su : " +su+ ", res : " + res);
		System.out.println();
		
		res = su++;
		System.out.println("2.su : " +su+ ", res : " + res);
	}
}
