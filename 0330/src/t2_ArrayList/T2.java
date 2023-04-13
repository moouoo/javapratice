package t2_ArrayList;

import java.util.ArrayList;

public class T2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> vos = new ArrayList<>();
		//List<String> vos = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			vos.add((i+1)*10); //처음에 0을 곱하게 되니깐 1을 더해준다
		}
		
		// 원본출력
		for(int vo : vos) {
			System.out.print(vo + " ");
		}
		System.out.println();
		
		// 거꾸로출력
		int item = vos.size() -1;
		for(int i = 0; i < vos.size(); i++) {
			System.out.print(vos.get(item) + " ");
			item--;
		}
		System.out.println();
		
		// 거꾸로출력2
		for(int i = vos.size()-1; i >= 0; i--) {
			System.out.print(vos.get(i) + " ");
		}
		System.out.println();
		
		
	}

}
