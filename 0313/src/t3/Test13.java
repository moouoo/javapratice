package t3;

import java.io.IOException;

// 표준출력 : System.out.println()
// 키보드를 통한 표준입력(1문자) : System.in.read()
public class Test13 {
	public static void main(String[] args) throws IOException {
		int varkey;
		
		System.out.print("아무키나 입력하세요?");
		varkey = System.in.read();
		
		System.out.println("varkey : " + varkey);
		
		
	}
}
