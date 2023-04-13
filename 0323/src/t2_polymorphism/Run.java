package t2_polymorphism;

public class Run {
	public static void main(String[] args) {
		//잘됨!-상속
//		Bb b = new Bb();
//		System.out.println("b.b : " + b.b);
//		System.out.println("b.a : " + b.a);
//		b.methodB();
//		b.methodA();
//		
//		Dd d = new Dd();
//		System.out.println("d.d : " + d.d);
//		System.out.println("d.b : " + d.b);
//		System.out.println("d.a : " + d.a);
		
		// 상속타입변환 - 교재 306쪽
//		Bb b = new Bb();
//		Aa ba = b;
//		//System.out.println("ba.b : " + ba.b);
//		System.out.println("ba.a : " + ba.a);
//		//ba.methodB();
//		ba.methodA();
//		
//		Dd d = new Dd();
//		Bb db = d;
//		//System.out.println("db.d : " + db.d);
//		System.out.println("db.b : " + db.b);
//		System.out.println("db.a : " + db.a);
//		db.methodB();
//		db.methodA();
//		//db.methodD();
//		System.out.println();
		
		
		Dd d = new Dd();
		Aa da = d;
		//System.out.println("da.d : " + da.d);
		//System.out.println("da.b : " + da.b);
		System.out.println("da.a : " + da.a);
		//da.methodB();
		da.methodA();
		//da.methodD();
		System.out.println();
		
		Cc c = new Cc();
		System.out.println("c.c : c" + c.c);
		System.out.println("c.a : a" + c.a);
		//System.out.println("c.b : b" + c.b);
		System.out.println();
		
		Aa ca = c;
		//System.out.println("ca.c : c" + ca.c);
		System.out.println("ca.a : a" + ca.a);
		//System.out.println("ca.b : b" + ca.b);
		System.out.println();
		
		//Bb cb = c;
		
		Ee e = new Ee();
		System.out.println("e.e : " + e.e);
		//System.out.println("e.b : " + e.b);
		System.out.println("e.a : " + e.a);
		System.out.println("e.c : " + e.c);
		System.out.println();
		
		Cc ec = e;
		//System.out.println("ec.e : " + ec.e);
		System.out.println("ec.c : " + ec.c);
		//System.out.println("ec.b : " + ec.b);
		System.out.println("ec.a : " + ec.a);
		System.out.println();
		
		//Bb ed = e;
		//Dd ed = e;
	}
}
