package t5_set;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class T2_Lotto2 {

	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<>();
		
		int su;
		while(true) {
			su = (int)(Math.random()*45) + 1;
			lotto.add(su);
			if(lotto.size() == 6) break;
		}
		System.out.println("금주의 로또 번호는 : " + lotto);
		System.out.println();
		
		// ArrayList객체로 바꿔서 저장하기
		ArrayList<Integer> vos = new ArrayList<>();
		
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()) {
			vos.add(it.next());
		}
		System.out.println("vos : " + vos);
		System.out.println();
		
		// 정렬하기
//		int temp;
//		for(int i=1; i<=5; i++) {
//			for(int j=i+1; j<=6; j++) {
//				if(vos.get(i-1) > vos.get(j-1)) {
//					temp = vos.get(i-1);
//					vos.set(i-1 , vos.get(j-1));
//					vos.set(j-1, temp);
//					
//				}
//			}
//		}
		
		Collections.sort(vos);
		System.out.println("안녕"+vos);
		
		//정렬된 로또번호 출력하기
		System.out.println("정렬된 로또번호");
		for(int vo : vos) {
			System.out.print(vo + " ");
		}
		
		
		
	}

}
