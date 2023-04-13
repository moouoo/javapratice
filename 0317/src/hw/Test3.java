package hw;

//	1~99까지의 수중 3/6/9 게임에서 박수를 쳐야하는 경우를 순서대로 출력하시오.
public class Test3 {
	public static void main(String[] args) {
		
	int su = 0;
	
	for(int  i = 0; i < 10; i++) {
		for(int j = 0; j < 10; j++) {
			if(i == 3 || i == 6 || i == 9) {
				System.out.print("짝");
			}
			if(j == 3 || j == 6 || j == 9) {
				System.out.print("짝");
			}
			System.out.print(i + "" + j);
			su++;
			System.out.print("\t");
			if(su == 5) {
				System.out.println();
				su = 0;
			}
		}
	}
	
	}
}
		


