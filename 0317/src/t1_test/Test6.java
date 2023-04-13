package t1_test;

//	순위구하기(동순위 체크하기)
public class Test6 {
	public static void main(String[] args) {
		
		int[] su = {60,80,100,50,70,80};
		int[] rank = new int[su.length];
		
		//	초기값 설정
		for(int i=0; i<su.length; i++) rank[i] = 1;
		
		for(int i=0; i<su.length; i++) {
			for(int j=i+1; j<su.length; j++) {
				if(su[i] < su[j]) rank[i]++;
				else if (su[i] > su[j]) rank[j]++;
			}
		}
		
		for(int i=0; i<su.length; i++) {
			System.out.print(su[i] + "\t");
			System.out.print(rank[i]);
			System.out.println();
		}
	}
}
