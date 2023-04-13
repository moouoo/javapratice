package t1_exception;

public class T5_NumberFormat {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "Green100";
		
		System.out.println("data1 + 200 = " + (data1 + 200));
				
		int intData1 = Integer.parseInt(data1);
		System.out.println("intData1 + 200 = " + (intData1 + 200));
		
		try {
			//System.out.println("1.data2 : " + data2); //오류확인방법
			int intData2 = Integer.parseInt(data2);
			//System.out.println("2.data2 : " + data2); // 오류확인방법
			System.out.println("intData2 + 200 = " + (intData2 + 200));
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("오류 : " + e.getMessage());
		}
		
		
	}
}
