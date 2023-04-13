package t3_constructor;

public class Car {
	String model; // -> 필드
	String color;
	int speed;
	
	public Car(String model) {	// -> 매개변수
		//this.model = model;
		//this(model, "은색", 100); -> 선택사항이 없는것
		this(model, null, 0); 	//	-> null과 0과 같은 기본값을 줌으로써 선택할수있게 만듬
	}
	
	public Car(String model, String color) {
		this(model, color, 0);
	}
	
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
