package t2_array;

public class Test2 {
	public static void main(String[] args) {
		
		int[][] mbc = new int[2][3];
		int cnt = 0;
		
		
		//입력
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				cnt++;
				mbc[i][j] = cnt;
			}
		}
		
		//출력
		for(int i=0; i<mbc.length; i++) {	//mbc.length 전체 행
			for(int j=0; j<mbc[0].length; j++) {	//mbc[0].length 0행의 전체 열
				cnt++;
				System.out.print("mbc["+i+"]["+j+"] = " + mbc[i][j] + " / ");
			}
			System.out.println();
		}
		System.out.println("작업끝");
	}
}
