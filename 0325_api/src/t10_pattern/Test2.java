package t10_pattern;

import java.util.regex.Pattern;

public class Test2 {

	public static void main(String[] args) {
		
        String str1 = "Welcome to Korea";
        String str2 = "WelcometoKorea";
        String str3 = "Welcome_to_Korea";

        // ^[]에서의 ^는 시작, [^]의 ^는 부정, []*$의 $는 끝을 의미함
        if (Pattern.matches("^[a-z]*$", str1)) {
            System.out.println("1. 영문 소문자만 존재합니다.");
        } else {
            System.out.println("1. 영문 소문자 외에 다른 문자가 존재합니다.");
        }
        System.out.println();

        if (Pattern.matches("^[A-Z]*$", str1)) {
            System.out.println("2. 영문 대문자만 존재합니다.");
        } else {
            System.out.println("2. 영문 대문자 외에 다른 문자가 존재합니다.");
        }
        System.out.println();

        if (Pattern.matches("^[a-zA-Z]*$", str2)) {
            System.out.println("3. 영문 대/소문자만 존재합니다.");
        } else {
            System.out.println("3. 영문 대/소문자 외에 다른 문자가 존재합니다.");
        }
        System.out.println();

        if (Pattern.matches("^[a-zA-Z_]*$", str3)) {
            System.out.println("4. 영문 대/소문자만와 밑줄(_)만 존재합니다.");
        } else {
            System.out.println("4. 영문 대/소문자와 밑줄(_) 외에 다른 문자가 존재합니다.");
        }
        System.out.println();


        // 문장 안에 숫자 포함 여부
        String str5 = "12345";
        if (Pattern.matches("^[0-9]*$", str5)) {
            System.out.println("5. 숫자만 존재합니다.");
        } else {
            System.out.println("5. 숫자외에 다른 문자가 존재합니다.");
        }
        System.out.println();

        // 문장 안에 한글 포함 여부
        String str6 = "홍길동";
        if (Pattern.matches("^[가-힣]*$", str6)) {
            System.out.println("6. 한글만 존재합니다.");
        } else {
            System.out.println("6. 한글외에 다른 문자가 존재합니다.");
        }
        System.out.println();

        // 전화번호 중 숫자와 '-' 포함 여부
        String str7 = "010-123-4567";
        if (Pattern.matches("^[0-9-]*$", str7)) {
            System.out.println("7. 숫자와 '-'만 존재합니다.");
        } else {
            System.out.println("7. 숫자와 '-'외의 다른 문자가 존재합니다.");
        }
        System.out.println();

        // 전화번호의 자릿수까지 체크
        // String regTel = "^[0-9-]{2,3}-[0-9]{3,4}-[0-9]{4}";
        String regTel = "010-[0-9]{3,4}-[0-9]{4}";
        String str8 = "02-123-4567";
        if (Pattern.matches(regTel, str8)) {
            System.out.println("8. 전화번호 형식이 맞습니다.");
        } else {
            System.out.println("8. 전화번호 형식이 아닙니다.");
        }
		System.out.println();
		
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
        String regEmail = "\\w+@\\w+.\\w+(.\\w)?";	//[a-z A-Z 0-9] => \\w
        String str10 = "0109963@naver.com";			//(.\\w)는 포함되도 되고 아니어도 되고
        if (Pattern.matches(regEmail, str10)) {
            System.out.println("10. 이메일 형식이 맞습니다.");
        } else {
            System.out.println("10. 이메일 형식이 아닙니다.");
        }
        System.out.println();
        
        
        //특수문자의 체크 : \\p{punct}
        String str11 = "~!@#$%^&*()_+";
        System.out.println("11.str11에 있는 특수문자를 제거 후 출력 : " + str11.replace("\\p{punct}", ""));
        System.out.println("12.str11에 있는 특수문자 제거후 출력 : " + str11.replaceAll("\\p{Punct}", ""));
        
	}

}
