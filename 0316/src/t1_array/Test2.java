package t1_array;

public class Test2 {
	public static void main(String[] args) {
		
//		int kor, eng, mat, sco, sci, tot;
//		int[] score = null;
		
		int tot;
		
		int[] score;	// 스택메모리에 생성
		score = new int[5];	//힙 저장소로 이동 -> 참조타입이라 자동으로 최초값을 줌 int 0, double은 0.0, boolean은 false, 문자와 개체는 null
							// [5]인 이유는 밑에 과목수가 5개 이므로
							// score배열 선언과 동시에 메모리 확보 5 * 4 = 20
		
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;
		
		tot = score[0] + score[1] + score[2] + score[3] + score[4];
		System.out.println("국어:"+score[0]+",영어:"+score[1]+",수학:"+score[2]+",사회:"+score[3]+",과학:"+score[4]);
		System.out.println("총점 : " + tot);
			
	}
}
