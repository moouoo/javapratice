package t4_method;

//	두 수를 입력받아서, 두 수의 '합/차/곱/몫/나머지'를 계산하는 클래스를 설계하시오.
//	생성자이용
public class Test4 {
	
	int su1, su2;
	public Test4(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
//	void input(int su1, int su2) {
//		this.su1 = su1;
//		this.su2 = su2;
//	}
	
	void add() {
		System.out.println("두 수의 합: " + (su1 + su2));
	}

	void sub() {
		System.out.println("두 수의 차: " + (su1 - su2));
	}

	void mul() {
		System.out.println("두 수의 곱: " + (su1 * su2));
	}

	void div() {
		System.out.println("두 수의 몫: " + ((double)su1 / su2));
	}
	
	void na() {
		System.out.println("두 수의 나머지: " + (su1 % su2));
	}
	
	void multi() {
		add();
		sub();
		mul();
		div();
		na();
	}
}
