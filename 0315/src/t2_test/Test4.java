package t2_test;

/*
 1 4 7 
 2 5 8
 3 6 9 
 */
public class Test4 {
	public static void main(String[] args) {
		
		int cnt;
		
		for(int i=1; i<=3; i++) {
			cnt = i;
			for(int j=1; j <=3; j++) {
				cnt += 3;
				System.out.print(cnt+ " ");
			}
			System.out.println();
		}
		
	}
}
