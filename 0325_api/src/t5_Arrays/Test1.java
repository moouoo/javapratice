package t5_Arrays;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		int[] arrs = {1, 2, 3, 4, 5, 6};
		int cnt = 0;
		System.out.println("원본자료 : ");
		for(int arr : arrs) {
			System.out.print("arrs["+cnt+"]= "+ arr + " / ");
			cnt++;
		}
		System.out.println();
		
		Arrays.sort(arrs); // -> 배열정렬, 오름차순으로!
		System.out.println("정렬자료 : ");
		for(int i = 0; i < arrs.length; i++) {
			System.out.print("arrs["+i+"]= "+ arrs[i] + " / ");
		}
		
	}

}
