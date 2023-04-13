package bef_hw_sol;

public class Hw3_sol {

	public static void main(String[] args) {
		
		// 정규식을 사용하지 않고, 영문자만 입력되도록 체크하기.
		String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
		String str = "hkd1234";
		int sw = 0;
		
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<temp.length(); j++) {
				if(str.charAt(i) == temp.charAt(j)) {
					sw = 1;
					break;
				}
			}
			if(sw == 0) break;
			else if(i != str.length()-1) sw = 0;
		}
		if(sw == 0) {
			System.out.println("아이디를 확인하시고 다시 가입해 주세요.");
		}
		else {
			System.out.println(str + " 님 환영합니다.");
		}
	}

}
