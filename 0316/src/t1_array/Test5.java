package t1_array;

public class Test5 {
	public static void main(String[] args) {
				
		int tot = 0;
		
		String[] title = {"국어","영어","수학","사회","과학"};
		int[] score;
		score = new int[5];
				
		for(int i=0; i<5; i++) {
			score[i] = 100 - (i*10);
			tot = tot + score[i];
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(title[i]+":"+score[i]+" / ");
		}
		
		System.out.println();
		System.out.println("총점 : " + tot);
			
	}
}
