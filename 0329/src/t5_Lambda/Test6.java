package t5_Lambda;

// 람다식을 이용하여 수의 제곱근을 구하시오.
@FunctionalInterface
interface MyFunc6 {
	int calc(int x);
}

// 원넓이를 구하시오.
@FunctionalInterface
interface MyFunc62 {
	int calc(int r);
}

@FunctionalInterface
interface MyFunc622 {
	double calc(int r);
}

public class Test6 {

	public static void main(String[] args) {
		MyFunc6 myFunc6 = (x) -> x * x;
		System.out.println("두수의 곱 : " + myFunc6.calc(5));
		
		MyFunc62 myFunc62 = (r) -> (int) (r * r * Math.PI);
		System.out.println("반지름 5인 원넓이 : " + myFunc62.calc(5));
		
		MyFunc622 myFunc622 = (r) -> r * r * Math.PI;
		System.out.println("반지름 5인 원넓이 : " + myFunc622.calc(5));
		
		
	}
	
}
