package t1_polymorphism;

public class Run {
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println("cat.b : " + cat.b);
		System.out.println("cat.a : " + cat.a);
		cat.methodCat();
		cat.methodAnimal();
		System.out.println();
		
		Animal cat2 = cat;
		//System.out.println("cat.b : " + cat2.b);
		System.out.println("cat.a : " + cat2.a);
		//cat2.methodCat();
		cat2.methodAnimal();
		System.out.println();
	}
}
