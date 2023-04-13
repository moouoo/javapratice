package t10_pattern;

import java.util.regex.Pattern;

public class Test1 {

	public static void main(String[] args) {
		
String str1 = "1234567890a";
		
		if(Pattern.matches("[0-9]*$", str1)) {
			System.out.println("1.숫자입니다.");
		}
		else {
			System.out.println("1.숫자가 아닙니다.");
		}
		
		// 체크....
		if(Pattern.matches("^[0-9]*$", str1)) {		// ^가 대괄호 밖에 있으면 시작문자를 의미
			System.out.println("2.숫자로 시작했습니다.");
		}
		else {
			System.out.println("2.숫자로 시작하지 않았습니다.");
		}
		
		String str2 = "Welcome to Korea!";
		if(str2.matches(".*Korea.")) {
			System.out.println("3.문장안에 Korea가 존재함");
		}
		else {
			System.out.println("3.문장안에 Korea가 포함되어 있지 않다.");
		}
		
		if(str2.matches(".*[Korea].")) {
			System.out.println("4.문장안에 Korea가 존재함");
		}
		else {
			System.out.println("4.문장안에 Korea가 포함되어 있지 않다.");
		}
		
		// '-' 범위 지정시.
		//if(str2.matches(".*[A-Z].")) {
		if(str2.matches(".*[a-z].")) {
			System.out.println("5.영문 소문자 포함");
		}
		else {
			System.out.println("5.영문 소문자 불포함");
		}
		
		if(str2.matches(".*[a-zA-Z].")) {
			System.out.println("6.영문 대/소문자 포함");
		}
		else {
			System.out.println("6.영문 대/소문자 불포함");
		}
		
		if(str2.matches(".*[A-z].")) {
			System.out.println("7.영문 대/소문자 포함");
		}
		else {
			System.out.println("7.영문 대/소문자 불포함");
		}
		
		String str4 = "홍길동1";
		// 한글비교
		if(str4.matches(".*[가-힣]*.")) {
			System.out.println("8.한글포함");
		}
		else {
			System.out.println("8.한글불포함");
		}
		
		// 숫자포함여부(체크?)
		if(str4.matches(".*[0-9]*.")) {
			System.out.println("9.숫자포함");
		}
		else {
			System.out.println("9.숫자불포함");
		}
		
		
	}

}
