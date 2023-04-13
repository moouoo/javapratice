package t2_inheritance;

public class Bb extends Aa{
	int su1 = 10;
	
	public Bb() {
		super("김바보");	//자바는 다중상속이 불가능하다
		//super("hkd1234", "1234");
		System.out.println("이곳은 Bb생성자..");
	}
	
	public void methodB() {
		System.out.println("이곳은 Bb클래스의 methodB()입니다.");
		System.out.println("su1 : " + su1);
		System.out.println("item1 : " + item1);
	}
}
