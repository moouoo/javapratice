package t6_DBConnection;

import java.util.Scanner;

public class DBTestRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		String name, temp="";
		int res, no;
		
		DBTestDao dao = new DBTestDao();
		DBTestVo vo = null;

		// 조건에 따른 DB테스트
		while(run) {
			System.out.print("작업 선택?(1:전체조회  2:개별조회  3:자료추가  4: 자료삭제  5:자료갱신  0:종료) ");
			int sel = scanner.nextInt();
			
			switch (sel) {
				case 1:						// DB검색(전체 검색)
					dao.getList();
					break;
				case 2:						// DB 개별검색
					System.out.print("검색할 성명을 입력하세요? ");
					name = scanner.next();
					res = dao.getSearch(name);
					break;
				case 3:						// DB 자료 추가
					vo = new DBTestVo();
					
					System.out.print("추가할 성명을 입력하세요? ");
					vo.setName(scanner.next());
					System.out.print("추가할 나이를 입력하세요? ");
					vo.setAge(scanner.nextInt());
					System.out.print("추가할 성별을 입력하세요? ");
					vo.setGender(scanner.next());
					System.out.print("추가할 주소를 입력하세요? ");
					vo.setAddress(scanner.next());
					System.out.print("추가할 직업을 입력하세요? ");
					vo.setJob(scanner.next());
					res = dao.setInsert(vo);
					if(res == 1) {
						System.out.println("자료가 추가되었습니다.");
					}
					else {
						System.out.println("동명2인이 존재합니다. 성명 확인후 다시 입력하세요.");
					}
					break;
				case 4:						// DB 의 자료 삭제
					System.out.print("삭제할 성명을 입력하세요? ");
					name = scanner.next();
					res = dao.setDelete(name);
					if(res == 1) {
						System.out.println("자료가 삭제되었습니다.");
					}
					else {
						System.out.println(name + "은 없는 자료입니다. 다시 입력하세요.");
					}
					break;
				case 5:						// DB 의 자료 갱신(수정)
					while(true) {
						System.out.print("수정할 성명을 입력하세요? ");
						name = scanner.next();
						res = dao.getSearch(name);
						if(res != 1) {
							System.out.println("검색하신 "+name+" 가 없습니다. 다시 입력하세요.");
							continue;
						}
						else {
							break;
						}
					}
					
					System.out.print("수정할 항목은?(1:나이  2:성별  3:주소  4:직업  0:종료) ");
					no = scanner.nextInt();
					switch (no) {
						case 1:
							System.out.print("나이를 입력하세요? ");
							temp = scanner.next();
							break;
						case 2:
							System.out.print("성별을 입력하세요? ");
							temp = scanner.next();
							break;
						case 3:
							System.out.print("주소를 입력하세요? ");
							temp = scanner.next();
							break;
						case 4:
							System.out.print("직업을 입력하세요? ");
							temp = scanner.next();
							break;
						default:
							break;
					}
					dao.getUpdate(no, temp, name);
					break;
				default:
					run = false;
			}
		}
		
		
		dao.connClose();
		scanner.close();
	}
}
