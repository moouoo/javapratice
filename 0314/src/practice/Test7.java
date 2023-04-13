package practice;

/*
 	1~100까지의 합을 구하되, 아래와 같이 처리하시오.
 	1~10 : 55
 	11~20 : ?
 	21~30 : ?
 	31~40 : 
 	...
 	91~100:
 */
public class Test7 {
	public static void main(String[] args) {

		int sum = 0;
		int i;
	
		for(i = 0; i <= 100; i++) {
			sum += i;
			if(i % 10 != 0);
			continue;
		}		
		System.out.println(i-9 + "~" + i + "까지의 합은 " + sum + "입니다.");

	}
}
