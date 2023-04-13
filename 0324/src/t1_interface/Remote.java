package t1_interface;

// 인터페이스 (작업설계서)
public interface Remote {
	
	// public static final 생략가능
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// public abstract 생략가능
	public abstract void swithOn();
	void swithOff();
	
	void swithOn(String name);
	
}
