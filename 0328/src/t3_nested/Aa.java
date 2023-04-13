package t3_nested;

public class Aa {
	
int suA = 100;
	
	public Aa() {
		System.out.println("이곳은 Aa클래스입니다.");
	}
	
	public void methodAa() {
		System.out.println("이곳은 Aa클래스의 methodAa()입니다.");
	}
	
	public static class Bb{
		int suB = 200;
		
		public Bb() {
			System.out.println("이곳은 Bb클래스입니다.");
		}
		public void methodBb() {
			System.out.println("이곳은 Aa클래스의 methodAa()입니다.");
		}
		
		static int suB2 = 300; // ststic블록 안이라서 static사용가능
		
		public static void methodB2() {
			System.out.println("이곳은 Bb클래스의 methodB2()입니다.");
		}
	}
	
}
