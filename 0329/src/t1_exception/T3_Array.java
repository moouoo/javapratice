package t1_exception;

public class T3_Array {
	public static void main(String[] args) {
		// String[] strArr = new String[5];
		try {
			args[0] = "atom";
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];
			
			System.out.println("data1 = " + args[0]);
			System.out.println("data1 = " + data1);
			System.out.println("data1 = " + data2);
			System.out.println("data1 = " + data3);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
