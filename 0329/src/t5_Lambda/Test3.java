package t5_Lambda;

// 람다식을 구현하기 위해서는 함수형 인터페이스를 먼저 생성해 주어야한다.
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스를 말함.

@FunctionalInterface
interface MyFunc3{
	int add(int x, int y);
}

// 2. 구현객체를 매소드 안에서 만들어서 사용해라.
public class Test3 {
	

	
	public static void main(String[] args) {
	
		MyFunc3 myFunc3 = new MyFunc3() {
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		int res = myFunc3.add(50, 100);
		System.out.println("두수의 합 : " + res);
	}
}
