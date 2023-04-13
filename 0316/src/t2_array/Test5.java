package t2_array;

//	향상된 for문 : for(타입  변수 : 객체명) {}
public class Test5 {
	public static void main(String[] args) {
		
		//선언
		int[] atom = new int[5];
		
		//입력
		for(int i=0; i<atom.length; i++) {
			atom[i] = (i+1) * 10;
		}
		
		//출력
		for(int i=0; i<atom.length; i++) {
		System.out.print(atom[i] + " / ");
		}
		System.out.println("\n==================================");
		
		for(int a : atom) {
			System.out.print(a + " / ");
		}
		
		System.out.println("\n==================================");
		
		for(int a : atom) {
			if(a % 3 != 0) System.out.print(a + " / ");
		}
		System.out.println("\n작업끝!");
	}
}
