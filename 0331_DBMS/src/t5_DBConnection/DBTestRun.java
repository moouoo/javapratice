package t5_DBConnection;

import java.util.Scanner;

public class DBTestRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String name, address, job, gender;
		int age, idx;
		
		DBTestDao dao = new DBTestDao();
		
		// 조건에 따른 DB테스트
		while(run) {
			System.out.print("작업 선택? (1:전체조회 2:개별조회 3:자료추가 4:자료삭제 5:자료갱신 0:종료" );
			int sel = sc.nextInt();
			
			switch (sel) {
				case 1:				// DB검색(전체검색)
					dao.getList();
					break;
				case 2:				// DB 개별검색
					System.out.print("검색할 성명을 입력해주세요? ");
					name = sc.next();
					dao.getSerch(name);
					break;
				case 3:				// DB 자료추가
					System.out.print("추가할 성명을 입력해주세요? ");
					name = sc.next();
					System.out.print("추가할 나이를 입력해주세요? ");
					age = sc.nextInt();
					System.out.print("추가할 성별을 입력해주세요? ");
					gender = sc.next();
					System.out.print("추가할 주소를 입력해주세요? ");
					address = sc.next();
					System.out.print("추가할 직업를 입력해주세요? ");
					job = sc.next();
					int res = dao.getInsert(name,age,gender,address,job);
					if(res == 1) {
						System.out.println("자료가 추가되엇습니다.");
					}
					else{
						System.out.println("입력실패!!");
					}
					break;
				case 4:				// DB 자료삭제
					System.out.print("삭제할 고유번호를 입력해주세요? ");
					idx = sc.nextInt();
					dao.getDelete(idx);
					break;
				case 5:				// DB 자료 생신(수정)
					System.out.print("수정할 고유번호을 입력해주세요? ");
					idx = sc.nextInt();
					System.out.print("수정할 나이를 입력해주세요? ");
					age = sc.nextInt();
					dao.getUpdate(idx,age);
					break;
				default:
					run = false;
			}
		}
		dao.connClose();
	}

}
