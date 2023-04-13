package hw;

//	현실셰계의 회원을 Member클래스로 모델링하려고 합니다 = 객체화하
//	회원의 데이터로는 이름, 아이디, 패스워드, 나이가 있습니다
//	이 데이터터들을 가지는 Member 클래스를 선언해보세
public class Member {
	
	String name;
	String id;
	String password;
	int age;
	
	Member(String name, String id, String password, int age){
		System.out.println("화원이름: " + name);
		System.out.println("화원 아이디: " + id);
		System.out.println("화원 패스워드: " + password);
		System.out.println("화원 나이: " + age);
	}
}
