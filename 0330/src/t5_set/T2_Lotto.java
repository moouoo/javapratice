package t5_set;

import java.util.HashSet;

public class T2_Lotto {

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
		
		// 정렬하기
		//정렬된 로또번호 출력하기
		
		
		
		
	}

}
