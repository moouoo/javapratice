package chap2_6;

public class T2 {
	public static void main(String[] args) {
		
		int score = 85;
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
		System.out.println(grade);
	}
}
