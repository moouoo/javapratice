package t1_Vector;

import java.util.Vector;

// Vector클래스
public class Test1 {
	public static void main(String[] args) {
		// Vector<String> names = new Vector<String>();
		Vector<String> vos = new Vector<>();
		
		System.out.println("vos용량 : " + vos.capacity());
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.add("홍길동");
		vos.add("김말숙");
		vos.add("이기자");
		vos.add("강감찬");
		vos.add("오하늘");
		
		System.out.println("vos용량 : " + vos.capacity());
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.add("홍길동2");
		vos.add("김말숙2");
		vos.add("이기자2");
		vos.add("강감찬2");
		vos.add("오하늘2");
		vos.add("소나무");
		
		System.out.println("vos용량 : " + vos.capacity());
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		int cnt = 0;
		for(String vo : vos) {
			System.out.println(cnt + " : " + vo);
			cnt++;
		}
		System.out.println();
		
		vos.set(2, "김길동");
		System.out.println("vos : " + vos);
		System.out.println();
		
		String name = vos.get(2);
		System.out.println("2번방의 이름 : " + name);
		
		vos.remove(2);
		System.out.println("vos : " + vos);
		System.out.println();
		
		name = vos.get(2);
		System.out.println("2번방의 이름 : " + name);
		
		vos.clear();
		System.out.println("vos용량 : " + vos.capacity());
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
	}
}
