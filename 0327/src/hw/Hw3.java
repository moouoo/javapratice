package hw;

public class Hw3 {

	public static void main(String[] args) {
		
		// 정규식을 사용하지 않고, 영문자만 입력되도록 체크하기.
		String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
				
		String str = "hkd1234";
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		
	}

}
