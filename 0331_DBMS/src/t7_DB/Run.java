package t7_DB;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		SungjukDAO dao = new SungjukDAO();
		SungjukVO vo = new SungjukVO();
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		String name;
		
		while(run) {
			System.out.println("=======================");
			System.out.println("학생성적프로그램");
			System.out.println("-----------------------");
			System.out.print("1:전체조회 2:개별조회 3:성적입력 4:학생삭제 5:성적수정 0:종료 ");
			
			int sell = sc.nextInt();
			
			switch (sell) {
				case 1:					// 전체조회
					dao.getList();
					break;
				case 2:					// 개별조회
					System.out.print("검색할 학생 이름을 입력하시오. ");
					name = sc.next();
					int res = dao.getSearch(name);
				case 3:					// 성적입력
					System.out.print("추가할 이름을 입력하시오. ");
					vo.setName(sc.next());
					System.out.print("추가할 국어성적을 입력하시오. ");
					vo.setKor(sc.nextInt());
					System.out.print("추가할 영어성적을 입력하시오. ");
					vo.setEng(sc.nextInt());
					System.out.print("추가할 수학성적을 입력하시오. ");
					vo.setMat(sc.nextInt());
					
					vo.getTot();
					vo.getAvg();
					vo.getGrade();
					
					dao.setInsert(vo);
					
				default:
					System.out.println("종료합니다.");
					run = false;
			}
		}
		
		
		sc.close();
		
	}

}
