package t1_interface;

public class Audio_Run {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Audio audio = new Audio();
		
		System.out.println("최대볼륨 : " + audio.MAX_VOLUME);
		System.out.println("최소볼륨 : " + audio.MIN_VOLUME);
		System.out.println();
		
		audio.swithOn("Audio");
		audio.swithOff();
	}

}
