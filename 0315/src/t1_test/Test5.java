package t1_test;

public class Test5 {
	public static void main(String[] args) {
		
		//구구단하기
		for(int dan=1; dan<=3; dan++) {
			System.out.println("*"+dan+"단*");
			for(int i = 1; i<=9; i++) {
				System.out.println(dan+" * "+i+" = " + dan*i);
			}
			System.out.println();
		}
		
	}
}
