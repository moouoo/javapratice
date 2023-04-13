package t4_method;

public class Test6 {
	
	void run(int gas) {
		while(true) {
			if(gas > 0) {
				System.out.println("가스 잔량이 "+gas+" 이기에 자동차는 계속 달립니다.");
				gas--;
			}
			else {
				System.out.println("가스 잔량이 "+gas+" 이기에 자동차는 멈춤니다.");
				//break;
				return;
			}
		}
	}
	
	
}
