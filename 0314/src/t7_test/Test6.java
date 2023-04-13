package t7_test;

/*1~100까지의 합을 구하되, 각 10항이 될 때마다 그 합을 출력하시오.
1 ~ 10 : 55
1 ~ 20 : 210
1 ~ 30 : ...
...
1 ~ 100 : 5050
*/
public class Test6 {
	public static void main(String[] args) {
		int i=0, tot = 0;
		while(i < 100) {
			i = i + 1;
			tot = tot + i;   // tot += i;
			if(i % 10 != 0) continue;
			System.out.println("1 ~ "+i+"까지의 합은 "+tot+"입니다.");
		}
	}
}
