package t3_package;

import t4_package.Test2;

public class Test1_Run {
	public static void main(String[] args) {
		
		Test1 test1_t3 = new Test1();
	 	int res = test1_t3.calc(10);
	 	System.out.println("test1_t3의ㅣ 반환값 " + res);
	 	
	 	System.out.println();
	 	
	 	t4_package.Test1 test1_t4 = new t4_package.Test1();
//	 	res = test1_t4.calc(10); // 캡슐화, default 접근자에 의해서(숨겨져있음, 같은 패키지 안에서만 사용되게 하는 접근자임).
	 							//해결하기 위해서는 public을 사용
	 	res = test1_t4.calc(10.0);
	 	System.out.println("t4_package.Test1에 속해있는 test1_t4 값은 " + res);
		System.out.println();
		//import 실험
	 	Test2 test2 = new Test2();
	 	System.out.println(test2.calc(20));
	 	
	}

}
