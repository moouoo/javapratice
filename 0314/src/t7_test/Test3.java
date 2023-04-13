package t7_test;

// 1~100 까지의 홀수 합구하기 2500
public class Test3 {
	public static void main(String[] args) {
		
		int i = 1;
		int tot = 1;
		
		while(i < 99) {
		i = i + 2; // i++, ++i, i+=1
		tot = tot + i; // tot += i
		}
	System.out.println("1~100까지의 합은 "+tot+ "입니다.");
	
	
	
	
	
}
}
