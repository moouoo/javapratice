package t2_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class T3_Iterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> vos = new ArrayList<>();
		vos.add(10);
		vos.add(20);
		vos.add(50);
		vos.add(6);
		vos.add(30);
		vos.add(20);
		vos.add(6);
		vos.add(22);
		
		System.out.println("vos : " + vos.toString());
		System.out.println("vos : " + vos);
		
		for(int vo : vos) {
			System.out.print(vo + " / ");
		}
		System.out.println();
		
		Iterator<Integer> iVos = vos.iterator(); //	iterator 자세히 먼데?
		System.out.println("iVos : " + iVos);
		while(iVos.hasNext()){		// 여기에 자료가 얼마나 있는지 모르기 때문에 while문을 이용한다.
			int item = iVos.next();	//	hasNext() 다음으로 넘겼을때 자료가 있니? 라고 물어보는 메소드
			System.out.print(item + " / ");
		}
	}

}
