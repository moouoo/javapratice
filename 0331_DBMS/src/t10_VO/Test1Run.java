package t10_VO;

import java.util.Scanner;

public class Test1Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SungjukDAO dao = new SungjukDAO();
		
		System.out.print("메뉴선택?(1:개별(성명)출력  0:종료) => ");
		int choice = scanner.nextInt();
		
		switch (choice) {
			case 1:
				System.out.print("성명 입력? ");
				String name = scanner.next();
				SungjukVO vo = dao.getSearch(name);
				if(vo != null) {
					System.out.println("\n고유번호 : " + vo.getIdx());
					System.out.println("성명 : " + vo.getName());
					System.out.println("국어 : " + vo.getKor());
					System.out.println("영어 : " + vo.getEng());
					System.out.println("수학 : " + vo.getMat());
					System.out.println("총점 : " + vo.getTot());
					System.out.println("평균 : " + String.format("%.1f", vo.getAvg()));
					System.out.println("학점 : " + vo.getGrade());
					System.out.println("평점 : " + vo.getAverage());
					System.out.println("전체건수 : " + vo.getCnt() + "건");
				}
				else {
					System.out.println("검색하신 "+name+" 님은 없습니다.");
				}
				break;
			default:
				break;
		}
		
		scanner.close();
	}
}
