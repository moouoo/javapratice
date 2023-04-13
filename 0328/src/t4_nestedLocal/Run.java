package t4_nestedLocal;

public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		System.out.println("Aa객체의 A필드 : " + aa.suA);
		aa.methodA1();
		System.out.println("===========================");
		
		aa.methodA2();
	}
}
