package t4_polymorphism;

public class Bb extends Aa{
	public int b = 20;
	
	@Override
	public void methodB() {
		System.out.println("Bb클래스의 methodB");
	}
	
	@Override
	public void methodA() {
		System.out.println("Bb클래스의 methodA");
	}
	
}
