package t4_interface;

public interface RemoteControl {
	
	int MAX_VOLUM = 10;	
	int MIN_VOLUM = 0;
	
	void switchOn(); 
	void switchOff();
	void setVolume(int volume);
	
}
