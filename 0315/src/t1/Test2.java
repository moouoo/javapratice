package t1;


//	1-2+3-4+5...+9-10을 구하는 방법
public class Test2 {
	public static void main(String[] args) {
		
		int i;
		int sign = -1;
		int tot = 0;
		
		for(i = 1; i <= 10; i++) {
			sign = sign * (-1);
			tot = tot + i * sign;
		}
		
		System.out.println(tot);
		
	}
}
