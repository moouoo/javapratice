package t3_interface;

public class Product_Run {
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.switchOn();
		tv.setVolume(5);
		tv.setVolume(15);
		tv.setVolume(-5);
		tv.switchOff();
		System.out.println("----------------");
	
		Audio audio = new Audio();
		audio.switchOn();
		audio.setVolume(8);
		audio.setVolume(19);
		audio.setVolume(-2);
		audio.switchOff();
		System.out.println("----------------");
		
		Aircon aircon = new Aircon();
		aircon.switchOn();
		aircon.setVolume(22);
		aircon.setVolume(35);
		aircon.setVolume(18);
		aircon.switchOff();
		System.out.println("----------------");
	}
}
