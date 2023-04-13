package t4_test;

public class Test1 {
	public static void main(String[] args) {
		
      	//			  "01234567890123456789012
		String msg1 = "Welcome to nice Korea!!";
		//String msg2 = "한국에 방문하신것을 환영합니다!!!";

		System.out.println("msg1 : " + msg1);
		
		int locStart = msg1.indexOf(" ");
		System.out.println("첫번째 공백의 위치 " + locStart);
		int locEnd = msg1.lastIndexOf(" ");		
		System.out.println("두번째 공백의 위치 " + locEnd);
		
		// 두번째 공백의 위치는?
		String temp1 = msg1.substring(locStart+1);
		System.out.println("temp " + temp1);
		locStart = temp1.indexOf(" ");
		System.out.println(locStart);
		
		String temp2 = msg1.substring(locEnd+1);
		System.out.println("temp " + temp2);
		
		String temp3 = msg1.substring(0, locEnd);
		System.out.println("temp " + temp3);
		System.out.println(temp3);
	
		
		//미완임 생각해보고 채우고 과제할것
	}


}
