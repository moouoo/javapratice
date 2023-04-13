package t1_inheritance;

public class B extends A{
	
	int su1 = 100;
	
	public void methoB() {
		System.out.println("su1 : " + su1);
		System.out.println("item1 : " + item1);
		System.out.println("item2 : " + item2);
	}
	
	public void methoB2() {
		item1 = 10000;
		item2 = 20000;
		System.out.println("su1 : " + su1);
		System.out.println("item1 : " + item1);
		System.out.println("item2 : " + item2);
	}
}
