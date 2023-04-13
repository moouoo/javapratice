package t1_array;

public class Test1 {
	public static void main(String[] args) {
		
		int kor, eng, mat, sco, sci, tot;
		kor = 100;
		eng = 90;
		mat = 80;
		sco = 70;
		sci = 60;
		
		tot = kor+eng+mat+sco+sci;
		System.out.println("국어:"+kor+",영어:"+eng+",수학:"+mat+",사회:"+sco+",과학:"+sci);
		System.out.println("총점 : " + tot);
		
	}
}
