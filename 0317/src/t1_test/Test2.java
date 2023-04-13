package t1_test;

public class Test2 {
	public static void main(String[] args) {
		
//		int[] m = new int[6];
		int[] m = {5, 3, 4, 6, 1, 2};
		int temp;
		
		//	정렬전
		System.out.println("# 정렬전 #");
		for(int i = 0; i < 6; i++) {
			System.out.print(m[i] + " / ");
		}
		System.out.println();
		
		//	정렬처리(selection sort)
		for(int i=1; i <= 5; i++) {
			for(int j=i+1; j<=6; j++) {
				if(m[i-1] > m[j-1]); { 
					temp = m[i-1];
					m[i-1] = m[j-1];
					m[j-1] = temp;
				}
			}
		}
		
		//	정렬후 출력
		System.out.println(" # 정렬후 #");
		for(int i = 0; i < 6; i++) {
			System.out.print(m[i] + " / ");
		}
		
	}
}
