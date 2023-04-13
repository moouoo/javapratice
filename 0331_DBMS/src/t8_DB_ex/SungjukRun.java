package t8_DB_ex;

import java.util.Scanner;

public class SungjukRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		SungjukService service = new SungjukService();
		
		while(run) {
			System.out.println("\n\t\t** 성 적 표 **");
			System.out.print("메뉴선택 (1:입력 2:조회 3:개별조회 4:수정 5:삭제 0:종료 ");
			int no = sc.nextInt();
			
			switch (no) {
				case 1:						// 성적입력
					service.setInput();
					break;
				case 2:						// 성적조회
					service.setList();
					break;
				case 3:						// 개별조회
					service.setSearch();
					break;
				case 4:						// 성적수정
					service.setUpdate();
					break;
					
				case 5:						// 성적삭제
					service.setDelete();
					break;

				default:
					run = false;
			}
		}
		System.out.println("종료!");
		
		sc.close();
		
	}
}
