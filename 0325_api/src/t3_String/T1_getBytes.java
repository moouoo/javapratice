package t3_String;

import java.io.UnsupportedEncodingException;

// getBytes()메소드는 문자형식(byte)의 자료를 byte[](바이트배열)로 변환시켜준다.
public class T1_getBytes {
	public static void main(String[] args) {
		String str1 = "안녕하세요!";
		String str2 = "Hello!";
		
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str1.length());
		
		/*
		 1KByte = 1024Byte = 2^10Byte => 약 10^3Byte
		 1MByte = 2^20Byte => 10^6Byte
		 1GByte = 2^30Byte => 10^9Byte
		 1TByte = 2^40Byte => 10^12Byte
		 byte[] b2 = new byte[2048];
		 */
		
		byte[] b1 = str1.getBytes();
		System.out.println("b1의 길이 : " + b1.length);
		byte[] b2 = str2.getBytes();
		System.out.println("b2의 길이 : " + b2.length);
		
		// 인코딩/디코딩
		try {
			// EUC-KR
			byte[] b3 = str1.getBytes("EUC-KR");	// 인코딩
			System.out.println("b3 : " + b3);
			String str3 = new String(b3, "EUC-KR");		// 디코딩
			System.out.println("str3 : " + str3);

			// UTF-8 인코딩/디코딩
			byte[] b4 = str1.getBytes("UTF-8");	// 인코딩
			System.out.println("b4 : " + b4);
			String str4 = new String(b4, "UTF-8");		// 디코딩
			System.out.println("str4 : " + str4);
			
			// EUC-KR 인코딩/ UTF-8 디코딩
			byte[] b5 = str1.getBytes("EUC-KR");	// 인코딩
			System.out.println("b5 : " + b5);
			String str5 = new String(b5, "UTF-8");		// 디코딩
			System.out.println("str5 : " + str5);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
