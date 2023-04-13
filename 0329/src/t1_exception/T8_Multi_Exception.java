package t1_exception;

public class T8_Multi_Exception {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];
			
			System.out.println("data1 = " + data1);
			System.out.println("data2 = " + data2);
			System.out.println("data3 = " + data3);
			
			int res = Integer.parseInt(data1) + Integer.parseInt(data2);
			System.out.println("res = " + res);
			
			int res2 = Integer.parseInt(data1) + Integer.parseInt(data3);
			System.out.println("res = " + res2);
				
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류 : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("오류2 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("오류3 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("데이터작업완료!");
		}
		System.out.println("작업끝");
	}

}
