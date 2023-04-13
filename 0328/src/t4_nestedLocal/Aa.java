package t4_nestedLocal;

public class Aa {
	int suA = 100;
	
	public Aa() {
		System.out.println("이곳은 Aa클래스입니다.");
	}
	
	public void methodA1() {
		System.out.println("이곳은 Aa클래스의 methodA1()입니다.");
		System.out.println();
		
		class Bb {
			int suB = 700;
			
			public Bb() {
				System.out.println("이곳은 Bb클래스입니다.");
			}
			
			public void methodB() {
				System.out.println("이곳은 Bb클래스의 methodB()입니다.");
			}
		}
		
		Bb bb = new Bb();
		System.out.println("Aa객체안의 Bb객체안의 methodA1()입니다.");
		System.out.println("bb.suB : " + bb.suB);
		bb.methodB();
	}
	
	public void methodA2() {
		System.out.println("이곳은 Aa클래스의 methodA2()입니다.");
		System.out.println();
		
		class Bb {
			int suB = 900;
			
			public Bb() {
				System.out.println("이곳은 Bb클래스입니다.");
			}
			
			public void methodB() {
				System.out.println("이곳은 Bb클래스의 methodB()입니다.");
			}
		}
		
		Bb bb = new Bb();
		System.out.println("Aa객체안의 Bb객체안의 methodA2()입니다.");
		System.out.println("bb.suB : " + bb.suB);
		bb.methodB();
	}
	
	
}
