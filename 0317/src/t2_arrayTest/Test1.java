package t2_arrayTest;

public class Test1 {
	public static void main(String[] args) {
		
		int[] su1 = {10,20,30,40,50};
		int[] su2 = new int[5];
		
		// 원본자료
		System.out.print("원본자료 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i] + " ");
		}
		System.out.println();
		
		// 배열복사(1:1 매칭처리)
		for(int i=0; i<su1.length; i++) {
			su2[i] = su1[i];
		}
		
		// 복사된자료
		System.out.print("복사자료 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
	}
}
