package t1_array;

public class Test4 {
	public static void main(String[] args) {
				
		int tot = 0;
		
		String[] title = {"국어","영어","수학","사회","과학"};
		int[] score;
		score = new int[5];
				
		for(int i=0; i<5; i++) {
			score[i] = 100 - (i*10);
		}
		
		for(int i = 0; i<5; i++){
			tot = tot + score[i];
		}
		
//		System.out.println("국어:"+score[0]+",영어:"+score[1]+",수학:"+score[2]+",사회:"+score[3]+",과학:"+score[4]);

		for(int i=0; i<5; i++) {
			System.out.print(title[i]+":"+score[i]+" / ");
		}
		System.out.println();
		System.out.println("총점 : " + tot);
			
	}
}
