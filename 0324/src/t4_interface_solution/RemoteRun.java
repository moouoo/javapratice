package t4_interface_solution;

import java.util.Scanner;

// TV를 켰을때 초기 볼륨은 5이다.
// "+"버튼을 누르면 볼륨이 +1씩 증가되면서 화면에 출력(단, 10이 넘어가면 메세지 출력후 볼륨은 10으로 유지)
// "-"버튼을 누르면 볼륨이 -1씩 감소되면서 화면에 출력(단, 10이 넘어가면 메세지 출력후 볼륨은 0으로 유지)
// "999"가 입력되면 전원을 끄고 프로그램이 종료된다.
public class RemoteRun {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Tv tv = new Tv();
		
		tv.switchOn();
		System.out.println("현재 TV의 볼륨은? " + tv.getVolume());
		
		String ans;
		while(true) {
			System.out.print("볼륨을 입력하세요?(+/-/종료:999) ");
			ans = scanner.next();
			if(ans.equals("999")) break;
			if(ans.equals("+")) tv.setVolume(tv.getVolume() + 1);
			else if(ans.equals("-")) tv.setVolume(tv.getVolume() - 1);
			else tv.setVolume(Integer.parseInt(ans));
		}
		tv.switchOff();
		System.out.println("작업종료~~");
		
		scanner.close();
	}

}
