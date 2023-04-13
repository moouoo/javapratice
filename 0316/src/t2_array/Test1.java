package t2_array;

public class Test1 {
	public static void main(String[] args) {
		
		int[][] atom = new int[2][3];
		
		atom[0][0] = 10;
		atom[1][1] = 20;
//		atom[2][2] = 30;	new int[2][3]의 행이 2칸이지만 atom[2][3]은 행이 3칸이므로 시작이 0이니깐
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("atom["+i+"]["+j+"] = " + atom[i][j]+" / ");
			}
			System.out.println();
		}
	}
}
