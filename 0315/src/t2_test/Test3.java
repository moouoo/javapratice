package t2_test;

/*
 3 2 1 
 6 5 4
 9 8 7 
 */
public class Test3 {
	public static void main(String[] args) {
		
		int cnt = 4;
		
		for(int i=1; i<=3; i++) {
			for(int j = 1; j <=3; j++) {
				cnt--;
				System.out.print(cnt+ " ");
			}
			cnt += 6;
			System.out.println();
		}
		
	}
}
