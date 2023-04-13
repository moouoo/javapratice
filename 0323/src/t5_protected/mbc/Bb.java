package t5_protected.mbc;

import t5_protected.kbs.Aa; // 1. 패키지 임포트하면 패키지 달라도 사용가능 (단축키:컨+싶+O)


public class Bb extends Aa{
	public int b = 20;
	
	public void methodB() {
		System.out.println("이곳은 Bb클래스의 methodB");
		System.out.println("Aa클래스의 e :" + e);
	}
}
