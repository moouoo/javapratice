package t2_arrayTest;

public class Test2 {
	public static void main(String[] args) {
		
		int[] su1 = {10,20,30,40,50};
		int[] su2 = new int[5];
		
		// 원본자료
		System.out.print("원본자료 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i] + " ");
		}
		System.out.println();
		
		// 배열복사 : arraycopy(원본배열명, 원본시작인덱스, 복사할배열명, 복사받을인덱스, 복사할 요소의 개수)
		System.arraycopy(su1, 0, su2, 0, su1.length);
		
		
		// 복사된자료
		System.out.print("복사자료 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
		System.out.println();
		
		//	향상된 for문을 이용한 su2배열갑을 출력하시오
		//	향상된 for문 : for(타입  변수 : 객체명) -> 예제 0316/t2/t5
		for(int s : su2) {
			System.out.print(s + " ");
		}
	}
}
