package t6_Wrapper;

public class Test2 {

	public static void main(String[] args) {
		
		// 정수형 UnBoxing 처리 : 객체를 다시 기본타입으로 변경처리한다.
		// 사용형식? "타입명 + 예약어" : 예) 정수일경우의 UnBoxing : intValue()
		
		double dblSu = 3.14;
		Double objDblSu = new Double(dblSu);
		System.out.println("dblSu : " + dblSu);
		System.out.println("objDblSu : " + objDblSu);
		
		double vDbl1 = objDblSu;
		System.out.println("vDblSu : " + vDbl1);
		System.out.println();
		
		System.out.println("dblSu : " + (dblSu)+100);
		System.out.println("objDblSu : " + (objDblSu)+100);
		System.out.println("vDblSu : " + (vDbl1)+100);
		System.out.println();
		
		String str = "123";
		int intStr = Integer.parseInt(str);
		System.out.println(str + 100);
		System.out.println(intStr + 100);
		
		int ss1 = 100;
		Integer intSu2 = Integer.valueOf(ss1);
		System.out.println(intSu2 + 100);
		
		Double dd = Double.valueOf(10);
		System.out.println(dd);
	}

}
