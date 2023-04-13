package t4_override;

public class Bb extends Aa {
	@Override
	public void method2() {
		System.out.println("이곳은 Bb클래스의 method2()입니다");
	}
	
	public void method3() {
		System.out.println("이곳은 Bb클래스의 method3()입니다");
	}
	
	public void method4() {
		super.method2();
	}
	
}
