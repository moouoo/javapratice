package t3_String;

public class T8_replace {
	public static void main(String[] args) {
		//			  "012345678901234567
		String msg1 = "Welcome to Korea!!";
		String msg2 = "한국에 방문하신것을 환영합니다!!!";
		
		System.out.println("msg1 : " + msg1);
		
		//replace() : 치환 - 특정문자(열)을 지정한 문자(열)로 모두 변경시켜준다. - 대소문자 구별
		System.out.println("o문자를 e로 치환? " + msg1.replace('o', 'e'));
		System.out.println("Korea를 찾아서 USA로 치환? " + msg1.replace("Korea", "USA"));
		System.out.println("Korea를 찾아서 USA로 치환? " + msg1.replace("korea", "USA"));
		System.out.println("'한국을'을 '미국'으로 치환? " + msg2.replace("한국", "미국"));
		System.out.println("msg1의 공백을 모두 없애시오. " + msg1.replace(" ", ""));
		System.out.println("msg2의 공백을 모두 없애시오. " + msg2.replace(" ", ""));
		
		// trim() : 공백무시(앞뒤의 공백을 제거시킨다.)
		String msg3 = "h w l l o ! ";
		String msg4 = " h w l l o ! ";
		String msg5 = " h w l l o !";
		System.out.println("7." + msg3 + msg4 + msg5);
		System.out.println("8." + msg3 + msg4.trim() + msg5); // msg4의 앞뒤 공백 제거
		System.out.println("8." + msg3.trim() + msg4.trim() + msg5.trim()); // 앞뒤 공백 제거
		
		// repeat() : 지정문자(열)을 반복하여 출력하기
		// String temp = "atom";
		// System.out.println("'atom'을 3번 반복출력하시오. " + temp.repeat(3));
		// -> 자바 11부터 가능, 지금은 버전이 8이라 실행이 안됌 ㅠ
		
	}
}
