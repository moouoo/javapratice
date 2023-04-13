package t2_array;

public class Test3 {
	public static void main(String[] args) {
		
		int[][] kbs = {{10,20,30},{40,50,60}};	// 안쪽{}이 행
												// 2행 3열
		for(int i=0; i<kbs.length; i++) {
			for(int j=0; j<kbs[0].length; j++) {
				System.out.print(kbs[i][j]+ " / ");
			}
			System.out.println();
		}
	}
}
