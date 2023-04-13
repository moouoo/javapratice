package t3_String;

public class T2_charAt {
	public static void main(String[] args) {
		// 문자열자료중 특정위치의 문자값을 1개만 가져오는 메소드, 즉 String을 char로....
		//              0         1
		//              01234567890123456
		String jumin = "123456-4234567";
		char gender = jumin.charAt(7);
		
		if(gender == '2' || gender == '4') {
			System.out.println("성별이 여자입니다.");
		}
		else {
			System.out.println("성별이 남자입니다.");
		}
	}
}
