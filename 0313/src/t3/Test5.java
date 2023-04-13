package t3;

public class Test5 {
	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = " 1.8";
		String res = "";
		
		res = str1 + str2;
		System.out.println("1.res : " + res);
		
		res = str1 + 1.0 + 0.8;
		System.out.println("2.res : " + res);
		
		res = str1 + (1.0 + 0.8);
		System.out.println("3.res : " + res);

		res = 1.0 + 0.8 + str1;
		System.out.println("4.res : " + res);
		
	}
}
