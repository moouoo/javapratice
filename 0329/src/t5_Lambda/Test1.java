package t5_Lambda;

// 람다식을 구현하기 위해서는 함수형 인터페이스를 먼저 생성해 주어야한다.
// 함수형 인터페이스 : 추상메소드가 단 1개인 인터페이스를 말함.

@FunctionalInterface
interface MyFunc{
	int add(int x, int y);
//	int add2(int x, int y);
}

public class Test1 {
	public static void main(String[] args) {
		
	}
}
