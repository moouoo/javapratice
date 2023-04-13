package t5_Arrays;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		int [] rank = new int[10];
		
		// 원본
		for(int i=0; i<rank.length; i++) {
			System.out.print(rank[i] + "/");
		}
		System.out.println();
		
		for(int i=0; i<rank.length; i++) {
			rank[i] = 1;
		}
		
		// 결과1
		for(int i=0; i<rank.length; i++) {
			System.out.print(rank[i] + "/");
		}
		System.out.println();
		
		// Arrays.fill();  -> 이거 놓침 먼소리인데
		Arrays.fill(rank, 2);
		
		// 결과2
		for(int i=0; i<rank.length; i++) {
			System.out.print(rank[i] + "/");
		}
		System.out.println();
		
		
	}

}
