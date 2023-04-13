package t5_Lambda;

// 람다식을 구현하기 위해서는 함수형 인터페이스를 먼저 생성해 주어야한다.
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스를 말함.

@FunctionalInterface
interface MyFunc2{
	int add(int x, int y);
}

// 구현객체를 생성자 안에서 만들어서 사용한다.
public class Test2 {
	
	public Test2(int x, int y) {
		
		MyFunc2 myFunc = new MyFunc2() {		// -> 익명클래스
			
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		int res = myFunc.add(x, y);
		System.out.println("두수의 합" + res);
	}
	
	public static void main(String[] args) {
		new Test2(20, 30);
	}
}
