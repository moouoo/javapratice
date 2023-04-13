package t3;

//삼항연산자(조건식 ? 참 : 거짓)을 if문으로 변경
/*
1.
 if(조건식) {
 	조건식의 내용이 참일 때 수행
 }
 
2.
 if(조건식) {
 	조건식의 내용이 참일 때 수행
 }
 elso {
 조건식의 내용이 거짓일 때 수행
 }
 */
public class Test9 {
	public static void main(String[] args) {
		// 60이상은 "합격", 60점 미만은 "불합격' 처리하시오.
		int su = 55;
		
//		res = su >= 60 ? "합격" : "불합격";
		if(su >= 60) {
			System.out.println("점수 "+ su +"점으로 합격입니다.");
		}
		else {
			System.out.println("점수 "+ su +"점으로 불합격입니다.");
		}
		
	}
}
