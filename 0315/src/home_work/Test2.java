package home_work;

//	두 개의 주사위를 던져서 그 합이 5가 나올 경우를 모두 출력하시오
//1,4
//2,3
//3,2
//4,1

public class Test2 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=6; i++) {
			for(int j = 1; j <= 6; j++) {
				sum = i + j;
				
				if(sum == 5) {
					System.out.println("두 개의 주사위를 던져 그 합이 5가 나오는 경우는 : "+i+", "+j);
				}
			}
		}
		
	}
}
