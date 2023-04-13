package t4_interface;

import java.util.Scanner;

// TV를 켯을때 초기 볼륨은 5이다.
// "+"버튼을 누르면 볼륨이 +1씩 증가되면서 화면에 출력된다.(단 10이 넘어가면 메세지 출력 후 볼륨 10으로 유지)
// "-"버튼을 누르면 볼륨이 -1씩 증가되면서 화면에 출력된다.(단 0이 넘어가면 메세지 출력 후 볼륨 0으로 유지)
// "999"가 입력되면 전원을 끄고 프로그램이 종료된다.
public class Remote_Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		Tv tv = new Tv();
		
		tv.switchOn();
		tv.setVolume(5);
		
		System.out.println("+: 볼륨을 높여요/ -: 볼륨은 낮춰요");
		System.out.print("높여말어? ");
		while(run) {
			String press = sc.next();
			
			System.out.println("+: 볼륨을 높여요/ -: 볼륨은 낮춰요");
			System.out.print("높여말어? ");
			System.out.println();
			
			if(press.equals("+")) {
			tv.volume++;
			System.out.println("현재볼륨은 "+tv.volume+" 입니다");
			System.out.print("높여말어? ");
			continue;
			}
			else if(press.equals("-")) {
				tv.volume--;
				System.out.println("현재볼륨은 "+tv.volume+" 입니다");
				continue;
			}
			else if(press.equals("999")){
				System.out.println("시스템을 종료합니다.");
				run = false;
			}
		}
		tv.switchOff();
		
		sc.close();
	}
}
