package t2_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class t5_SungjukRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<t5_SungjukVo> vos = new ArrayList<>();
		
		
		while(true) {
			t5_SungjukVo vo = new t5_SungjukVo();
			String name;
			int kor, eng, mat;
			
			System.out.println("성명을 입력하세요 (종료:999) ");
			name = sc.next();
			if(name.equals("999")) break;
			
			System.out.println("국어점수를 입력하시오 ");
			kor = sc.nextInt();
			System.out.println("영어점수를 입력하시오 ");
			eng = sc.nextInt();
			System.out.println("수학점수를 입력하시오 ");
			mat = sc.nextInt();
			
			vo.setName(name);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMat(mat);
			
			vos.add(vo);
		}
		int tot;
		double avg;
		for(t5_SungjukVo vo: vos) {
			tot = vo.getKor() + vo.getEng() + vo.getMat();
			avg = tot / 3.0;
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(tot + "\t");
			System.out.print(avg + "\n");
		}
		
		System.out.println("작업끝");
		
		
		sc.close();
	}
}
