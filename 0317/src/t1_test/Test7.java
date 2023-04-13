package t1_test;

import java.util.Scanner;

//	이분검색(먼저 정렬처리를 해줘야한다.)
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//	저장된 자료를 먼저 정렬시킨 후 이분검색처리 해야한다.
		int[] save_item = {2,3,5,8,10,15,24,30,32,35};
		
		int su;
		int sp = 0;
		int ep = save_item.length - 1;
		int cnt=0;
		int mp;
		
		System.out.print("찾고자하는 수를 입력 ");
		su = sc.nextInt();
		
		while(true) {
			if(sp > ep) {
				System.out.println("찾고자하는 자료가 없습니다.");
				break;
			}
			
			cnt++;
			mp = (sp + ep) / 2;
			if(save_item[mp] > su) {
				ep = mp - 1;
			}
			else if(save_item[mp] < su) {
				sp = mp + 1;
			}
			else {
				System.out.println("자료를 "+cnt+"번만에 찾았습니다.");
				break;
			}
		}
		sc.close();
	}
}
