package t4_package;

public class Test2 {
	
	int calc(int su) {
		System.out.println("이곳은 t4_package(Test2)");
		return su - 4;
	}
	
	public	int calc(double su) {
		System.out.println("이곳은 t4_package(Test2)");
		return (int)(su - 4 );
	}
}
