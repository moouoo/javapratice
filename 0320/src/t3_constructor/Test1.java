package t3_constructor;

//	한 클래스에 여러 생성자가 있는 기법을 생성자 오버로딩이라 부른다. (생성자 overlooding)
//	생성자는 클래스 명과 같아야한다.
public class Test1 {
	
//	String name;
	String name = "홍길동";
	double su1, su2;
	String irum;
	
	
//	Test1(){}	//생성자(기본생성자) = 디폴트 컨스트럭터(default constructor)
	public Test1() {}
	
	Test1(String name){
		this.name = name;	// this. 을 사용함으로 필드의 홍길동을 가르키게 됨
							// this.name -> 홍길동
	}						// name -> String name
	
	Test1(int su1){
		this.su1 = su1;
	}

	//	같은 타입이라서 오류
//	Test1(String irum){
//		this.name = irum;
//	}
	//	같은타입이지만 개수가 달라 오케이
	Test1(int su1, int su2){
		this.su1 = su1;
		this.su2 = su2;
	}
	//	위와 다른 설계도
	Test1(int su1, double su2){
		this.su1 = su1;
		this.su2 = su2;
	}
	//	위와 다른 설계도
	Test1(double su1, int su2){
		this.su1 = su1;
		this.su2 = su2;
	}	
//	생성자는 매개변수의 타입의 종류와 개수와 순서에 따라 서로 다른 개체로 구별된다
//	생성자를 안 적으면 컴파일러에서 자동으로 기본생성자를 만들어주지만 하나라도 생성자를 만들면 만들지 않는다.
}