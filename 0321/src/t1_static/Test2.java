package t1_static;

//	정적(static)멤버(정적 필드/ 정적 메소드)
public class Test2 {
	//	정적 필드
	static double pi = 3.141592;
	
	double pi2 = 3.141592;
	
	//	정적 메소드
	static double circleArea(int r) {
		//double res = this.pi * r * r;
		double res = pi * r * r;
		return res;
	}
	
	
}
