package t4_equlas;

//문자열 비교.....중요중요 equals 문자열 그대로 비교
public class Test1 {
	public static void main(String[] args) {
		String str1 = "서울";
		String str2 = "서울";
		String str3 = new String("서울");
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같다.");
		}
		else {
			System.out.println("str1과 str2는 다르다.");			
		}
		
		if(str1 == str3) {
			System.out.println("str1과 str3는 같다.");
		}
		else {
			System.out.println("str1과 str3는 다르다.");			
			
			
			if(str1.equals(str3)) {
				System.out.println("str1과 str3는 같다.");
			}
			else {
				System.out.println("str1과 str3는 다르다.");			
		}
	}
 }
}

