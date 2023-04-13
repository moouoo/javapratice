package t2_ArrayList;

import java.util.ArrayList;

public class T4_InforRun2 {
	public static void main(String[] args) {
		
		ArrayList<T4_InforVo> vos = new ArrayList<>();
		
		T4_InforVo vo = new T4_InforVo();
		vo.setName("홍길동");
		vo.setAge(25);
		vo.setGender(true);
		vo.setAddress("서울");
		vos.add(vo);
		
		//T4_InforVo vo2 = new T4_InforVo();
		vo = new T4_InforVo();
		vo.setName("김말숙");
		vo.setAge(33);
		vo.setGender(false);
		vo.setAddress("청주");
		vos.add(vo);
		
		// T4_InforVo vo3 = new T4_InforVo();
		vo = new T4_InforVo();
		vo.setName("이기자");
		vo.setAge(16);
		vo.setGender(true);
		vo.setAddress("제주");
		vos.add(vo);
		
		System.out.println("vos : " + vos);
		System.out.println();
		
		T4_InforVo sVo = null;
		System.out.println("\t*** 신상명세서 ***");
		System.out.println("=================================");
		System.out.println(" 성명\t나이\t성별\t주소");
		System.out.println("---------------------------------");
		for(int i=0; i<vos.size(); i++) {
			sVo = vos.get(i);
			System.out.print(sVo.getName() + "\t");
			System.out.print(sVo.getAge() + "\t");
			System.out.print(sVo.isGender() + "\t");
			System.out.print(sVo.getAddress());
			System.out.println();
		}
		System.out.println("=================================");
		
	}
}
