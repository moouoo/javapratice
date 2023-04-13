package t4_interface_solution;

public class Tv implements RemoteControl {
	private int volume = 5;
	
	public int getVolume() {
		return volume;
	}
	

	@Override
	public void switchOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void switchOff() {
		System.out.println("TV 전원을 끔니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("입력하신 볼률은? " + volume);
		if(volume >= MAX_VOLUMN) {
			System.out.println("최대볼륨은 10입니다.");
			this.volume = MAX_VOLUMN;
		}
		else if(volume <= MIN_VOLUMN) {
			System.out.println("최소볼륨은 0입니다.");
			this.volume = MIN_VOLUMN;
		}
		else this.volume = volume;
		System.out.println("현재볼륨은 "+this.volume+" 입니다.");
		System.out.println();
	}

}
