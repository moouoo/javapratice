package t1_array;

public class Test7 {
	public static void main(String[] args) {
		
		int[] intvar = new int[5];
		
		for(int i=0; i<5; i++) {
			intvar[i] = (i + 1) * 10;
		}
		for(int i=0; i<5; i++) {
		System.out.println("intvar["+i+"]" + intvar[i]);
		}
	}
}
