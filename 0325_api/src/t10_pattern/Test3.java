package t10_pattern;

import java.util.regex.Pattern;

public class Test3 {

	public static void main(String[] args) {
		
		//정규식체크 10개 연습하기
		/*
		 1. 아이디체크
		 2. 전화번호
		 3. 이메일체크
		 4. 주민번호테크
		 5. 우편번호(123-45)
		 6~10번은 임의로 지정하여 연습하기
		 */
		
		// 아이디체크
		String regMid = "^[a-z A-Z 0-9 _]*$";
	    String str1 = "0109963";
	       if (Pattern.matches(regMid, str1)) {
	           System.out.println("1. 아이디 형식이 맞습니다.");
	       } else {
            System.out.println("1. 아이디 형식이 아닙니다.");
	       }
	       System.out.println();
		
	    // 전화번호
	    String regNum = "010-[0-9]{4}-[0-9]{4}";
	    String str2 = "010-1234-4567";
	    	if (Pattern.matches(regNum, str2)) {
	    		System.out.println("2. 전화번호 형식이 맞습니다.");
	    	} else {
	           System.out.println("2. 전화번호 형식이 아닙니다.");
		    }
	    	System.out.println();
	    	
	    // 이메일체크
	    String regEmail = "\\w+@\\w+.\\w+";	//[a-z A-Z 0-9] => \\w
	    String str3 = "0109963@naver.com";
	    	if (Pattern.matches(regEmail, str3)) {
	    		System.out.println("3. 이메일 형식이 맞습니다.");
	        } else {
	            System.out.println("3. 이메일 형식이 아닙니다.");
	        }
	    	System.out.println();
	    
	    // 주민번호체크
	    String regSeNum = "[0-9]{6}-[1-4]{1}[0-9]{5}";
	    String str4 = "990103-1357638";
	    if(Pattern.matches(regSeNum, str4)) {
	    	System.out.println("4. 주민번호 형식이 맞습니다.");
	    }
	    else {
	    	System.out.println("4. 주민번호 형식이 다릅니다.");
	    }
	    System.out.println();
	    
	    
	    // 우편번호 
	    String case1 = "[0-9]{3}-[0-9]{2}";
	    String str5 ="123-12";
	    if(Pattern.matches(case1, str5)) {
	    	System.out.println("5. 우편번호 형식이 맞습니다.");
	    }
	    else {
	    	System.out.println("5. 우편번호 형식이 다릅니다.");
	    }
	    System.out.println();
	    
	    // 주소 		-> 왜 안맞지..?
	    String case2 = "^[0-9 가-힣]*&";
	    String str6 = "충청북도 청주시 서원구 1";
	    if(Pattern.matches(case2, str6)) {
	    	System.out.println("6. 주소 형식이 맞습니다.");
	    }
	    else {
	    	System.out.println("6. 주소 형식이 다릅니다.");
	    }
	    System.out.println();

	    // 지역번호
	    String case3 = "[0-9]{3}";
	    String str7 = "043";
	    if(Pattern.matches(case3, str7)) {
	    	System.out.println("7. 지역번 형식이 맞습니다.");
	    }
	    else {
	    	System.out.println("7. 지역번호 형식이 다릅니다.");
	    }
	    System.out.println();
	    
	    // 소 객체식별번호
	    String case4 = "002-[0-9]{4}-[0-9]{4}-[0-9]{1}";
	    String str8 = "002-1234-5678-9";
	    if(Pattern.matches(case4, str8)) {
	    	System.out.println("8. 개체식별번호 형식이 맞습니다.");
	    }
	    else {
	    	System.out.println("8. 개체식별번호 형식이 아닙니다.");
	    }
	    System.out.println();
	}
}
