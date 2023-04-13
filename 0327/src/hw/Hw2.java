package hw;

import java.util.regex.Pattern;
// 무결성? 검사
public class Hw2 {

	public static void main(String[] args) {
		
		// 아이디는 '영문자(대/소문자)'와 숫자와 언더바만 허용함
        String regMid = "^[a-z A-Z 0-9 _]*$";
        String str9 = "0109963";
        if (Pattern.matches(regMid, str9)) {
            System.out.println("9. 아이디 형식이 맞습니다.");
        } else {
            System.out.println("9. 아이디 형식이 아닙니다.");
        }
        System.out.println();
        
     // 이메일체크
        String regEmail = "\\w+@\\w+.\\w+";	//[a-z A-Z 0-9] => \\w
        String str10 = "0109963@naver.com";
        if (Pattern.matches(regEmail, str10)) {
            System.out.println("10. 이메일 형식이 맞습니다.");
        } else {
            System.out.println("10. 이메일 형식이 아닙니다.");
        }
		
		// 0325_api.t10.Test3에 하시오
	}

}
