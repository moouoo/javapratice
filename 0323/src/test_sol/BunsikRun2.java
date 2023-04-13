package test_sol;

public class BunsikRun2 {
	public static void main(String[] args) {
//		WangjaBunsik b1 = new WangjaBunsik();
//		SeoulBunsik b2 = new SeoulBunsik(); 
//		WoojuBunsik b3 = new WoojuBunsik();
		
		//1
//		Bonsa b1 = new WangjaBunsik();
//		Bonsa b2 = new SeoulBunsik(); 
//		Bonsa b3 = new WoojuBunsik();
		
		//2
		Bonsa[] bunsik = {new WangjaBunsik(), new SeoulBunsik(), new WoojuBunsik()};
		
		for(int i = 0; i < bunsik.length; i++) {
			bunsik[i].shopName();
			bunsik[i].kimchi();
			bunsik[i].budea();
			bunsik[i].bibim();
			bunsik[i].sundea();
			bunsik[i].konggi();
			System.out.println();
		}
		
		
//		b1.shopName();
//		b1.kimchi();
//		b1.budea();
//		b1.bibim();
//		b1.sundea();
//		b1.konggi();
//		System.out.println();
//				
//		b2.shopName();
//		b2.kimchi();
//		b2.budea();	
//		b2.bibim();
//		b2.sundea();
//		b2.konggi();
//		System.out.println();			
//				
//		b3.shopName();
//		b3.kimchi();
//		b3.budea();
//		b3.bibim();
//		b3.sundea();
//		b3.konggi();
//		System.out.println();		
				
				
		
	}
}
