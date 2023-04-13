package t6_Getter_Setter;

import java.util.Scanner;

/*
 * 성명/나이/지역을 입력받아 정보를 정장/출력을 하고자 한다.
 * 나이는 15세 이상 70세 미만만 가입할 수 있도록 처리하고,
 * 주소에 '0;이 입력되면 '외국인'으로 저장한다
 * 추가: 성별을 입력받는다
 */
public class Test2_run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test2VO vo = new Test2VO();

		System.out.print("성명을 입력하시오? ");
		vo.setName(sc.next());
		System.out.print("나이을 입력하시오? ");
		vo.setAge(sc.nextInt());
		System.out.print("주소을 입력하시오?(외국인은 '0') ");
		vo.setAddress(sc.next());
		
		System.out.println();
		System.out.println("=====>등록된 신상정보");
		System.out.println("성명 : " + vo.getName());
		System.out.println("나이 : " + vo.getAge());
		System.out.println("주소 : " + vo.getAddress());
		

		sc.close();
	}
}
