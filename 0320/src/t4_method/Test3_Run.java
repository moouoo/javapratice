package t4_method;

//	두 수를 입력받아서, 두 수의 '합/차/곱/몫/나머지'를 '계산/출력'하는 클래스를 설계하시오.
//	매서드 이용
public class Test3_Run {
	public static void main(String[] args) {
		
		Test3 test3 = new Test3();
		
		test3.input(10, 20);
		test3.add();
		test3.sub();
		test3.mul();
		test3.div();
		test3.na();
		System.out.println();
		
		test3.multi();
		
	}
}
