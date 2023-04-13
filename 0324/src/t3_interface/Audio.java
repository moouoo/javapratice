package t3_interface;

public class Audio implements RemoteControl {

	@Override
	public void switchOn() {
		System.out.println("Audio 전원을 켭니다.");

	}

	@Override
	public void switchOff() {
		System.out.println("Audio 전원을 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("입력하신 볼륨은? " + volume);
		if(volume > 8) {
			System.out.println("최대볼륨은 8입니다.");
			volume = 8;
		}
		else if(volume < MIN_VOLUM) {
			System.out.println("최소볼륨은 0입니다.");
			volume = MIN_VOLUM;
		}
			System.out.println("현재볼륨은 "+volume+" 입니다.");
			System.out.println();
			

	}

}
