package t3_enum;

// enum은 메소드메모리영역에 저장되기 때문에 아무곳이나 사용가능하다.
// enum을 가져오기 위해서는 개체를 생성할 필요 없이 enum에 저장된 명.단어를 사용
public class Week_run {
	public static void main(String[] args) {
		System.out.println("월요일을 영어로? " + Week.MONDAY);
		System.out.println("토요일을 영어로? " + Week.SATURDAY);
	}
}
