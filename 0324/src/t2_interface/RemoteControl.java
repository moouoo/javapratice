package t2_interface;

public interface RemoteControl {
	int MAX_VOLUM = 10;	// public static final이 생략되어 있다.(컴파일시 커파일러가 자동으로 채워줌)
	int MIN_VOLUM = 0;
	
	void switchOn(String name); // public abssolute가 생략됨
	void switchOff(String name);
	
	void setVolume(int volume);
	
}
