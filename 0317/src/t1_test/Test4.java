package t1_test;

//	하나하나 다 비교하는 것
public class Test4 {
	public static void main(String[] args) {
		
		int[] su = {60,80,100,50,70};
		//int[] rank = {1,1,1,1,1};
		int[] rank = new int[su.length];
		
		//	초기값 설정
		for(int i=0; i<su.length; i++) rank[i] = 1;
		
		//	 순위 구하기
		for(int i=0; i<su.length; i++) {
			for(int j=0; j<su.length; j++) {
				if(su[i] < su[j]) rank[i]++;
			}
		}
		
		//출력
		for(int i =0; i<su.length; i++) {
			System.out.print(su[i] + "\t");
			System.out.print(rank[i]);
			System.out.println();
		}
		System.out.println("작업끝!");
	}
}
