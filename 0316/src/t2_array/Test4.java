package t2_array;

public class Test4 {
	public static void main(String[] args) {
		
		int[][] kbs = {
				{10,20,30},
				{-5,-10},
				{40,50,60}
			};
		
		for(int i=0; i<kbs.length; i++) {
			for(int j=0; j<kbs[i].length; j++) {
				System.out.print(kbs[i][j]+ " / ");
			}
			System.out.println();
		}
	}
}
