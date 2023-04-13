package t3_String;

public class T9_indexOf {

	public static void main(String[] args) {

//		          "012345678901234567
	String msg1 = "Welcome to Korea!!";
	String msg2 = "한국에 방문하신것을 환영합니다!!!";
	
	System.out.println("msg1 : " + msg1);
		
	// indexOf() : 찾고자하는 문자열이 있는지 체크 ->  - 있으면 '위치값(인덱스)'을 없으면 '-1'을 반환
	System.out.println("msg1에 'o'문자가 있는지 검색. " + msg1.indexOf('o'));
	System.out.println("msg1에 'o'문자가 있는지 검색. " + msg1.indexOf('O'));
	System.out.println("msg1에 'Kor'문자가 있는지 검색. " + msg1.indexOf("Kor"));
	System.out.println("msg2에 '방문'문자가 있는지 검색. " + msg2.indexOf("방문"));
	System.out.println("msg2에 ' '문자가 있는지 검색. " + msg2.indexOf(" "));
	
	// lastIndexOf()
	System.out .println("msg2에 ' '문자가 있는지 뒤에서부터 검색. " + msg2.lastIndexOf(" "));
	
	}

}
