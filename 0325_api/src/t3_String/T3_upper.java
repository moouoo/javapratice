package t3_String;

public class T3_upper {
	public static void main(String[] args) {
		String str1 = "Welcome to Korea!!!";
		String str2 = "한국에 오신것을 환영합니다.";
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		System.out.println();
		
		// toUpperCase() : 영문자를 대문자로 변환
		System.out.println("str1의 영문값을 대문자로 : " + str1.toUpperCase());
		
		// toLowerCase() : 영문자를 소문자로 변환
		System.out.println("str1의 영문값을 소문자로 : " + str1.toLowerCase());
		
	}
}
