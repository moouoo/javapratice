package t3_String;

public class T12_getChars {

	public static void main(String[] args) {
		
		// getChars() : 문자열을 여러개의 문자(char)인 문자배열로 만들어준다.
		
		String str1 = "Hello!";
		char[] charArr = new char[str1.length()];
		System.out.println("str1 : " + str1);
		System.out.println("charArr : " + charArr);
		
		str1.getChars(0, str1.length(), charArr, 0); // 배열복사
		
		
		for(char arr : charArr) {
			System.out.print(arr + "/");
		}
		System.out.println();
		
		
	}

}
