package t1_static;

//	인스턴스멤버(인스턴스 필드/ 인스턴스 메소드)
public class Test1 {
	//	인슨턴스 필드
	double pi = 3.141592;
	
	//	인스턴스 메소드
	double circleArea(int r) {
		double res = this.pi * r * r;
		return res;
	}
	
	
}
