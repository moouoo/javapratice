package hw;

//	위에서 작성한 Member 클래스에 생성자를 추가하려고합니다.
//	다음과 같이 Member객체를 생성할 때 name필드와 id필드를 외부에서 받은 값으로 초기화하려면 
//	생성자는 어떻게 선언야 할까?
//	
public class Member_run {
	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong", null, 0);
		System.out.println();
		Member user2 = new Member("강자바", "java", null, 0);
		
	}	
}
