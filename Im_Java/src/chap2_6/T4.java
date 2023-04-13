package chap2_6;

public class T4 {

	public static void main(String[] args) {
		
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		
		int totStu = 0;
		int totsum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			totStu += scores[i].length;						// 반의 학생 수 합산
			for(int j = 0; j < scores[i].length; j++) {
				totsum += scores[i][j];						// 학생 점수 합산
			}
		}
		
		double avg = (double) totsum / totStu;
		
		System.out.println(avg);
		
		

	}

}
