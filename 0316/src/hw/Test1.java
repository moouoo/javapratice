package hw;

//	ppt 7번 주어진 배열의 항목에서 최대값을 구하여라.(for문 사용)
public class Test1 {

	public static void main(String[] args) {
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
				
		for(int i =0 ; i<5; i++) {
			if(array[i] > max) max = array[i];
		}
		
		System.out.println("max: " + max);
		
	}

}
