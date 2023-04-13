package t6_abstractEx;

public class Samsung extends Phone{

	public Samsung(String name) {
		super(name + "(삼성)");
	}

	@Override
	public void function() {
		System.out.println(name + "폰의 우수한 기능은 사진촬영기능이 있습니다.");
	}

	@Override
	public void sound() {
		System.out.println(name + "폰의 전화벨소리는 띠로링 띠로링~~ 입니다.");
	}
	
	public void functionSamsung() {
		System.out.println("이번에 새로 추가된 기능은 '만보기' 기능입니다.");
	}
}
