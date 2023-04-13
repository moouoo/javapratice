package t1;

//	1~100까지의 숫자 중 홀수와 짝수의 합을 각각 구하시오
public class Test1 {
	public static void main(String[] args) {
		int i;
		int odd = 0;
		int even = 0;
		int sw = 0;
		
		for(i = 0; i<=100; i++) {
			if(sw == 0) {
				odd = odd + i;
				sw = 1;
			}
			else {
				even = even + i;
				sw = 0;
			}
		}
		
		System.out.println("1~100 까지의 홀수 합은 "+even+"이다.");
		System.out.println("1~100 까지의 짝수 합은 "+odd+"이다.");
		
	}	
}
