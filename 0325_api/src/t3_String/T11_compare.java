package t3_String;

public class T11_compare {

	public static void main(String[] args) {
		
		// compareTo() : 문자열을 사전순으로 비교한다
		// compareToIgnoreCase() : 비교시에 대소문자 구분없이 비교한다.
		
		String str1 = "Hello!";  // A아스키코드 : 65, a아스키코드 : 97
		String str2 = "Hello!";
		String str3 = "Hello";
		String str4 = "hello!";
		
		// compareTo() : 비교결과값이 같으면 '0', __'양수', __'음수'를 반환
		System.out.println("1." + str1.compareTo(str2));
		System.out.println("2." + str1.compareTo(str3));
		System.out.println("3." + str1.compareTo(str4));
		
		// compareToIgnoreCase() : 대소문자 무시해서 비교.
		System.out.println("4." + str1.compareToIgnoreCase(str4));
		System.out.println();
		
		System.out.println("5. Y와 y의 비교 " + "Y".compareTo("y"));
		System.out.println("6. Y와 y의 비교 " + "Y".compareToIgnoreCase("y"));
		
		// startWith() / endsWidth() : 접두사 / 접미사 비교? 결국전체비교면 접두사접미사 비교라고 말하기 애매하지 않나?
		String str5 = "Yahoo~ Hello!";
		String str6 = "Aahoo~ Hello!";
		System.out.println("7.startsWith() : " + str5.startsWith(str6));
		System.out.println("8.endsWith() : " + str5.endsWith(str6));
		
	}

}
