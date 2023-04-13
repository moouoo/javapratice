package test;

public class BunsikRun {
	public static void main(String[] args) {
		WangjaBunsik b1 = new WangjaBunsik("1호점");
			b1.did();
			b1.kimchi();
			b1.budea();
			b1.bibim();
			b1.sundea();
			b1.konggi();
			System.out.println();
			
			WoojuBunsik b2 = new WoojuBunsik("대학가에 매장 2호점");
			b2.did();
			b2.kimchi();
			b2.budea();
			b2.bibim();
			b2.sundea();
			b2.konggi();
			System.out.println();
			
			SeoulBunsik b3 = new SeoulBunsik("증권가에 매장 3호점");
			b3.did();
			b3.kimchi();
			b3.budea();
			b3.bibim();
			b3.sundea();
			b3.konggi();
	}	
}