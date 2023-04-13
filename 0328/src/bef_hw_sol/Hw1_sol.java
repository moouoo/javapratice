package bef_hw_sol;

import java.util.Scanner;

public class Hw1_sol {
	// 문장을 입력받아서 공백의 개수와 공백의 위치를 출력하시오
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int location = 0, cnt = 0; // 위치값 / 공백의 갯수
		
		String sentence = sc.nextLine();
		
		while(true){
			location = sentence.indexOf(" ",location);
			if(location == -1)break;
			System.out.println(location + "번째 위치에 공백이 있습니다.");
			location++;
			cnt++;
		}
		System.out.println("공백의 개수: " + cnt);
		
		sc.close();
		
		
	}

}
