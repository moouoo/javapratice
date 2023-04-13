package t8_test;

import java.util.Scanner;

/*
   아이디와 비밀번호를 입력받아서 인증된 회원이면 등록된 상품을 보여주고,
   그렇지 않으면 로그아웃시켜보시오.
 */
public class Test1Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id, pwd;
		
		Test1VO vo = new Test1VO();
		Test1Service service = new Test1Service();
		
		System.out.print("아이디를 입력하세요? ");
		id = scanner.next();
		System.out.print("비밀번호를 입력하세요? ");
		pwd = scanner.next();
		
		if(!vo.getId().equals(id) || !vo.getPwd().equals(pwd)) {
			System.out.println("로그인 실패....");
		}
		else {
			System.out.println("로그인 되었습니다.");
			System.out.println();
			service.getProduct();
			System.out.println();
			System.out.print("구매하실 상품번호를 입력하세요? ");
			int sel = scanner.nextInt();
			service.getProductSerach(sel);
		}
		System.out.println("작업끝~~~~");
		
		scanner.close();
	}
}
