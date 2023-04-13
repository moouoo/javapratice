package t3_polymorphism;

public class Run2 {
	public static void main(String[] args) {
		
		// 업캐스팅을 한적이 없어서 실행시 오류가 발생한다
		// 프로그램이 복잡해지면 파악하기가 어려워져 인스턴스오브를 통해서 확인해야 한다
//		Bb b = new Bb();
//		
//		Dd bd = (Dd)b;
//		System.out.println("bd.a : " + bd.a);
//		System.out.println("bd.d : " + bd.d);
//		System.out.println("bd.b : " + bd.b);
		
		// 인스턴스오브로 다운캐스팅 가능한지 확인
		Bb b = new Bb();
		if(b instanceof Dd) {
		Dd bd = (Dd)b;
		
		System.out.println("bd.a : " + bd.a);
		System.out.println("bd.d : " + bd.d);
		System.out.println("bd.b : " + bd.b);
		}
		else {
			System.out.println("타입변환실패(Dd를 Bb로 업캐스팅한 후 다운캐스팅이 가능하다");
		}
		
	}
}
