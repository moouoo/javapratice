package t3;

//삼항연산자(조건식 ? 참 : 거짓)
public class Test7 {
	public static void main(String[] args) {
		// 90이상은 A학점, 80이상은 B학점, 70이상은 C학점, 나머지는 F학점
		char res;
		int su = 65;
		
//		res = su >= 90 ? 'A' : 'B';
//		res = su >= 90 ? 'A' : (su >= 80 ? 'B' : 'F');
		res = su >= 90 ? 'A' : (su >= 80 ? 'B' : (su >=70 ? 'C' : 'F'));
		System.out.println("학점 : " + res);
		
	}
}
