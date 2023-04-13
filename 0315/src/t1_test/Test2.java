package t1_test;

public class Test2 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i = 1; i <= 5; i++) {
			for(int j=1; j<=2; j++) {
				cnt++;
				System.out.print(cnt + "안녕\t");
			}
			System.out.println();
		}
		
		
	}
}
