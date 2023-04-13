package t5_Arrays;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동","김말숙","이기자","오하늘","소나무"};
		int cnt = 0;
		
		System.out.println("names의 자료들 : ");
		for(String name : names) {
			System.out.println("names["+cnt+"] =  " + name);
			cnt++;
		}
		System.out.println();
		
		// 배열복사 : Arrays.copyOfRange(원본배열명, 시작위치, 복사할길이)
		String[] names2 = Arrays.copyOfRange(names, 0, names.length);	// 왜 new 안사용함?
		for(int i=0; i<names2.length; i++) {							// 메소드 영역에 올라가므로 굳이 new를 생성할 필요가 없다
			System.out.println("names2["+i+"] = " + names2[i]);
		}
		System.out.println();
		
		String[] names3 = Arrays.copyOf(names, 3);
		for(int i=0; i<names3.length; i++) {
			System.out.println("names3["+i+"] = " + names3[i]);
		}
	}

}
