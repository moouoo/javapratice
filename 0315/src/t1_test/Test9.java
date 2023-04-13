package t1_test;

public class Test9 {
	public static void main(String[] args) {
		int cnt = 0;
		/*
		for(int i=1; i<=2; i++) {
			for(int j=1; j<=3; j++) {
				for(int k=1; k<=4; k++) {
					cnt++;
					System.out.println(cnt+ ".안녕");
				}
			}
		}
		*/
		/*
		int lcnt = 0;
		while(cnt <3) {
			cnt++;
			int lnt = 0;
			while(lnt < 5) {
				lnt++;
				lcnt++;
				System.out.println(lcnt + ".안녕");
			}
		}
		*/
		
		cnt = 0;
		int sw = 0;
		while(true) {
			for(int i=1; i<=10; i++) {
				cnt++;
				System.out.println(cnt+ ".안녕");
				if(cnt == 10) {
					sw = 1;
					break;
				}
			}
			if(sw != 0) break;
		}
		System.out.println("작업끝!");
	}
}
