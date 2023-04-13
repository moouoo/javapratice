package t6_whileTest;

public class Test3 {
	public static void main(String[] args) {
		
		int i = 1;
		boolean run = true;		
		
		while(run) {
			System.out.println(i + " : 안녕!");
			if(i == 5) run = false;
			i++;
		}
		
	}
}
