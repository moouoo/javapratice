package t1_test;

public class Test5 {
	public static void main(String[] args) {
		
		int[] su = {60,80,100,50,70};
		int[] rank = new int[su.length];
		
		//	초기값 설정
		for(int i=0; i<su.length; i++) rank[i] = 1;
		
		for(int i=0; i<su.length; i++) {
			for(int j=i+1; j<su.length; j++) {
				if(su[i] < su[j]) rank[i]++;
				else rank[j]++;
			}
		}
		
		for(int i=0; i<su.length; i++) {
			System.out.print(su[i] + "\t");
			System.out.print(rank[i]);
			System.out.println();
		}
	}
}
