package t6_abstractEx;

/*
 요구사항
 1. 각 회사(삼성(samsung)/LG(Lg))에서 전화기(Phone)를 생산하고 있다.
 2. 각 전화기(Phone)에는 공통적으로 반드시 사용해야할 주된 기능(function())과 기본소리(sound())
 3. 삼성폰의 주된 기능은 '사진촬영기능'이고, LG폰은 '화질이 우수함'
 4. 각 전화기가 공통적으로 사용하는 기능은? 전원켜기(powerOn()), 전화끄기(powerOff())가 있따.
 5. 사용자가 선택한 전화기에 따른 각각의 모든 특징과 기능들을 풀력시켜보도록하시오.
 6. 추가: 삼성폰은 '만보기'기능을 추가, LG폰은 '심박동측정'기능을 추가!
 */
public class Run {
	public static void main(String[] args) {
		Samsung samsung = new Samsung("김바보");
		samsung.powerOn();
		samsung.sound();
		samsung.function();
		samsung.functionSamsung();
		samsung.powerOff();
		System.out.println();
		
		Lg lg = new Lg("이거지");
		lg.powerOn();
		lg.sound();
		lg.function();
		lg.functionLg();
		lg.powerOff();
	}
}
