package t6_multi_interface;

public class Actor implements Policeman, Fireman, Chef {

	@Override
	public void pizza() {
		System.out.println("피자를 만들 수 있습니다.");
	}

	@Override
	public void spagetti() {
		System.out.println("스파게티를 만들 수 있습니다.");
	}

	@Override
	public void fire() {
		System.out.println("불을 끌수 있습니다.");
	}

	@Override
	public void save() {
		System.out.println("인명구조를 있습니다.");
	}

	@Override
	public void catching() {
		System.out.println("범인을 찾을 수 있습니다.");
	}

	@Override
	public void search() {
		System.out.println("물건을 찾을 수 있습니다.");
	}

}
