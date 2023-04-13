package t2_nested;

public class Aa {
	
	int suA = 100;
	
	public Aa() {
		System.out.println("이곳은 Aa클래스입니다.");
	}
	
	public void methodAa() {
		System.out.println("이곳은 Aa클래스의 methodAa()입니다.");
	}
	
	//중첩클래스
	public class Bb{
		int suB = 200;
		
		public Bb() {
			System.out.println("이곳은 A클래스안의 Bb클래스입니다.");
		}
		
		public void methodBb() {
			System.out.println("이곳은 Aa클래스의 methodBb()입니다.");
	}
	
		//static int suB2 = 300; // 스태이틱 블록 안이 아니라서 사용불가능
		
		
	}
}
