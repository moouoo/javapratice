package t1_test;

public class Test3_1 {

	public static void main(String[] args) {
		//int[] m = new int[6];
		int[] m = {5,3,4,6,1,2};
		int temp;
		
		// 정렬전 출력하기
		System.out.println("# 정렬전 #");
		for(int i=0; i<6; i++) {
			System.out.print(m[i] + " / ");
		}
	  System.out.println();
		
		// 정렬처리(bubble sort)
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				if(m[j-1] > m[j]) {
					temp = m[j-1];
					m[j-1] = m[j];
					m[j] = temp;
				}
			}
		}
		
		// 정렬후 출력하기
		System.out.println("# 정렬후 #");
		for(int i=0; i<6; i++) {
			System.out.print(m[i] + " / ");
		}
		
	}
}
	

