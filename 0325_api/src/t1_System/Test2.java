package t1_System;

public class Test2 {
	
	public static void main(String[] args) {
		long startTime, endTime;
		
		startTime = System.nanoTime();
		long tot = 0;
		for(int i = 1; i <= 1000000; i++) {
			tot += i;
		}
		System.out.println("1~1000000까지의 합: "+ tot);
		endTime = System.nanoTime();
		
		System.out.println("께산에 걸린시간? " + (endTime - startTime));
	}
}
