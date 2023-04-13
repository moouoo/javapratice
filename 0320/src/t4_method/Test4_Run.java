package t4_method;

//	두 수를 입력받아서, 두 수의 '합/차/곱/몫/나머지'를 '계산/출력'하는 클래스를 설계하시오.
//	생성자이용
public class Test4_Run {
	public static void main(String[] args) {
		
		Test4 test4 = new Test4(10, 20);
		
		test4.add();
		test4.sub();
		test4.mul();
		test4.div();
		test4.na();
		System.out.println();
		
		test4.multi();
		
	}
}
