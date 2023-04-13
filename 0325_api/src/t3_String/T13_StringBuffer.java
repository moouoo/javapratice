package t3_String;

public class T13_StringBuffer {
	public static void main(String[] args) {
		
		// StringBuffer 클래스 : immutable Class로서 한번 생성된 값을 변경할 수 없다. 
		// String : mutable(가변클래스)객체로 생성되면 그 값을 변경할 수 있다.
		String str1 = "김바보";
		String str2 = new String("김바보");
		System.out.println("1.str2 : " + str2);
		str2 += "안녕";
		System.out.println("1.str2 : " + str2);
		
		str2 = "김바보2";
		System.out.println("2.str2 : " + str2);
		str2 += "만세";
		System.out.println("2.str2 : " + str2);
		System.out.println();
		
		StringBuffer str3 = new StringBuffer("이그지");
		System.out.println("3.str3 : " + str3 );
		//str3 += "안녕";
		System.out.println("3.str3 : " + str3 );
		
		str3.append(" 만세");
		System.out.println("3.str3 : " + str3 );
		
		// capacity() : 현재 버퍼의 크기를 알아온다. 
		StringBuffer str4 = new StringBuffer();
		System.out.println("str4버퍼크기 : " + str4.capacity());
		
		// 버퍼는 그릇의 의미이지 글자 갯수의 의미는 아니다.
		str4.append("123456789012345678901234567890");
		System.out.println("4.str4 : " + str4 );
		
		// reverse() : 문자열 반전 메소드.
		str4.reverse();
		System.out.println("4.str4 : " + str4 );
		
		// delete() : StringBuffer클래스로 생성된 버퍼안의 일부 문자열을 삭제한다.
		System.out.println("5.str4 : " + str4.delete(1, 2));
		
		// insert() : StringBuffer클래스로 생성된 버퍼안의 중간에 내용을 추가한다.
		System.out.println("6.str4 : " + str4.insert(1, "9"));
		
		
	}
}
