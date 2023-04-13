package t7_singleton;

public class Singleton {
	// 2. 정적필드를 자신의 타입과 private로 선언하고, 초기값은 자신의 객체(싱글톤객체)를 생성해서 할당한다.
	private static Singleton singleton = new Singleton();
	
	// 1. 객체를 외부에서 생성하지 못하도록 생성자 앞에 private 접근제한자를 붙여준다
	private Singleton() {}
	
	// 3. 외부에서 호출하기 위해 getInstence()매소드를 만든다. 
	//	  이때 return 값은 앞에서 생성한 정적필드를 지정해준다.
	public static Singleton getInstance() {
		return singleton;
	}
}
