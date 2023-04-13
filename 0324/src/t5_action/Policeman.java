package t5_action;

public class Policeman implements Action {

	@Override
	public void catching() {
		System.out.println("범인을 잡는다.");
	}

	@Override
	public void search() {
		System.out.println("물건(사람)을 찾습니다.");
	}

	@Override
	public void fire() {}

	@Override
	public void save() {}

	@Override
	public void pizza() {}

	@Override
	public void spagetti() {}

	@Override
	public void action(String action) {
		System.out.println("=> "+action+" 역할 ?");
		
	}

}
