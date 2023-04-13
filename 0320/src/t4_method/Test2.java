package t4_method;

public class Test2 {
	
	int su1, su2;
	
	void mbc(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	int add() {
		int res = su1 + su2;
		return res;
	}
	
	int sub() {
		return su1 - su2;
	}
	
	int hap(int su1, int su2) {
//		this.su1 = su1;
//		this.su2 = su2;
		return su1 + su2;
	}
	
	int cha(int su1, int su2) {
		return su1 - su2;
	}
	
}
