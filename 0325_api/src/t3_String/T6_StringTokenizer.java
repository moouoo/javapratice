package t3_String;

import java.util.StringTokenizer;

public class T6_StringTokenizer {
	public static void main(String[] args) {
		// StringTokenizer : 문자열(문자배열)을 특정문자로 분리. 이때 분리된 항목은 각각의 배열요소로 저장된다.
		
		String tel = "010-423-2704";
		
		StringTokenizer telArr= new StringTokenizer(tel, "-");
		
		while(telArr.hasMoreTokens()) {
			String st = telArr.nextToken();
			System.out.print(st + " / ");
		}
	}
	
}
