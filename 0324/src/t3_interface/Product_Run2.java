package t3_interface;

public class Product_Run2 {
	public static void main(String[] args) {
		
//		RemoteControl tv = new Tv();
//		RemoteControl audio = new Audio();
//		RemoteControl aircon = new Aircon();
		
		RemoteControl[] rc = {new Tv(), new Audio(), new Aircon()};
		
		for(int i = 0; i < rc.length; i++) {
			rc[i].switchOn();
			rc[i].setVolume(5);
			rc[i].setVolume(15);
			rc[i].setVolume(-5);
			rc[i].switchOff();
			System.out.println("---------------------");
		}
		System.out.println("작업끝");
		
		
		
		/*
		tv.switchOn();
		tv.setVolume(5);
		tv.setVolume(15);
		tv.setVolume(-5);
		tv.switchOff();
		System.out.println("----------------");
	
		audio.switchOn();
		audio.setVolume(8);
		audio.setVolume(19);
		audio.setVolume(-2);
		audio.switchOff();
		System.out.println("----------------");
		
		aircon.switchOn();
		aircon.setVolume(22);
		aircon.setVolume(35);
		aircon.setVolume(18);
		aircon.switchOff();
		System.out.println("----------------");
		*/
		
	}
}
