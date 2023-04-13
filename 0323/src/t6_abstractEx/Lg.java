package t6_abstractEx;

public class Lg extends Phone {

	public Lg(String name) {
		super(name + "(Lg)");
	}

	@Override
	public void function() {
		System.out.println(name + "폰의 우수한 기능은 화질이 좋습니다.");
	}

	@Override
	public void sound() {
		System.out.println(name + "폰의 전화벨소리는 따르를 따르릉~~ 입니다.");
	}
	
	public void functionLg() {
		System.out.println("이번에 새로 추가된 기능은 '심박동 측정기능' 기능입니다.");
	}
	
}
