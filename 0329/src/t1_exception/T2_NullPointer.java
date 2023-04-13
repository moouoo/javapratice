package t1_exception;

public class T2_NullPointer {
	public static void main(String[] args) {
		
		String data = "atom";
		//String data = new String();
		System.out.println("1.data = " + data);
		
		String data2 = "100";
		int data3 = 200;
		System.out.println("2.data2 = " + data2);
		System.out.println("3.data3 = " + data3);
		System.out.println("4.data2 + 100 = " + (data2 + 100));
		//System.out.println("5.data3 + 200 = " + ((String) data3 + 200));
		System.out.println();
		
		int data4 = Integer.parseInt(data2) + data3;
		System.out.println("6." + data4);
		
		//String data5 = null;
		String data5 = "";
		System.out.println("7. " + data5);
		System.out.println("8. " + (String)data5);

		//try catch로 프로그램을 중단시키지말고 오류해결
		try {
			System.out.println("9. " + data5.toString());
			System.out.println("10. 통과");
		} catch (NullPointerException e) {
			System.out.println("오류발생" + e.getMessage());
			//e.printStackTrace(); //프로그램의 콘솔창에서만 뜬다.
		} finally {
			//오류가 나오든 통과를 하든 fanally는 수행 단, try catch애서 주로 사용
			System.out.println("11. data5값 처리끝...!");
		}
		
		System.out.println("999. 작업끝");
		
	}
}
