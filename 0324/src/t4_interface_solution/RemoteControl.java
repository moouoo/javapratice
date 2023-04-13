package t4_interface_solution;

public interface RemoteControl {
	int MAX_VOLUMN = 10;
	int MIN_VOLUMN = 0;
	
	void switchOn();
	void switchOff();
	void setVolume(int volume);
}
