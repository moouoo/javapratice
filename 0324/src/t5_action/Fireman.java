package t5_action;

public class Fireman implements Action {

	@Override
	public void catching() {}

	@Override
	public void search() {}

	@Override
	public void fire() {
		System.out.println("불을 끔니다.");
	}

	@Override
	public void save() {
		System.out.println("인명 구조를 합니다.");
	}

	@Override
	public void pizza() {}

	@Override
	public void spagetti() {}

	@Override
	public void action(String action) {
		System.out.println("=> "+action+" 역할 ?");;
		
	}

}
