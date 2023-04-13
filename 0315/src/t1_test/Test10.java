package t1_test;

public class Test10 {
	public static void main(String[] args) {
		
		int cnt = 0;
		// atom이라는 레이블을 가진 for문
		atom: for(int i=1; i<=2; i++) {
			for(int j=1; j<=3; j++) {
				for(int k=1; k<=4; k++) {
					cnt++;
					System.out.println(cnt+ ".안녕");
					if(cnt == 4) break atom;
				}
			}
		}
		System.out.println("작업 끝!");
	}
}
