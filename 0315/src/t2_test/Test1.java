package t2_test;

/*
 1 2 3 
 4 5 6
 7 8 9 
 */
public class Test1 {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		for(int i=1; i<=3; i++) {
			for(int j = 1; j <=3; j++) {
				cnt++;
				System.out.print(cnt+ " ");
			}
			System.out.println();
		}
		
	}
}
