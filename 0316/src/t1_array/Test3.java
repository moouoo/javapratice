package t1_array;

public class Test3 {
	public static void main(String[] args) {
		
//		int kor, eng, mat, sco, sci, tot;
//		int[] score = null;
		
		int tot = 0;
		
		int[] score;
		score = new int[5];
		
//		score[0] = 100;
//		score[1] = 90;
//		score[2] = 80;
//		score[3] = 70;
//		score[4] = 60;
		
		for(int i =0; i<5; i++) {
			score[i] = 100 - (i*10);
		}
		
		for(int i = 0; i<5; i++){
			tot = tot + score[i];
		}
		
//		tot = score[0] + score[1] + score[2] + score[3] + score[4];
		System.out.println("국어:"+score[0]+",영어:"+score[1]+",수학:"+score[2]+",사회:"+score[3]+",과학:"+score[4]);
		System.out.println("총점 : " + tot);
			
	}
}
