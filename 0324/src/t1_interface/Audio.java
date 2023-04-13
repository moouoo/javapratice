package t1_interface;

public class Audio implements Remote {

	@Override
	public void swithOn() {
	//	System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void swithOff() {
		System.out.println("TV 전원을 끕니다.");
	}

	@Override
	public void swithOn(String name) {
		System.out.println("Audio 전원을 켭니다.");
		
	}
	
}
