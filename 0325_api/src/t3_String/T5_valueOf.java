package t3_String;

public class T5_valueOf {
	public static void main(String[] args) {
		// valueOf() : ~자료형들을 문자열로 변환한다.
		int intSu = 1234;
		System.out.println("intSu : " + intSu);
		System.out.println();
		
		// String strSu = intSu;
		// String strSu = (String) intSu;
		// String strSu = intSu.toString();
		
		String strSu1 = intSu + "";
		String strSu2 = String.valueOf(intSu);
		String strSu3 = String.valueOf(1234);
		String strSu4 = String.valueOf(123.4);
		String strSu5 = String.valueOf(true);
		boolean bool1 = true;
		
		System.out.println("strSu1 : " + strSu1);
		System.out.println("strSu2 : " + strSu2);
		System.out.println("strSu3 : " + strSu3);
		System.out.println("strSu4 : " + strSu4);
		System.out.println("strSu5 : " + strSu5);
		System.out.println("bool1 : " + bool1);
		
		if(bool1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if(strSu5.equals("true")) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		int a1 = 100, a2 = 200;
		int res = a1 + a2;
		System.out.println("res = " + res);
		
		String strRes = String.valueOf(a1) + String.valueOf(a2);
		System.out.println("strRes = " + strRes);
		
	}
}
