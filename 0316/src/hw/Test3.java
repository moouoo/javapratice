package hw;

import java.util.Scanner;

//	한글과 짝을 이루는 2개의 배열을 만드시오
//	사용자로부터 영어단어를 입력 받으면 한글로 출력하는 프로그램을 도입하시
public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word;
		int num;
		boolean stop = true;
		
		String[][] array = {
				{"corn", "옥수수"},
				{"sorghum", "수수"},
				{"barly", "대맥"},
				{"oat", "연맥"},
				{"rice", "쌀"}
		};
		
		while(stop) {
			System.out.println("*");
			System.out.print("원하는 사전 번호를 입력하시오. \n 영한사전: 1 \n 한영사전: 2 \n 종료: 999\n-> ");
			num = sc.nextInt();
			switch(num){
				case 1 :
					System.out.println("영한사전입니다.");
					System.out.print("무엇이 궁금하십니까? ");
					word = sc.next();
					for(int i = 0; i<array.length; i++) {
							for( int j = 0; j<array[i].length; j++) {
								if(word.equals(array[i][j])) {
								System.out.println("그것은 "+array[i][j+1]+"입니다.");
								}
							}
					}
					break;
				case 2 :
					System.out.println("한영사전입니다.");
					System.out.print("무엇이 궁금하십니까? ");
					word = sc.next();
					for(int i = 0; i<array.length; i++) {
							for( int j = 0; j<array[i].length; j++) {
								if(word.equals(array[i][j])) {
								System.out.println("그것은 "+array[i][j-1]+"입니다.");							
								}
							}
					}
					break;
				case 999 :
					System.out.println("감사합니다. 또 봐요!");
					stop = false;
					break;	
			}
		}
			sc.close();
	}
		
}
