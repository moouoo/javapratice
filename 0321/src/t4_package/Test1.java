package t4_package;

public class Test1 {
	
	int calc(int su) {
		System.out.println("이곳은 t4_package");
		return su / 4;
	}
	
	public	int calc(double su) {
		System.out.println("이곳은 t4_package");
		return (int)(su / 4 + 0.5); // 반올림 0.5 더한다
	}
}
