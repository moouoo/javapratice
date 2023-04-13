package t3_interface;

public class Aircon implements RemoteControl {

	@Override
	public void switchOn() {
		System.out.println("Aircon 전원을 켭니다.");

	}

	@Override
	public void switchOff() {
		System.out.println("Aircon 전원을 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("입력하신 온도는?? " + volume);
		if(volume > 30) {
			System.out.println("최대온도는 30입니다.");
			volume = 30;
		}
		else if(volume < 20) {
			System.out.println("최소온도는 20입니다.");
			volume = 20;
		}
			System.out.println("현재온도는 "+volume+" 입니다.");
			System.out.println();
	}

}
