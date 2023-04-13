package t2_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class t5_SungjukRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<t5_SungjukVo> vos = new ArrayList<>();
		
		t5_SungjukVo vo;
		
		while(true) {
			vo = new t5_SungjukVo();
			String[] title = {"성명","국어","영어","수학"};
			String name;
			int[] jumsu = new int[3];
			
			System.out.println("성명을 입력하세요 (종료:999) ");
			name = sc.next();
			if(name.equals("999")) break;
			
			for(int i=0; i<jumsu.length; i++) {	
			System.out.print(title[i+1] + "점수를 입력하시오 ");
			jumsu[i] = sc.nextInt();
			}
			
			vo.setName(name);
			vo.setKor(jumsu[0]);
			vo.setEng(jumsu[1]);
			vo.setMat(jumsu[2]);
			
			vos.add(vo);
		}
		int tot;
		double avg;
		for(t5_SungjukVo pvo: vos) {
			tot = pvo.getKor() + pvo.getEng() + pvo.getMat();
			avg = tot / 3.0;
			System.out.print(pvo.getName() + "\t");
			System.out.print(pvo.getKor() + "\t");
			System.out.print(pvo.getEng() + "\t");
			System.out.print(pvo.getMat() + "\t");
			System.out.print(tot + "\t");
			System.out.print(avg + "\n");
		}
		
		System.out.println("작업끝");
		
		
		sc.close();
	}
}
