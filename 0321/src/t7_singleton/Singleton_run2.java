package t7_singleton;

public class Singleton_run2 {
	public static void main(String[] args) {
		
		Singleton mbc = Singleton.getInstance();
		Singleton kbs = Singleton.getInstance();
		Singleton sbs = Singleton.getInstance();
		
		if(mbc == kbs) {
			System.out.println("mbc와 kbs는 서로 같은 객체를 가르키고 있습니다.");
		}
		else {
			System.out.println("mbc와 kbs는 서로 다른 객체를 가르키고 있습니다.");
		}
		if(mbc == sbs) {
			System.out.println("mbc와 sbs는 서로 같은 객체를 가르키고 있습니다.");
		}
		else {
			System.out.println("mbc와 sbs는 서로 다른 객체를 가르키고 있습니다.");
		}
	}
}
// 치느라 하나도 못들었는데.,.,? ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ

