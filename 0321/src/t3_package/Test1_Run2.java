package t3_package;

//import t4_package.Test2;
import t4_package.*; // 패키지 안에있는 전부를 사용하겠다라는 의미
//컨트롤 쉬프트 o를 하면 이클립스에서 찾아줌 ppt 6장 import문 참고
// ---------------------------------------------------------
// 윗부분만 내용임

public class Test1_Run2 {
	public static void main(String[] args) {
		
		Test1 test1_t3 = new Test1();
	 	int res = test1_t3.calc(10);
	 	System.out.println("test1_t3의ㅣ 반환값 " + res);
	 	
	 	System.out.println();
	 	
	 	t4_package.Test1 test1_t4 = new t4_package.Test1();

	 	res = test1_t4.calc(10.0);
	 	System.out.println("t4_package.Test1에 속해있는 test1_t4 값은 " + res);
		System.out.println();
		//import 실험
	 	Test2 test2 = new Test2();
	 	System.out.println(test2.calc(20));
	 	
	}

}
