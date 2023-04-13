package t3_String;

public class T10_contains {

	public static void main(String[] args) {
		
		//			  "			 1		   2
      	//			  "01234567890123456789012
		String msg1 = "Welcome to nice Korea!!";
		String msg2 = "한국에 방문하신것을 환영합니다!!!";
		
		// contains() : 문자(열)을 검색하여 있으면 true 없으면 false를 반환한다.
		System.out.println("o문자가 있는가? " + msg1.contains("o"));
		System.out.println("Kor문자가 있는가? " + msg1.contains("Kor"));
		System.out.println("kor문자가 있는가? " + msg1.contains("kor"));
		System.out.println();
		
		if(msg2.indexOf("한국") != -1) {
			System.out.println("msg2에는 '한국' 문자열이 있습니다.");
		}
		else {
			System.out.println("msg2에는 '한국' 문자열이 없습니다.");	
		}
		
		if(msg2.contains("한국")) {
			System.out.println("msg2에는 '한국' 문자열을 포함하고 있습니다.");
		}
		else {
			System.out.println("msg2에는 '한국' 문자열을 포함하고 있지 않습니다.");	
		}
	}

}
