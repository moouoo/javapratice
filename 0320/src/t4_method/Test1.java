package t4_method;

public class Test1 {
	
	int su1, su2;	//	전역변수
	
	void mbc() {
//		int su1, su2; //	지역변수
		su1 = 100;
		su2 = 200;
	}
	
	void mbc(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	void kbs(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
}
