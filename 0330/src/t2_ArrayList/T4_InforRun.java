package t2_ArrayList;

import java.util.ArrayList;

public class T4_InforRun {
	public static void main(String[] args) {
		
		ArrayList<T4_InforVo> vos = new ArrayList<>();
		
		T4_InforVo vo = new T4_InforVo();
		vo.setName("홍길동");
		vo.setAge(25);
		vo.setGender(true);
		vo.setAddress("서울");
		vos.add(vo);
		
		T4_InforVo vo2 = new T4_InforVo();
		vo2 = vos.get(0);
		System.out.println("성명 : " + vo2.getName());
		System.out.println("나이 : " + vo2.getAge());
		System.out.println("성별 : " + vo2.isGender());
		System.out.println("주소 : " + vo2.getAddress());
		System.out.println();
		
		vo.setName("김바보");
		vo.setAge(29);
		vo.setGender(true);
		vo.setAddress("청주");
		vos.add(vo);
		
		vo2 = vos.get(1);
		System.out.println("성명 : " + vo2.getName());
		System.out.println("나이 : " + vo2.getAge());
		System.out.println("성별 : " + vo2.isGender());
		System.out.println("주소 : " + vo2.getAddress());
		System.out.println("========================================");
		
		vo.setName("이거지");
		vo.setAge(21);
		vo.setGender(true);
		vo.setAddress("천안");
		vos.add(vo);
		
		System.out.println("vos : " + vos);
		System.out.println();
		
		System.out.println("\t **** 신상명세서 ****");
		System.out.println("=================================");
		System.out.println("성명\t나이\t성별\t주소");
		System.out.println("---------------------------------");
		for(T4_InforVo iVo : vos) {
			System.out.print(iVo.getName() + "\t");
			System.out.print(iVo.getAge() + "\t");
			System.out.print(iVo.isGender() + "\t");
			System.out.print(iVo.getAddress());
			System.out.println();
		}
		System.out.println("=================================");
		
	
	
	}
}
