package t3_String;

public class T4_substring {
	public static void main(String[] args) {
		//             0         1         2
		//             012345678901234567890
		String str1 = "Welcome to Korea!!!";
		String str2 = "한국에 오신것을 환영합니다.";
		
		// substring() : 지정된 문자(열)을 출력시켜준다.
		System.out.println("인덱스 3번지부터 이후의 모든 문자 출력? " + str1.substring(3));
		System.out.println("인덱스 3번지부터 이후의 모든 문자 출력? " + str2.substring(3));
		
		System.out.println("인덱스 3번지부터 이후의 모든 문자 출력? " + str2.substring(3));
		System.out.println("인덱스 11번지부터 16번지 앞의 모든 문자 출력? " + str1.substring(11,16));
		System.out.println("인덱스 '환영' 문자 출력? " + str2.substring(9,11));
		
	}
}
