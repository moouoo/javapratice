package t1;


//	-1/2 + 2/3 - 3/4 + 4/5 .... - 9/10
public class Test3 {
	public static void main(String[] args) {
		
		int i;
		double tot = 0;
		int sign = 1;
		
		for(i = 0; i<=9; i++) {
			sign = sign * (-1);
			tot = tot + (double)(i) / (i + 1) * sign;
		}
		
		System.out.println(tot);
		System.out.printf("%.2f", tot);
//		ptntf가 무더라...?
	}
}
