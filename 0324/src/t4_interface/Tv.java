package t4_interface;


public class Tv implements RemoteControl {
	
	public int volume = 5;
	
	@Override
	public void switchOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void switchOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("입력하신 볼륨은 " + volume);
		if(volume > MAX_VOLUM) {
			System.out.println("최대볼륨은 10입니다.");
			volume = MAX_VOLUM;
		}
		else if(volume < MIN_VOLUM) {
			System.out.println("최소볼륨은 0입니다.");
			volume = MIN_VOLUM;
		}
			System.out.println("현재볼륨은 "+volume+" 입니다.");
			System.out.println();
	}
	
}
