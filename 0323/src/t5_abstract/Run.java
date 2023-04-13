package t5_abstract;

public class Run {
	public static void main(String[] args) {
		// Animal animal = new Animal();
		
		Cat cat = new Cat();
		
		System.out.println(cat.animalName);
		cat.sound();
		
		Dog dog = new Dog();
		System.out.println(dog.animalName);
		dog.sound();
	}
}
