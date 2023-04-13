package t6_Wrapper;

public class Test1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		int intSu1 = 100;
		
		// 정수형 Boxing처리(Integer)
		Integer objSu1 = new Integer(intSu1); // 밑줄 에러가 아니라 대체할게 있다는 뜻임
		System.out.println("intSu1 : " + intSu1);
		System.out.println("objSu1 : " + objSu1);
		System.out.println("intSu1 + 100 : " + (intSu1 + 100));
		System.out.println("objSu1 + 100 : " + (objSu1 + 100));
		System.out.println();
		
		String strIntSu1 = "100";
		System.out.println("strIntSu1 + 100 : " + (strIntSu1 + 100));
		System.out.println("strIntSu1 + 100 : " + (Integer.parseInt(strIntSu1) + 100));
		Integer objIntSu1 = new Integer(strIntSu1);
		System.out.println("objIntSu1 + 100 : " + (objIntSu1 + 100));
		System.out.println();
		
		double dbSu = 3.14;
		Double objDbSu1 = new Double(dbSu);
		System.out.println("objDbSu1 + 100 : " + (objDbSu1 + 100));
		String strDbSu1 = "3.14";
		System.out.println("Double.parseDouble(strDbSu1) + 100 : " + Double.parseDouble(strDbSu1) + 100);
		
		
	}

}
