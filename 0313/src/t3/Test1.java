package t3;

public class Test1 {
	
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 20;
		int res, na;
		
		res = su1 / 3;
		
		System.out.println("su1 / 3 = " + (su1 / 3));
		System.out.println("res = " + res);
		
		System.out.println("su2 / 3 = " + (su2 / 3));
		System.out.println("su2 / 3 = " + ((double)su2 / 3));
		System.out.println("su2 / 3 = " + (su2 / 3.0));
		
		na = su1 - ((su1/3)*3); // 나머지 구하는 방식
		System.out.println("1.na : " + na);
		
		na = su1 % 3; // 나머지 구하는 방식
		System.out.println("2.na : " + na);
	}
	
}
