package t4_CollectionTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		
//		Vector<String> vos1 = new Vector<>();
//		ArrayList<String> vos2 = new ArrayList<>();
//		LinkedList<String> vos3 = new LinkedList<>();
		
		List<String> vos1 = new Vector<>();
		List<String> vos2 = new ArrayList<>();
		List<String> vos3 = new LinkedList<>();
		
		int su = 300000;
		
		long startTime, endTime;
		
		//Vector 수행시간
		startTime = System.nanoTime();
		for(int i = 0; i < su; i++) {
//			vos1.add(i+"");
			vos1.add(0+"");
		}
		endTime = System.nanoTime();
		System.out.println("Vector의 수행시간 : " + (endTime - startTime) + "ns");
		System.out.println();
		
		//ArrayList 수행시간
		startTime = System.nanoTime();
		for(int i = 0; i < su; i++) {
//			vos2.add(i+"");
			vos2.add(0+"");
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행시간 : " + (endTime - startTime) + "ns");
		System.out.println();
		
		//LinkedList 수행시간
		startTime = System.nanoTime();
		for(int i = 0; i < su; i++) {
//			vos3.add(i+"");
			vos3.add(0+"");
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행시간 : " + (endTime - startTime) + "ns");
		System.out.println();
		
		
	}

}
