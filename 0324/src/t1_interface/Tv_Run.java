package t1_interface;

public class Tv_Run {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		//Remote remote = new Remote();	// 인터페이스는 생성해서 사용하지 않고 항상 구현객체를 통해서 사용한다.
		
		Tv tv = new Tv();
		
		System.out.println("최대볼륨 : " + tv.MAX_VOLUME);
		System.out.println("최소볼륨 : " + tv.MIN_VOLUME);
		System.out.println();
		
		tv.swithOn();
		tv.swithOff();
		tv.swithOn("텔레비전");
	}
}
