package hw;

public class MemberService {
	
	String id;
	int password; 
	
	boolean login(String id, int password) {
		this.id = id;
		this.password = password;	
		return true;
	}
	
	void logout(String id) {
		this.id = id;
		System.out.println("로그아웃되었습니다.");
	}
	
}
