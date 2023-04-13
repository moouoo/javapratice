package t2_test;

/*
 9 8 7
 6 5 4
 3 2 1 
 */
public class Test2 {
	public static void main(String[] args) {
		
		int cnt = 10;
		
		for(int i=1; i<=3; i++) {
			for(int j = 1; j <=3; j++) {
				cnt--;
				System.out.print(cnt+ " ");
			}
			System.out.println();
		}
		
	}
}
