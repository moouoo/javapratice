package t4_random;

import java.util.Scanner;

//	숫자 맞추기 게임
//	컴퓨터가 100이하의 난수를 생성하였을때 그 값을 맞추는 게임
//	단, 기회는 5번을 하며, 몇 번만에 맞췄는지를 출력
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//	컴퓨터가 1~100까지의 난수를 생성시켜준다.
		int res = (int)(Math.random()*100) + 1;
		int su, cnt = 0;
		
		while(true) {
			cnt++;
			System.out.print("찾고자 하는 수를 입력하세요. (기회 5번) ");
			su = sc.nextInt();
			
			if(res > su) {
				System.out.println("더 큰수를 입력하세요.("+cnt+"회 수행");
			}
			else if(res < su) {
				System.out.println("더 작은수를 입력하세요.("+cnt+"회 수행");
			}
			else {
				System.out.println("정답: "+res+" , "+cnt+"번 만에 맞추셧습니다.");
				break;
			}
			if(cnt == 5) {
				System.out.println("정답: "+res+", 5번의 기회를 모두 사용하였습니다.");
				break;
			}
		}
		System.out.println("작업 끝!");
		sc.close();
	}
}
